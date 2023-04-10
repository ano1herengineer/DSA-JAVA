import java.io.*;
import java.util.*;

public class clearibits
{
    public static void main(String args[])
    {
        System.out.println(clearIBits(15, 2));
    }

    public static int clearIBits(int n, int i)
    {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
}

// eg 15 = 1111 
// as i = 2 i.e 
// the number will become 1000