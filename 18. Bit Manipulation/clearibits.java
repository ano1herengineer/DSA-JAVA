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