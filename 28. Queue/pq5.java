// Question 5

// Maximum of all subarrays of size k

// We have an array arr[] of size N and an integer k, we have to find the maximum for each and every contiguous subarray of size k.

// Sample Input : N = 9, k = 3, arr[] = 1 2 3 1 4 5 2 3 6
// Sample Output : 3 3 4 5 5 5 6

// Time Complexity = O(n)
// Space Complexity = O(k)

import java.util.*; // Importing Deque class and LinkedList class

public class pq5
{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}; // Given array
        int k = 3; // Given value of k
        printMax(arr, arr.length, k); // Calling the function

    }

    public static void printMax(int arr[], int n, int k)
    {
        Deque<Integer> dq = new LinkedList<>(); // Creating a deque
        int i;
        for(i = 0; i < k; i++) // Adding the first k elements to the deque
        {
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(; i < n; i++) // For the remaining elements
        {
            System.out.print(arr[dq.peek()] + " "); // Print the first element of the deque
            while(!dq.isEmpty() && dq.peek() <= i - k) // Remove the elements which are out of the window
            {
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) // Remove the elements which are smaller than the current element
            {
                dq.removeLast();
            }
            dq.addLast(i); // Add the current element to the deque
        }
        System.out.print(arr[dq.peek()] + " "); // Print the first element of the deque
    }
}

// Internal Working of the above code:

// We create a deque and add the first k elements to it.
// Then we print the first element of the deque.
// Then we remove the elements which are out of the window.
// Then we remove the elements which are smaller than the current element.
// Then we add the current element to the deque.
// Then we print the first element of the deque.
// This process is repeated until the deque is empty.
// By doing this, we are printing the maximum of all subarrays of size k.

