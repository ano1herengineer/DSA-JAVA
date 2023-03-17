import java.io.*;

public class productofab
{
    public static void main(String args[])
    {
        int prod = multiply(3, 5);
        System.out.println("product of number = " + prod);
    }

    public static int multiply(int a, int b)
    {
        int product = a * b;
        return product;
    }
}