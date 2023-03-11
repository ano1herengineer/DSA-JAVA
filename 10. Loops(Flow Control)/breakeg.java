import java.io.*;

public class breakeg
{
    public static void main(String args[])
    {
        for(int i = 0; i<=5; i++)
        {
            if(i==4)
            {
                break;
                // illustration of what break statement does
                // it breaks the statement 
                // and cursor is moved outside
            }
            System.out.println(i);
        }
    }
}