// Valid Parenttheses

// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An Input string is valid if :

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Note that an empty string is also considered valid.
// Every opening bracket must have a closing bracket of the same type in the correct order. For eg: [()] is valid but [(]) is not valid.

import java.util.*;

class validparentheses
{
    public static void main(String args[])
    {
        String str = "([{}])"; // true
        System.out.println(isValid(str));

    }
    public static boolean isValid(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else
            { 
                if(stack.isEmpty())
               {
                return false;
               }

               if( (stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch == ']') )
               {
                   stack.pop();
               }
               else
               {
                   return false;
               }

            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)


