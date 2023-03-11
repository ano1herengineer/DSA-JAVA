import java.io.*;
import java.util.Scanner;

public class continuequestion
{
    //print numbers except when user enters a number i.e multiple of 10
    public static void main(String arrgs[])
    {
        Scanner sc = new Scanner(System.in);

        do
        {   System.out.println("enter your number");
            int n = sc.nextInt();
            if(n%10 == 0)
            {
                continue;
            }
            System.out.println(n);
        }
        while(true);
    }
}