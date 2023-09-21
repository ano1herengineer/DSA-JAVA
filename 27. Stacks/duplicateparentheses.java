// Given a balanced expression, find if it contains duplicate parenthesis or not. 
// A set of parenthesis are duplicate if the same subexpression is surrounded by multiple parenthesis.

// Return a true if duplicate parenthesis are found else return false.

// Input: ((x+y))
// Output: true

// Input: (x+y)
// Output: false

// Input: ((x+y)+((z)))
// Output: true

// Time Complexity: O(n)
// Space Complexity: O(n)


import java.util.*;
public class duplicateparentheses
{
    public static void main(String args[])
    {
        String str = "((x+y)+((z)))";  // true
        String str2 = "(x+y)";  // false
        System.out.println("((x+y)+((z))) = " + isDuplicate(str));
        System.out.println("(x+y) = " + isDuplicate(str2));
    }

    public static boolean isDuplicate(String str)
    {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            //closing bracket
            if(ch == ')')
            {
                int count = 0;
                while(stack.peek() != '(')
                {
                    stack.pop();
                    count++;
                }
                if(count <= 1)
                {
                    return true; // duplicate found
                }
                else
                {
                    stack.pop(); // pop the opening bracket
                }
            }
            else{
                //opening bracket
                stack.push(ch);
            }
        }

        return false; // no duplicate found
    }
}