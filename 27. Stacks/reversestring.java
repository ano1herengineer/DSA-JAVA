// To reverse a string using a stack

// Time Complexity: O(N)
// Space Complexity: O(N)

import java.util.*;
public class reversestring
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String answer = reverse(str);
        System.out.println(answer);
        
    }

    public static String reverse(String str)
    {
        Stack<Character> stack = new Stack<>();
        int idx = 0;
        while(idx < str.length())
        {
            stack.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty())
        {
            result.append(stack.pop());
        }

        return result.toString();
    }
}