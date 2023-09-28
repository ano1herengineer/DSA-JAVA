// Implement a queue using a deque.

// Queue is FIFO(First In First Out)

// Input: 1 2 3 4 5
// Output: 1 2 3 4 5

import java.util.*;

public class dequeQueue
{
    public static void main(String args[])
    {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.peek());
        q.dequeue();
        System.out.println(q.peek());
        q.dequeue();
        System.out.println(q.peek());
        q.dequeue();

    }

    static class Queue{
        Deque<Integer> deque = new LinkedList<>(); //Deque used because it has both FIFO and LIFO properties
        
        // Enqueue operation (Add at the end)
        public void enqueue(int data)
        {
            deque.addLast(data);
        }

        // Dequeue operation (Remove from the front)
        public void dequeue()
        {
            deque.removeFirst();
        }

        // Peek operation
        public int peek()
        {
            return deque.getFirst();
        }
    }
}
