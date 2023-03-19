import java.io.*;
import java.util.Scanner;

public class pq2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to check for even number");
        int a = sc.nextInt();
        boolean result = isEven(a);

        if(result == true)
        {
            System.out.println("The number "+ a +" is an Even Number");
        }
        else
        {
            System.out.println("The number "+ a +" is an Odd Number");
        }
    }

    public static boolean isEven(int n)
    {
        if(n % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}