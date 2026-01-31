package DB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Binding {

    protected String bindType;

    protected String valString;
    protected int valInt;


    public Binding(String valString) {
        this.bindType = "STRING";
        this.valString = valString;
    }

    public Binding(int valInt) {
        this.bindType = "INTEGER";
        this.valInt = valInt;
    }

    public void prepare(int index, PreparedStatement ps ) throws SQLException {
        switch (this.bindType)
        {
            case "STRING":
                ps.setString(index, this.valString);
        }
    }

    @Override
    public String toString() {
        return "Binding{" +
                "bindType='" + bindType + '\'' +
                ", valString='" + valString + '\'' +
                ", valInt=" + valInt +
                '}';
    }
}
