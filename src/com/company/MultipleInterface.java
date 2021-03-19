package com.company;
interface Faculty
{
    public default void clgname()
    {
        System.out.println(" College name is kasturba degree college");
    }
void eat();
void leave();
void teach();
}
interface Student
{
void eat();
void leave();
void classes();
}
class MultipleInterface implements  Faculty,Student{
    public void eat()
    {
        System.out.println("Both Faculty and students can have lunch at 12:30pm ");
    }
    public void leave()
    {
        System.out.println("Both faculty and students should leave at 3:00pm");
    }
    public void teach()
    {
        System.out.println(" The teaching for faculty starts at 9:00am");
    }
    public void classes()
    {
        System.out.println("The classes for students starts at 9:00am");
    }
    public static void main(String args[])
    {
        MultipleInterface m=new MultipleInterface();
        m.clgname();
        m.eat();
        m.leave();
        m.teach();
        m.classes();
    }
}
