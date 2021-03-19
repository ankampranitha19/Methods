package com.company;

public class Hash
{
    public static void main(String args[]) {
        String a = "200";
        String b = "200";
        if (a.equals(a))
        {
            System.out.println("Equal variables");
            System.out.println(a.hashCode() + "\n" +b.hashCode());
        }
        String x="30";
        String y="20";
        if(!x.equals(y))
        {
            System.out.println("unequal variables");
            System.out.println(x.hashCode() + "\n" +y.hashCode());
        }
    }
}
