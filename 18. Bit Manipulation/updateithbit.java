import java.io.*;
import java.util.*;

public class updateithbit
{
    public static void main(String args[])
    {
       System.out.println(updateIthBit(10, 2, 1));
       System.out.println(updateIthBIT(10, 2, 1));

    }

    public static int clearIthBit(int n, int i)
    {
        int bitMask = ~(1<<i);  // Complement of 1 left shift i
        return n & bitMask;     // n AND BITMASK 
    }

    public static int setIthBit(int n, int i)
    {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit)   // using clearBit ans setBit 
    {
        if(newBit == 0)
        {
            return clearIthBit(n, i);
        }
        else
        {
            return setIthBit(n, i);
        }
    }

    public static int updateIthBIT(int n, int i, int newBit) //different approach 
    {
        n = clearIthBit(n , i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }
}