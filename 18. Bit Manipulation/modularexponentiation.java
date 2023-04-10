// Modular Exponentiation in Java

// Given three numbers x, y and p, compute (xy) % p. 

// Examples : 

// Input:  x = 2, y = 3, p = 5
// Output: 3
// Explanation: 2^3 % 5 = 8 % 5 = 3.

// Input:  x = 2, y = 5, p = 13
// Output: 6
// Explanation: 2^5 % 13 = 32 % 13 = 6.

import java.io.*;

public class modularexponentiation
{
    public static void main(String args[])
    {
         System.out.println(power(2,3,5));
    }

    public static int power(int x, int y, int p)
    {
        int res = 1; //Initialize result 

        while(y > 0)
        {
            //If y is odd, multiply x with result
            if((y & 1) != 0)
            {
              res = res * x;
            }
         //y must be even now 
          y = y>> 1;   // y =y/2
          x = x * x;   // change x to x^2     
        }
        return res % p;
    }
}