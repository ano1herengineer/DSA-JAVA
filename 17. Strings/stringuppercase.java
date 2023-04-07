import java.io.*;
import java.util.*;

public class stringuppercase
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your sentence");
        String str = sc.nextLine();
        System.out.println(toUpperCase(str));

    }

    public static String toUpperCase(String str)  //timr complexity = O(n)
    {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i =1; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ' && i<str.length() - 1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
              sb.append(str.charAt(i));  
            }
        }

        return sb.toString();
    }
}