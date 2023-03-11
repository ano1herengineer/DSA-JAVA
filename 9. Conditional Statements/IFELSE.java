import java.util.*;
public class IFELSE {

    public static void main(String args[])
    {
        int age = 25;
        if (age >= 18)
        {
            System.out.println("Adult : Voter,Can Drive");
        }
        else if( age > 13 && age < 18 )   // else if condition checked only if 1st if condition failed
         {
            System.out.println("Teenager");
         }
        else
        {
            System.out.println("Not Adult");
        }
    }
}