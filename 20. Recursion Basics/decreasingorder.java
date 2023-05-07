// print numbers from n to 1 in decreasing order using Recursion

public class decreasingorder
{
    public static void main(String args[])
    {
        int n = 10;
        printDec(n);
    }

    public static void printDec(int n)
    {
        //Base Case
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
}