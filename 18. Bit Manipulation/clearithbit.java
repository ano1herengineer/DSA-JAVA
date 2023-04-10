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


// 10 = 1010
// (1 << i) = where i =1 is 0010
// ~(1 << i) = 1101

// number & bitMask =    1010
//                    &  1101
//           Answer =    1000  i.e 8 in Decimal 