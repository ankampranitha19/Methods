package com.company;

public class ClassNotFound {
    public static void main(String args[])
    {
        try
        {
            Class.forName("abc");
        }
        catch(ClassNotFoundException e)
        {
System.out.println(e);


        }
    }
}
