import java.io.*;
import java.util.*;

public class clearrangebits
{
    public static void main(String args[])
    {
        System.out.println(clearIBitsinRange(10, 2, 4));
    }
    public static int clearIBitsinRange(int n ,int i, int j )
    {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
}

//expected output = 2