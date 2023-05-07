import java.util.*;

public class sumn
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number to calculate sum of n numbers");
         int num = sc.nextInt();
         
         System.out.println(calcSum(num));

    }

    public static int calcSum(int n)
    {
        if(n == 1)  //Base Case 
        {
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

}