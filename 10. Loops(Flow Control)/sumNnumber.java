import java.io.*;
import java.util.Scanner;

public class sumNnumber
{ // program to print sum of N Natural Number
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N= sc.nextInt();
        int sum =0;
        int i = 1;

        while( i<=N )
        {
            sum = sum + i;
            i++;
            
        } 
        System.out.println("The sum of "+ N +" natural number is "+ sum );
        
    }
}