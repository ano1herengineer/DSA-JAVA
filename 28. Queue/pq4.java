// Question 4

// Reversing the first k elements of a queue

// We have an integer k and a queue of integers, we have to reverse the order of the first k
// elements of the queue, leaving the other elements in the same relative order.

// Sample Input : k = 5, Queue = 10 20 30 40 50 60 70 80 90 100 
// Sample Output : 50 40 30 20 10 60 70 80 90 100

// Time Complexity = O(n)
// Space Complexity = O(n)

import java.util.*;
import java.io.*;

public class pq4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 10; i <= 100; i += 10)
        {
            q.add(i);
        }
        reverseFirstK(q, k);
        System.out.println(q);
    }

    public static void reverseFirstK(Queue<Integer> q, int k)
    {
        if(q.isEmpty() == true || k > q.size())
        {
            return;
        }
        if(k <= 0)
        {
            return;
        }
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < k; i++)
        {
            s.push(q.remove());
        }
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
        for(int i = 0; i < q.size() - k; i++)
        {
            q.add(q.remove());
        }
    }
}