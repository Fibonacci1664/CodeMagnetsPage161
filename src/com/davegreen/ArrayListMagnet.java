package com.davegreen;

import java.util.ArrayList;

/**
 * Created by Dave on 23/07/2017.
 */
public class ArrayListMagnet
{
    ArrayList<String> a = new ArrayList<String>();
    
    public static void printAL(ArrayList<String> al)
    {
        for (String elememt: al)
        {
            System.out.print(elememt + " ");
        }
    
        System.out.println(" ");
    }
}
