package Utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class TableRow {

    private ArrayList<String> columns = new ArrayList<>();

    public TableRow(String... columns) {
        this.columns.addAll(Arrays.asList(columns));
    }

    public void addColumn(String column) {
        this.columns.add(column);
    }

    public int getWidth()
    {
        return this.columns.size()*15+1;
    }

    /**
     * Get how many Columns exists
     * @return
     */
    public int count()
    {
        return this.columns.size();
    }

    /**
     * Width of each Column
     * @param pos
     * @return
     */
    public int getWidthAt(int pos)
    {
        try{
            return this.columns.get(pos).length();
        }catch (NullPointerException e){
            return 0;
        }
    }

    public void print(ArrayList<Integer> widths, int expectedCols) {
        System.out.print("|");
        for (int i = 0; i < expectedCols; i++) {
            String cell = (i < columns.size()) ? columns.get(i) : "";

            // Si es la última columna de esta fila (según lo que realmente tiene)
            if (i == columns.size() - 1 && columns.size() < expectedCols) {
                // calcular espacio restante
                int remaining = 0;
                for (int j = i; j < expectedCols; j++) {
                    remaining += widths.get(j) + 3; // espacio + contenido + espacio
                }
                System.out.printf(" %-" + (remaining - 3) + "s |", cell);
                break; // ya hemos llenado hasta el final
            } else {
                System.out.printf(" %-" + widths.get(i) + "s |", cell);
            }
        }
        System.out.println();
    }

}
