package com.darkredgm.utilitiesmc;

import java.util.ArrayList;

public class MCBox {

    ArrayList<String> items = new  ArrayList<>();

    public void add( String item )
    {
        items.add(item);
    }


    public void print()
    {
        int maxSize = 30;

        for ( String item: items )
        {
            if ( item.length() > maxSize )
            {
                maxSize = item.length() + 6;
            }
        }

        for (int i = 0; i < maxSize; i++)
            System.out.print("-");
        System.out.println();

        for ( String item: items )
        {
            System.out.printf("| %-"+(maxSize - 3)+"s |\n", item);
        }

        for (int i = 0; i < maxSize; i++)
            System.out.print("-");
        System.out.println();
    }
}
