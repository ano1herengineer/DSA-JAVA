import java.io.*;
import java.util.Scanner;

public class parafunction
{
    public static int calculateSum(int num1, int num2) // function with parameter i.e a and b 
    {                                                  // num1 and num2 are parameters or formal parameter
        int sum = num1 + num2;
        return sum;
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two values to calculate sum ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // function call  (a,b are called arguments or actual parameter)
        System.out.println("Sum is : " + sum);
    }
}