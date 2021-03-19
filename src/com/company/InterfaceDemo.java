package com.company;
interface Vechile{
    void bmw();
}

class Cars implements Vechile{

    public void bmw() {
        System.out.println("The bmw car cost 1 crore");
    }
}
class Bikes extends Cars {
    public void audi() {
        System.out.println("The audi cost 50 lakhs");
    }
}
class TestInterface1{
    public static void main(String args[]){
        Vechile v=new Cars();
        v.bmw();
        Vechile v1=new Bikes();
        ((Bikes) v1).audi();
    }

}