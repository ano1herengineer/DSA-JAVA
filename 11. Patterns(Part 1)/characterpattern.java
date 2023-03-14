import java.io.*;

// program to print the character pattern

// A
// B C
// D E F
// G H I J

public class characterpattern
{
    public static void main(String args[])
    {
        char ch = 'A';
        int n = 4;
           
           // outer loop
        for(int i=1; i<=n; i++)
        {
            //inner loop
            for(int j=1; j<=i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}