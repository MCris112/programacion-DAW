package DB;

import DB.Contracts.DatabaseEnv;
import DB.Exceptions.CannotSetAttributeOnModel;

import java.sql.ResultSet;

import java.lang.reflect.Field;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public abstract class Model<M extends Model<M>> implements DatabaseEnv {

    protected QueryBuilder<? extends Model<?>> query;

    @SuppressWarnings("unchecked")
    public Model() {
        this.query = (QueryBuilder<M>) new QueryBuilder(this);
    }

    private String toCamelCase(String columnName) {
        String[] parts = columnName.toLowerCase().split("_");
        StringBuilder camel = new StringBuilder(parts[0]);  // First lowercase

        for (int i = 1; i < parts.length; i++) {
            String part = parts[i];
            if (!part.isEmpty()) {
                camel.append(part.substring(0, 1).toUpperCase())
                        .append(part.substring(1));
            }
        }
        return camel.toString();
    }

    protected abstract M newModel();

    @SuppressWarnings("unchecked")
    public QueryBuilder<M> query() {
        return (QueryBuilder<M>) query;
    }

    public static <M extends Model> QueryBuilder query(Class<M> modelClass) {
        try {
            M instance = (M) modelClass.getDeclaredConstructor().newInstance();
            return instance.query();
        } catch (Exception e) {
            throw new RuntimeException("Cannot create " + modelClass.getSimpleName(), e);
        }
    }

    public void fromSqlResult(ResultSet result) throws SQLException {
        ResultSetMetaData meta = result.getMetaData();
        int columnCount = meta.getColumnCount();

        // Iterate ONE row (assume single result or call per row)
        for (int i = 1; i <= columnCount; i++) {
            String columnName = this.toCamelCase(meta.getColumnLabel(i));
            Object value = result.getObject(i);
            // Find matching field by name (camelCase or snake_case)
            Field field = findField(columnName);
            if (field != null) {
                try {
                    field.setAccessible(true);

                    // Type conversion (simple)
                    Class<?> fieldType = field.getType();
                    if (fieldType == int.class || fieldType == Integer.class) {
                        field.set(this, ((Number) value).intValue());
                    } else if (fieldType == String.class) {
                        field.set(this, value != null ? value.toString() : null);
                    } else {
                        field.set(this, value);  // Other types
                    }
                } catch (IllegalAccessException e) {
                    throw new CannotSetAttributeOnModel( field.getName() );
                }
            }
        }
    }

    private Field findField(String columnName) {
        for (Field field : this.getClass().getDeclaredFields()) {
            String fieldName = field.getName();
            if (fieldName.equals(columnName)) {
                return field;
            }
        }
        return null;
    }
}