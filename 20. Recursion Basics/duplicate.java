// remove duplicates in a string 
import java.lang.*;

public class duplicate{
    public static void main(String args[])
    {
        // Input string
        String str = "apnacollege";
        // Call the removeDuplicates method with initial arguments
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[])
    {
        // Base Case: if the current index has reached the end of the string, print the new string without duplicates
        if(idx == str.length())
        {
            System.out.println(newStr); 
        }
        // Recursive case
        else if(idx < str.length())
        {
            // Get the current character
            char currChar = str.charAt(idx);
            // Check if the character has already been encountered
            if(map[currChar - 'a'] == true)
            {
                // If it has, move on to the next character
                removeDuplicates(str, idx+1, newStr, map);
            }
            else
            {
                // If it hasn't, add it to the new string and mark it as encountered
                map[currChar - 'a'] = true;
                removeDuplicates(str, idx+1, newStr.append(currChar), map);
            }
        }
    }
}
