//print the numbers in increasing order from 1 to n using recursion 
import java.util.*;

public class increasingorder
{
    public static void main(String args[])
    {
             Scanner sc = new Scanner(System.in);
             System.out.println("enter the last number");
             int n = sc.nextInt();
             printInc(n);
             
    }

    public static void printInc(int n)
    {
        if(n == 1)
        {
            System.out.print(n+" ");
            return;
        }
       printInc(n-1);
       System.out.print(n+" ");
    }
}