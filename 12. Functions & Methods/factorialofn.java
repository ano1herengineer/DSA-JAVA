import java.io.*;
import java.util.Scanner;

public class factorialofn
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to calculate the factorial");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("factoial =" + fact);
    }

    public static int factorial(int n)
    {
        int f = 1;

        for(int i =1; i<=n; i++)
        {
            f = f * i; // factorial
        }
        return f;
        
    }
}