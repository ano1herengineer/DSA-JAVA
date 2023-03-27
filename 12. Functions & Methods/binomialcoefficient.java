import java.io.*;
import java.util.Scanner;

public class binomialcoefficient
{
    public static void main(String args[])
    {
         System.out.println(binCoeff(10, 2));
    }

    public static int factorial(int n)        //function to calculate factorial
    {
        int f = 1;

        for(int i =1; i<=n; i++)
        {
            f = f * i; // factorial
        }
        return f;

    }

    public static int binCoeff(int n, int r)   //function to calculate binomialCoefficient
    {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bin = fact_n / (fact_r * fact_nmr);
        return bin;

    }
}