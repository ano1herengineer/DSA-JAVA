// Implementation of stack using two queues

// There are two ways to implement a stack using two queues:

// For both the implementation we will make sure after costly operation, the queue is not copied back to the other queue because both queues will function same.
// Method 1 (By making push operation costly)
// This method makes sure that newly entered element is always at the front of ‘q1’, so that pop operation just dequeues from ‘q1’.
// ‘q2’ is used to put every new element at front of ‘q1’.

// push(s, x) operation’s step are described below:
// Enqueue x to q2
// One by one dequeue everything from q1 and enqueue to q2.


// pop(s) operation’s function are described below:
// Dequeue an item from q1 and return it.


// Method 2 (By making pop operation costly)
// In push operation, the new element is always enqueued to q1. In pop() operation, if q2 is empty then all the elements except the last, are moved to q2. Finally the last element is dequeued from q1 and returned.

// push(s,  x) operation’s step are described below:
// Enqueue x to q1 (assuming size of q1 is unlimited).

// pop(s) operation’s function are described below:
// One by one dequeue everything except the last element from q1 and enqueue to q2.
// Dequeue the last item of q1, the dequeued item is result, store it.
// Return the item stored in step 2.

//Method 2

import java.util.*;

public class stack2queue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            // Enqueue the new element into q1
            q1.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            
            // Move all elements except the last from q1 to q2
            while (q1.size() > 1) {
                q2.add(q1.poll());
            }
            
            // The last element in q1 is the one to be removed (pop)
            int top = q1.poll();
            
            // Swap q1 and q2 to maintain the order
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            // Move all elements except the last from q1 to q2
            while (q1.size() > 1) {
                q2.add(q1.poll());
            }

            // The last element in q1 is the one to be peeked
            int top = q1.peek();

            // Move it to q2 and then swap q1 and q2 to maintain the order
            q2.add(q1.poll());
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

// Poll function in Java 
// The poll() method of Queue Interface returns and removes the element at the front the container. It deletes the element in the container. The method does not throws an exception when the Queue is empty, it returns null instead.