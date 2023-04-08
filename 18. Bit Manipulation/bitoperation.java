import java.io.*;
import java.util.*;

public class bitoperation
{
    public static void main(String args[])
    {
        System.out.println(5 & 6); //BITWISE AND
        System.out.println(5 | 6); //BITWISE OR
        System.out.println(5 ^ 6); //BITWISE XOR
        System.out.println( ~5);  // ONE'S COMPLEMENT , but it is not correct actually 
        System.out.println( ~0);
        System.out.println( 5 << 2); //LEFT SHIFT (CP FORMULA = a<<b = a*2^b)
        System.out.println( 5 >> 2); //RIGHT SHIFT (CP FORMULA = a>>b = a/2^b)
    }
}