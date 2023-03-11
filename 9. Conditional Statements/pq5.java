import java.io.*;
import java.util.Scanner;

public class pq5
{
   public static void main(String args[])
   {
        // program to check whether the year is leap year or not 
       Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();
       
       if (year % 4 == 0)
       {
        if (year % 100 == 0)
        {
            if (year % 400 == 0)
            {
                System.out.println("LEAP YEAR");
            }
        }
        else
        {
            System.out.println("LEAP YEAR");
        }
       }
       else
       {
        System.out.println("Not a LEAP YEAR");
       }

   }
}