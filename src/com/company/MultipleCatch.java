package com.company;

public class MultipleCatch {
    public static void main(String args[])
    {
        try
        {

            int b[]=new int[5];
            b[7]=10;
            int a=50/0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
System.out.println(" arithmetic exception occurs");
        }

    }
}
