package com.company;
abstract class Car {
    abstract void name();
    abstract void milege();
    void petrol() {

        System.out.println("petrol is mandatory");
    }
}
    class bmw extends Car
    {
        void name() {
System.out.println(" Car name is BMW");
        }
        void milege(){
            System.out.println(" BMW milege is 60km");
        }
    }
    class Abstract
    {
        public static void main(String args[])
        {

            bmw b=new bmw();
            b.petrol();
            b.name();
            b.milege();
        }

    }


