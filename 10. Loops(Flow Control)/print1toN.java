import java.io.*;
import java.util.Scanner;

public class print1toN
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N= sc.nextInt();
        int counter = 1;

        while(counter <= N)
        {
            System.out.print(counter +" ");
            counter++;
        }
        
    }
}