// Queue reversal 

// Input: 1 2 3 4 5
// Output: 5 4 3 2 1

// Use a stack to reverse a queue

import java.util.*;

public class queuereversal
{
    public static void main(String args[])
    {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= 5; i++)
        {
            q.add(i);
        }
        reverse(q);
        System.out.println(q);
    }

    public static void reverse(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<>(); //Stack used because it has LIFO property
        while(!q.isEmpty()) //Push all the elements of the queue into the stack
        {
            s.push(q.remove());
        }
        while(!s.isEmpty()) //Pop all the elements of the stack and add them to the queue
        {
            q.add(s.pop());
        }
    }
}