// program to find out that a number is pallindrome or not 

import java.io.*;
import java.util.Scanner;

public class pq3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check palindrome");
        int num = sc.nextInt();
        boolean result = isPallindrome(num);

        if(result == true)
        {
            System.out.println("The number "+ num +" is a Pallindrome Number");
        }
        else
        {
            System.out.println("The number "+ num +" is not a Pallindrome Number");
        }


    }

    public static boolean isPallindrome(int n)
    {
        int temp = n;
        int reverse = 0;
        while (temp != 0)
        {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        // if the original and reverse number is equal than pallindrome
        if(n == reverse)
        {
            return true;
        }
        return false;

    }
}