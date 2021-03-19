package com.company;
import java.io.*;
class Vehicle
{
    void petrol()
    {
        System.out.println(" The petrol is mandatory ");
    }
}
class Bike extends Vehicle
{
    void wheels()
    {
        System.out.println("Bike has 2 wheels");
    }
}
class DownCast
{
    public static void main(String args[])
{
    Vehicle v=  new Bike();
    v.petrol();
    Bike b = (Bike)v;
    b.wheels();
}
}
