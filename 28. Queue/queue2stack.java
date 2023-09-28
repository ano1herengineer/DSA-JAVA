//Implementation of Queue using two stacks

//Asked in Amazon, Microsoft, Flipkart, Goldman Sachs, Morgan Stanley, OYO Rooms, Oracle, Samsung, SAP Labs, Walmart Labs, Zoho, MakeMyTrip, Paytm, Snapdeal, Swiggy, Uber, Visa, Walmart, Yatra.com, Zomato.

//There are two ways to implement a queue using two stacks:

// Method 1 (By making enQueue operation costly)
// This method makes sure that oldest entered element is always at the top of stack 1,
// so that deQueue operation just pops from stack1. To put the element at top of stack1, stack2 is used.

// enQueue(q, x)
//   1) While stack1 is not empty, push everything from stack1 to stack2.
//   2) Push x to stack1 (assuming size of stacks is unlimited).
//   3) Push everything back to stack1.

// deQueue(q)
//   1) If stack1 is empty then error
//   2) Pop an item from stack1 and return it

// Method 2 (By making deQueue operation costly)
// In this method, in en-queue operation, the new element is entered at the top of stack1.
// In de-queue operation, if stack2 is empty then all the elements are moved to stack2 and finally top of stack2 is returned.
// enQueue(q,  x)
//   1) Push x to stack1 (assuming size of stacks is unlimited).

// deQueue(q)
//   1) If both stacks are empty then error.
//   2) If stack2 is empty
//        While stack1 is not empty, push everything from stack1 to stack2.
//   3) Pop the element from stack2 and return it.

// Method 1
import java.util.*;

public class queue2stack
{
    static class Queue
    {
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();

        // To check if the queue is empty
        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }

        // To add an element to the queue = O(n)
        public static void add(int data)
        {
            // Move all elements from s1 to s2
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }

            // Push the new element to s1
            s1.push(data);

            // Move all elements back to s1 from s2
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }

        // To remove an element from the queue = O(1)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        // To peek the queue = O(1)
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }

        // To print the queue
        public static void print()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Queue: " + s1);
        }

    }

    public static void main(String args[])
    {
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.print();

        System.out.println("Removed from the queue: " + q.remove());
        System.out.println("Removed from the queue: " + q.remove());

        q.print();

        System.out.println("Peeked from the queue: " + q.peek());
    }
}

//Method 2
// import java.util.*;
//
// public class queue2stack
// {
//     static class Queue
//     {
//         static Stack<Integer> s1 = new Stack<Integer>();
//         static Stack<Integer> s2 = new Stack<Integer>();
//
//         // To check if the queue is empty
//         public static boolean isEmpty()
//         {
//             return s1.isEmpty() && s2.isEmpty();
//         }
//
//         // To add an element to the queue = O(1)
//         public static void add(int data)
//         {
//             s1.push(data);
//         }
//
//         // To remove an element from the queue = O(n)
//         public static int remove()
//         {
//             if(isEmpty())
//             {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//
//             // If s2 is empty, move all elements from s1 to s2
//             if(s2.isEmpty())
//             {
//                 while(!s1.isEmpty())
//                 {
//                     s2.push(s1.pop());
//                 }
//             }
//             return s2.pop();
//         }
//
//         // To peek the queue = O(n)
//         public static int peek()
//         {
//             if(isEmpty())
//             {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//
//             // If s2 is empty, move all elements from s1 to s2
//             if(s2.isEmpty())
//             {
//                 while(!s1.isEmpty())
//                 {
//                     s2.push(s1.pop());
//                 }
//             }
//             return s2.peek();
//         }
//
//         // To print the queue
//         public static void print()
//         {
//             if(isEmpty())
//             {
//                 System.out.println("Queue is empty");
//                 return;
//             }
//             System.out.println("Queue: " + s2);
//         }
//
//     }
//
//     public static void main(String args[])
//     {
//         Queue q = new Queue();
//
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         q.add(50);
//
//         q.print();
//
//         System.out.println("Removed from the queue: " + q.remove());
//         System.out.println("Removed from the queue: " + q.remove());
//
//         q.print();
//
//         System.out.println("Peeked from the queue: " + q.peek());
//     }
// }
// Time Complexity:
// add() = O(n)
// remove() = O(1)
// peek() = O(1)
// Space Complexity: O(n)
// Method 1 is better than Method 2 as the time complexity of add() is O(n) in Method 2.
// Method 1 is also better than Method 2 as the space complexity of Method 1 is O(1) while that of Method 2 is O(n).
// Method 1 is also better than Method 2 as the time complexity of remove() and peek() is O(1) in Method 1 while that of Method 2 is O(n).

