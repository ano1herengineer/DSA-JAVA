// program to print the multiplication table of a number 

import java.io.*;
import java.util.Scanner;

public class pq4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter positive value of the number to get table");
        int num = sc.nextInt();

        if(num>0)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(num*i);
            }
        }
        else 
        {
            System.out.println("invalid");
        }
        
        
    }
}