// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.io.*;
import java.util.Scanner;

public class pq2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter the number");
            number = sc.nextInt();

            if(number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }
            System.out.println("Do you want to Continue ?");
            System.out.println("Press 1 for Yes and 2 for No");
            choice = sc.nextInt();

        }
        while(choice == 1);

        System.out.println("sum of even number : " + evenSum);
        System.out.println("sum of odd number : " + oddSum);
        

    }
}