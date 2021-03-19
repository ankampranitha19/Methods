package com.company;
public class Static
{

    public static int show(int num, int r)
     {
        while (num != 0) {
            int d = num % 10;
            r = r * 10 + d;
            num = num / 10;

        }
        return  r;
    }
    public  static void main(String[] args)
    {
        int d=show(456,0);
        System.out.println("the reverse number is " +d);

    }
}

