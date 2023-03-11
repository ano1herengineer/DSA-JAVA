import java.io.*;
import java.util.Scanner;

public class switchcalculator 
{
    public static void main(String args[])
    {   System.out.println("Welcomme to your calculator");
        System.out.println("Enter your values followed by the operation you want to perform");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        

        switch(operator)
        {
            case '+':
            System.out.println(a+b);
            break;

            case '-':
            System.out.println(a-b);
            break;

            case '*':
            System.out.println(a*b);
            break;

            case '/':
            System.out.println(a/b);
            break;

            case '%':
            System.out.println(a%b);
            break;

            default:
            System.out.println("INVALID CHOICE");
        }
    }
}