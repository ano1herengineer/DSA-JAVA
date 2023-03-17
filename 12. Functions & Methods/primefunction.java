import java.io.*;

public class primefunction
{     // only for n>=2
    public static boolean isPrime(int n)
    {
        //corner case 
        // n==2
        if(n==2)
        {
            return true;
        }
        boolean isPrime = true;
        for(int i =2; i<=n-1 ; i++)
        {
            if(n%i == 0) // completely dividing
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String args[])
    {
        System.out.println(isPrime(2));
    }
}