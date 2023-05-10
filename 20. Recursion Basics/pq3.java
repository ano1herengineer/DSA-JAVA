//Write a program to calculate the Length of String using Recursion


public class pq3
{
    public static void main(String args[])
    {
        String str = "Prashant";
        System.out.println(length(str));
    }

    public static int length(String str)
    {
        //Base Case
        if(str.length() == 0)
        {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
}