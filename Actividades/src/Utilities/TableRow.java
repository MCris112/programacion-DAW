package Utilities;

public class TableRow {

    private String[] columns = {};

    public TableRow(String... columns) {
        this.columns = columns;
    }

    public int getWidth()
    {
        return this.columns.length*15+1;
    }

    public void print()
    {
        System.out.print("|");

        for (String column : columns)
        {
            System.out.printf(" %-"+13+"s |", column);

        }

        System.out.println();
    }
}
