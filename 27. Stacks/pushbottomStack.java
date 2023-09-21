// Push at the bottom of the stack using recursion

// Time Complexity: O(N)
// Space Complexity: O(N)

import java.util.*;

public class pushbottomStack
{
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        pushBottom(stack, 40);
        System.out.println(stack);
    }

    public static void pushBottom(Stack<Integer> stack, int data)
    {
        if(stack.isEmpty())  //data will only be pushed when stack is empty therefore the data will be at the bottom of the stack
        {
            stack.push(data);
            return;
        }

        int temp = stack.pop();
        pushBottom(stack, data);
        stack.push(temp);
    } 
}