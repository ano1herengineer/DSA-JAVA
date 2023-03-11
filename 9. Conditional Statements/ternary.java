import java.io.*;

public class ternary
{
    public static void main(String args[])
    {
        int number1 = 45;
        int number2 = 46;

        //using ternary operator to check whether the number is odd or even

        String type1 = ((number1%2) == 0 )? "Even" : "Odd";
        System.out.println("number 1 is " + type1);
        String type2 = ((number2%2) == 0 )? "Even" : "Odd";
        System.out.println("number 2 is " + type2);
    }
}