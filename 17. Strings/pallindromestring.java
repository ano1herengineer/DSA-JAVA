import java.io.*;
import java.util.*;

public class pallindromestring
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word to check for pallindrome");
        String word = sc.next();
        System.out.println(isPallindrome(word));
    }

    public static boolean isPallindrome(String word)  //time complexity = O(n)
    {
        int n = word.length();
        for(int i =0; i<n/2; i++)
        {
            if(word.charAt(i) != word.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
}