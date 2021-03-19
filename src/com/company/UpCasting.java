package com.company;
import java.io.*;

class Parent {
    void show() {
        System.out.println("The parent method");
    }
}
    class Child extends Parent
    {
        void show()
        {
System.out.println("The child method");
        }
    }
    class Casting {

        public static void main(String args[]) {
            Parent c = new Child();
            c.show();
        }
    }

