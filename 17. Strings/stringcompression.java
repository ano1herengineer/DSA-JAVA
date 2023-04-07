import java.io.*;
import java.util.*;

public class stringcompression
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String str = sc.nextLine();
        System.out.println(compress(str));

    }

    public static String compress(String str)  // time complexity = O(n)
    {
        String newStr = "";

        for(int i =0; i<str.length(); i++)
        {
            Integer count = 1;
            while(i<str.length() - 1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }
            newStr +=str.charAt(i);
            if(count > 1)
            {
                newStr += count.toString();
            }
        }
        return newStr;

    }
}


//Program using String Builder 

// import java.io.*;
// import java.util.*;

// public class stringcompression {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your string:");
//         String str = sc.nextLine();
//         System.out.println(compress(str));
//     }

//     public static String compress(String str) {  
//         StringBuilder newStr = new StringBuilder();
//         for (int i = 0; i < str.length(); i++) {
//             int count = 1;
//             while (i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) {
//                 count++;
//                 i++;
//             }
//             newStr.append(str.charAt(i));
//             if (count > 1) {
//                 newStr.append(count);
//             }
//         }
//         return newStr.toString();
//     }
// }


// The main changes are:

// Declare newStr as a StringBuilder instead of a String.
// Instead of using the += operator to concatenate strings, use the append() method of StringBuilder.
// Convert the count to a string using append() instead of toString().
// Return the final string by calling toString() on newStr.