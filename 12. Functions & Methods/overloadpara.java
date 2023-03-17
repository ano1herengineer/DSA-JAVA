// function overloading using number of parameter

import java.io.*;

public class overloadpara
{
    public static void main(String args[])
    {
        System.out.println(sum(5, 3));
        System.out.println(sum(5, 2, 1));
    }

    public static int sum(int a, int b) // sum function having 2 parameters 
    {
        return a+b;
    }

    public static int sum(int a, int b, int c) //sum function having 3 parameters
    {
        return a+b+c;
    }
}