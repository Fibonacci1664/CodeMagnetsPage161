package com.davegreen;

public class Main
{
    
    public static void main(String[] args)
    {
        ArrayListMagnet arrayListMagnet = new ArrayListMagnet();
        
        arrayListMagnet.a.add(0, "zero");
        arrayListMagnet.a.add(1, "one");
        arrayListMagnet.a.add(2, "two");
        arrayListMagnet.a.add(3, "three");
        arrayListMagnet.printAL(arrayListMagnet.a);
        
        if (arrayListMagnet.a.contains("three"))
        {
            arrayListMagnet.a.add("four");
        }
        
        arrayListMagnet.a.remove(2);
        
        arrayListMagnet.printAL(arrayListMagnet.a);
        
        if (arrayListMagnet.a.indexOf("four") != 4)
        {
            arrayListMagnet.a.add(4, "4.2");
        }
    
        arrayListMagnet.printAL(arrayListMagnet.a);
    
        if (arrayListMagnet.a.contains("two"))
        {
            arrayListMagnet.a.add("2.2");
        }
    
        arrayListMagnet.printAL(arrayListMagnet.a);
    }
}
