package com.company;
import java.util.Scanner;
public class Instance {
    public static int show(int a, int b) {
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Instance i = new Instance();
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int x=s.nextInt();
        System.out.println("enter second number");
        int y=s.nextInt();
        System.out.println(" the sum of numbers is "   +i.show(x,y));
    }
}