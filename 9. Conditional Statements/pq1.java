import java.io.*;
import java.util.Scanner;

public class pq1
{
    public static void main(String args[])
    {
        //program to check if a number is positive or negative
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number >= 0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}