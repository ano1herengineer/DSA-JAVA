//program to calculate the fibonacci number 

import java.util.*;

public class fibonacci{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to calculate the nth fibonacci number");
        int n = sc.nextInt();
        System.out.println("Nth fibonacci number is = "+ fib(n));

    }

    public static int fib(int n)
    {
        //Base Case
        if(n == 0 || n ==1)
        {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
}