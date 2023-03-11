import java.io.*;
import java.util.Scanner;

public class breakquestion
{
    //print numbers until user enters a number multiple of 10
    public static void main(String arrgs[])
    {
        Scanner sc = new Scanner(System.in);

        do
        {   System.out.println("enter your number");
            int n = sc.nextInt();
            if(n%10 == 0)
            {
                break;
            }
            System.out.println(n);
        }
        while(true);
    }
}