import java.io.*;

public class dowhilehello
{ // simple hello world program using do while loop to print 10 times 
    public static void main(String args[])
    {
        int counter = 0;

        do 
        {
            System.out.println("Hello World");
            counter++;
        } while( counter < 10 );
        
    }
}