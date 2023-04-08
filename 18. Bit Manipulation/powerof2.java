// check if a number is power of 2 or not 

import java.io.*;

public class powerof2
{
    public static void main(String args[])
    {
        System.out.println(isPowerOfTwo(15));
    }
    public static boolean isPowerOfTwo(int n)
    {
        return (n &(n-1)) == 0;
    }
}