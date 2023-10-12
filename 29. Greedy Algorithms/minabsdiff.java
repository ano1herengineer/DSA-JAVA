// Minimum Absolute Difference Pairs

// Given two arrays A and B of equal length n, the task is to find the minimum absolute difference between any of the pair elements of both the arrays.

// Examples:
// Input: A[] = {1, 2, 3}, B[] = {2, 1, 3}
// Output: 0

// Input: A[] = {4, 1, 8, 7}, B[] = {2, 3, 6, 5}
// Output: 6

// Approach: The idea is to sort both the arrays and then find the minimum absolute difference between any of the pair elements of both the arrays. Below are the steps:
// Sort both the arrays.
// Initialize a variable minDiff = 0 to store the minimum absolute difference between any of the pair elements of both the arrays.
// Iterate over the array and find the absolute difference between the elements of both the arrays and add it to the minDiff.
// Print the minDiff.
// Implementation:

import java.util.*;

public class minabsdiff
{
    public static void main(String args[])
    {
        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};

        Arrays.sort(A); // sorting the first array
        Arrays.sort(B); // sorting the second array

        int minDiff =0;

        for(int i =0; i<A.length; i++)
        {
            minDiff += Math.abs(A[i] - B[i]); // finding the absolute difference between the elements of both the arrays
        }

        System.out.println("Minimum absolute difference between any of the pair elements of both the arrays = " + minDiff);
    }
}

// Time Complexity: O(n*log(n))
// Auxiliary Space: O(1)