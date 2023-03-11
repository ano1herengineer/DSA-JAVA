import java.io.*;
import java.util.Scanner;

public class primeno
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();

        boolean isPrime = true;
        if(n==2)
        {
            System.out.println(" The number 2 is a Prime Number");
        }
        else
        {
             for(int i = 2; i<=Math.sqrt(n) ; i++)
        {
            if(n % i == 0) // n is a multiple of i (i not equal to 1 or n )
            {
                isPrime = false;
            }
        }
        if(isPrime == true)
        {
            System.out.println("The number " + n +" is a Prime Number ");
        }
        else
        {
            System.out.println("The number " + n +" is not a Prime Number ");
        }
        }

        
    }
}