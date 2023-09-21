// To reverse a stack using recursion

// O(n) Time Complexity and O(1) Space Complexity

import java.util.*;

class reversestack
{
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println("Reversing the stack...");
        reverse(stack);
        System.out.println(stack);
    }

    public static void reverse(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            return;
        }

        int temp = stack.pop();
        reverse(stack);
        pushBottom(stack, temp);
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