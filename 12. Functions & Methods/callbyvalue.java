import java.io.*;
public class callbyvalue
{
      public static void main(String args[])
{
    int a = 5;
    int b = 10;
    swap(a, b); // the copy of a and b will be made during function call
}

public static void swap(int a, int b) // here the copy is made 
                                         // it is called call by value 
{
    // swap - exchange values 
    int temp = a;
     a = b;
     b = temp;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
}
}

