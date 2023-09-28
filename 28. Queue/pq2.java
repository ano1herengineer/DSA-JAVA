// Question 2:

// Connect n ropes with minimum cost

// Given are N ropes of different lengths, we need to connect these ropes into one rope with minimum cost.
// The cost to connect two ropes is equal to the sum of their lengths. 
// The task is to connect the ropes with minimum cost.

//Sample Input : N = 4, arr[] = {4, 3, 2, 6}
//Sample Output : 29

//Sample Input : N = 2, arr[] = {1, 2, 3}
//Sample Output : 9

// Time Complexity = O(n)
// Space Complexity = O(n)

import java.util.*;

public class pq2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values of the array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(minCost(arr, n));
    }

    public static int minCost(int arr[], int n)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Used Priority Queue because we need to get the minimum element
        for(int i = 0; i < n; i++)
        {
            pq.add(arr[i]);
        }
        int res = 0; // To store the result
        while(pq.size() > 1) // While the size of the priority queue is greater than 1
        {
            int first = pq.poll(); // Get the first element
            int second = pq.poll(); // Get the second element
            res += first + second; // Add the first and second element to the result
            pq.add(first + second); // Add the sum of the first and second element to the priority queue
        }
        return res;
    }
}