import java.util.*;

public class largest3
{
    public static void main(String args[])
    {
        int A = 140, B = 242 , C = 69;

        if((A>=B) && (A>=C))
        {
            System.out.println("A is the largest");
        }
        else if (B>=C)
        {
            System.out.println("B is the largest");
        }
        else
        {
            System.out.println("C is the largest");
        }
    }
}