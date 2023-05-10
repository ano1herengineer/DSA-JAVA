//program to print the x powern n using recursion

public class xn 
{
    public static void main(String args[])
    {
        System.out.println(power(2,10));   //expected output = 1024
    }

    public static int power(int x, int n)
    {
        //Base Case
        if(n == 0)
        {
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;

        //or we can use = return x * power(x, n-1)

    }
}