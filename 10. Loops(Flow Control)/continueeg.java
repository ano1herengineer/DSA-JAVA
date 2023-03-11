import java.io.*;

public class continueeg
{
    public static void main(String args[])
    {
        for(int i = 0; i<=5; i++)
        {
            if(i==4)
            {
                continue;
                // illustration of what continue statement does
                // it skips the iteration
                // and cursor is moved to next iteration
            }
            System.out.println(i);
        }
    }
}