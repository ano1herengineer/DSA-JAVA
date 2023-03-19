// Write a Java method to compute the sum of the digits in an integer

import java.io.*;
import java.util.Scanner;

public class pq5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an Integer : ");
        int digits = sc.nextInt();
        System.out.println("The sum of digit is : "+ sumDigits(digits));
    }

    public static int sumDigits(int n)
    {
        int sumOfDigits = 0;

        while(n>0)
        {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;


        }
        return sumOfDigits;
    }
}
