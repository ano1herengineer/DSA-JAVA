import java.io.*;
import java.util.*;

public class substring
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string followed by starting index and ending index");
        String str = sc.nextLine();
        int si = sc.nextInt();
        int ei = sc.nextInt();
        System.out.println(substring(str, si, ei)); //instead of using this in Java there is a method that does the same work 
        System.out.println(str.substring(0,4));   // eg - stringname.substring(strating index, ending index)
        
    }

    public static String substring(String str, int si, int ei)
    {
       
        String substr = "";
        for(int i=si; i<ei; i++)
        {
            substr += str.charAt(i);
        }
        return substr;
    }
}

