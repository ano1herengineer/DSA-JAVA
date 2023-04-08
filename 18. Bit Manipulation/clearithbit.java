import java.io.*;

public class clearithbit
{
    public static void main(String args[])
    {
        System.out.println(clearIthBit(10,1));
    }
    public static int clearIthBit(int n, int i)
    {
        int bitMask = ~(1<<i);  // Complement of 1 left shift i
        return n & bitMask;     // n AND BITMASK 
    }
}