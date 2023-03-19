import java.io.*;
import java.util.Scanner;

public class pq1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 values to calculate their average");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

         double ans = AVG3(x,y,z);
         System.out.println("the average value is " + ans);
    }

    public static double AVG3(double a, double b, double c )
    {
        double avg = (a+b+c)/3;
        return avg;
    }
}