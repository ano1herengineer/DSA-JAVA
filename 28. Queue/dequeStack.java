// Implement a stack using a deque.

// Input: 1 2 3 4 5
// Output: 5 4 3 2 1

import java.util.*;

public class dequeStack
{
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();

    }

    static class Stack{
        Deque<Integer> deque = new LinkedList<>(); //Deque used because it has both FIFO and LIFO properties
        
        // Push operation
        public void push(int data)
        {
            deque.addLast(data);
        }

        // Pop operation
        public void pop()
        {
            deque.removeLast();
        }

        // Peek operation
        public int peek()
        {
            return deque.getLast();
        }
    }
}