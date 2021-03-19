import java.util.Scanner;

public class Userdefined {
    public static void main(String args[])
    {

     Scanner s =new Scanner(System.in);
     System.out.println(" Enter id  :");
     int a=s.nextInt();
     System.out.println("Enter name :");
     String b=s.next();
     System.out.println(" Enter salary");
     float c=s.nextFloat();
        System.out.println("The details are " +a+ " , " +b + " , " +c);
       int d=Employee(a,b,c);
        System.out.println("The bonus salary is " +d );

    }
    public static int Employee(int id, String name, float salary)
    {
        int bonus;
        bonus= (int) (salary+500);
        return bonus;
    }
}
