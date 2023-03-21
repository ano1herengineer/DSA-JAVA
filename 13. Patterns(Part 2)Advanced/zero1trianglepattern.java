import java.io.*;

public class zero1trianglepattern
{
    public static void main(String args[])
    {
       zero_one_triangle(5);
    }
    public static void zero_one_triangle(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if ((i+j)%2 == 0)
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}