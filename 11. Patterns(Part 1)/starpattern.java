import java.io.*;

//program to print star pattern using nested loop

// *
// **
// ***
// ****
// *****

public class starpattern
{
    public static void main(String args[])
    {
        for(int line = 1; line <= 5; line++)
        {
            for (int star =1; star <= line; star++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}