import java.util.*;

public class incometax
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        double tax = 0.0f;

        if (income <= 500000)
        {
            System.out.println("Tax ="+ tax);
        }

        else if (income >= 500000 && income <= 1000000)
        {
            tax = 0.2 * income ;
            System.out.println("Tax ="+ tax);
        }
        else
        {
            tax = 0.3 * income;
            System.out.println("Tax ="+ tax);
        }
    }
}