import java.io.*;
// program to print inverted star pattern

// ****
// ***
// **
// *

public class invertedstar
{
    public static void main(String args[])
    {
        int n = 4;

        for(int line =1; line<=n ; line++)
        {
            for(int star = 1 ; star <= n-line+1 ; star++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}