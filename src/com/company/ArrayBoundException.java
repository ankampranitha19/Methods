package com.company;

public class ArrayBoundException {
    public static void main(String args[])
    {
        try
        {
            int a[]=new int[5];
            a[10]=50;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println(e);
        }
        System.out.println("Array Index out of bound exception");
    }
}
