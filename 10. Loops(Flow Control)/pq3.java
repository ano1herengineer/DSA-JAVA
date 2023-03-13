// program to calculate the factorial of a number 

import java.io.*;
import java.util.Scanner;

public class pq3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("enter any positive integer to calculate the factorial");
        num = sc.nextInt();

        if (num == 0)
        {
            System.out.println("Factorial = 1");
        }
        else
        {
            for (int i =1; i<=num ; i++)
            {
                fact *= i;
            }
            System.out.println("Factorial = "+ fact);
        }

        
    }
}