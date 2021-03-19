package com.company;
public interface Hotel {
    void demo();
    void room();
}
interface Taj extends Hotel
{
    void Atomosphere();
}
class TestInterface implements Taj
{
    public void demo()
    {
        System.out.println("Taj hotel details:");
    }
    public void room()
    {
        System.out.println("1)Taj rooms are spaceious and comfortable for guests.");
    }
    public void Atomosphere()
    {
        System.out.println("2)Atmosphere in Taj is just like your home.");
    }
    public static void main(String args[])
    {
        TestInterface t=new TestInterface();
        t.demo();
        t.room();
        t.Atomosphere();

    }
}
