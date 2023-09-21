// Decode a String

// We have an encoded string s and the task is to decode it. 
// The pattern of encoding is as follows:

// k[encoded_string] : Decode the encoded_string k times consecutively and return the decoded string.
// Example : 3[a]2[bc] -> aaabcbc

// Note : k is guaranteed to be a positive integer.

// Input : 3[a]2[bc]
// Output : aaabcbc

// Input : 3[a2[c]]
// Output : accaccacc

// Input : 2[abc]3[cd]ef
// Output : abcabccdcdcdef

// Input : abc3[cd]xyz
// Output : abccdcdcdxyz

import java.util.*;

class pq3
{
    public static void main(String args[])
    {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s)
    {
        Stack<Integer> num = new Stack<>(); // stack to store the number of times the string is to be decoded
        Stack<String> str = new Stack<>(); // stack to store the string
        String ans = "";
        int i = 0;
        while(i < s.length()) // iterating over the string
        {
            if(Character.isDigit(s.charAt(i))) // if the character is a digit then we push it into the stack
            {
                int count = 0; // initializing the count variable for the number of times the string is to be decoded
                while(Character.isDigit(s.charAt(i))) // iterating over the string till we encounter a character that is not a digit
                {
                    count = count * 10 + (s.charAt(i) - '0'); // calculating the number of times the string is to be decoded
                    i++; // incrementing the index
                }
                num.push(count); // pushing the count into the stack
            }
            else if(s.charAt(i) == '[') // if the character is '[' then we push the string into the stack
            {
                str.push(ans); // pushing the string into the stack
                ans = "";
                i++;
            }
            else if(s.charAt(i) == ']') // if the character is ']' then we pop the string and the number of times the string is to be decoded
            {
                StringBuilder sb = new StringBuilder(str.pop()); // initializing a string builder to store the string that is popped from the stack
                int count = num.pop();
                for(int j = 0; j < count; j++)
                {
                    sb.append(ans); // appending the string to the string builder
                }
                ans = sb.toString(); // converting the string builder to string
                i++;
            }
            else
            {
                ans += s.charAt(i); // if the character is not a digit or '[' or ']' then we append the character to the string
                i++;
            }
        }
        return ans;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)

// Approach followed : Stack
// We use two stacks, one to store the number of times the string is to be decoded and the other to store the string
// We iterate over the string and check if the character is a digit, if it is a digit then we calculate the number of times the string is to be decoded
// If the character is '[' then we push the string into the stack
// If the character is ']' then we pop the string and the number of times the string is to be decoded
// We append the string to the string builder and convert the string builder to string
// If the character is not a digit or '[' or ']' then we append the character to the string
// We return the string
