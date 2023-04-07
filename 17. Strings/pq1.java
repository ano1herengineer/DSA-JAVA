// Question1:Count how many times lower case vowels occurred in a String entered by the user.

import java.io.*;
import java.util.*;

public class pq1
{
    public static void main(String args[])
    {
        String str = new Scanner(System.in).nextLine();
        String test = str.toLowerCase();
        int count = 0;

        for(int i =0; i<test.length(); i++)
        {
            char ch = test.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        System.out.println("count of vowels is :" + count);
    }
}