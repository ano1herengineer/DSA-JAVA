//Implementation of Stack using Java Collections Framework

import java.util.*;  //import java.util.Stack;

public class stackJCF
{
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); //Stack Underflow
        
    }
}