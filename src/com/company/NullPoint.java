package com.company;

public class NullPoint {
    public static void main(String args[]) {
        String s = null;
        try {
            if(s.equals("abc"))
            System.out.println("same");
else
    System.out.println("not same");

        } catch (NullPointerException e) {
            System.out.println("null point");

        }
    }
}
