// Question 1 :

// Generate binary numbers from 1 to n using a queue

// Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.

// Sample Input: N = 2
// Sample Output: 1 10

// Sample Input: N = 5
// Sample Output: 1 10 11 100 101

// Time Complexity = O(n)
// Space Complexity = O(n)

import java.util.*;

public class pq1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        generateBinary(n);

    }

    public static void generateBinary(int n)
    {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-- > 0)
        {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }
}

// Internal Working of the above code:

// For each number inputed by the user, we add 1 to the queue.
// Then we remove the first element of the queue and print it.
//  Then we add 0 and 1 to the removed element and add it to the queue. 
// This process is repeated until the queue is empty.

// By doing this, we are adding the binary numbers in the queue in the order of their decimal values.