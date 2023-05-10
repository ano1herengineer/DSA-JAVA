// program to calculate x to the power n in optimised way 
public class xnoptimised  //O(log n)
{
    public static void main(String args[])
    {
        int a = 2;
        int n = 5;
        System.out.println(optimizedPower(a, n));

    }

    public static int optimizedPower(int a, int n)
    {
        //Base Case
        if( n == 0)
        {
            return 1;
        }
      // int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2); if I use this the time complexity will remain same 
       int halfPower = optimizedPower(a, n/2);
       int halfPowerSq = halfPower * halfPower;
       
       // if n is odd
       if(n % 2 != 0)
       {
        halfPowerSq = a * halfPowerSq;
       }

       return halfPowerSq;
    }
}