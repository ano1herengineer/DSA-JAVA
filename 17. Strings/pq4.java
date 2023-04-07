//Determine if 2 Strings are anagrams of each other

// ANAGRAM = If two Strings contain the same character but in different order, they can be said to be anagrams.
// eg = rece/care

import java.io.*;
import java.util.*;

public class pq4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words to check whether they are anagrams:");
        String str1 = sc.next();
        String str2 = sc.next();

        //Convert the Strings to LowerCase/UpperCase so that we don't need to check for two cases separately
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //First Check = if the lengths are the same
        if (str1.length() == str2.length()) {
            //convert strings into char array

            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sort the chararray
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //if the sorted char arrays are same or identical then the strings are anagrams
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " & " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " & " + str2 + " are not anagrams of each other.");
            }
        } else {
            System.out.println(str1 + " & " + str2 + " are not anagrams of each other.");
        }
    }
}
