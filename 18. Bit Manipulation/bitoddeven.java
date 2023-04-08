import java.io.*;
import java.util.*;

public class bitoddeven
{
    public static void main(String args[])
    {
        oddOrEven(3);
        oddOrEven(4);
        oddOrEven(16);
    }

    public static void oddOrEven(int n)
    {
        int bitMask = 1;
        if((n & bitMask) == 0)
        {
            //even number 
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }
}