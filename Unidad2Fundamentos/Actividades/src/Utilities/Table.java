package Utilities;

import java.util.ArrayList;

public class Table {

    private String title;

    private final ArrayList<TableRow> rows;


    public Table(String title)
    {
        this.title = title;
        this.rows = new ArrayList<TableRow>();
    }

    public void addRow(String... text)
    {
        rows.add( new TableRow(text) );
    }

    private void printLine(int size)
    {
        System.out.print("|");
        for(int i = 0; i < size; i++)
            System.out.print("-");
        System.out.println("|");
    }

    public void print()
    {
        int widthSize = 30;

        if(!this.rows.isEmpty())
        {
            widthSize = rows.getFirst().getWidth();
        }

        this.printLine( widthSize );
       for (TableRow row : rows)
       {
           row.print();
            this.printLine( widthSize );
       }
    }
}
