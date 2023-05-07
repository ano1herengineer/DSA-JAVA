// program to calculate the factorial of a number 
import java.util.*;

public class fact
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number to calculate the factorial");
         int num = sc.nextInt();
         
         System.out.println(factorial(num));

    }

    public static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn  = n * factorial(n-1);
        return fn;
    }
}
