// Question 5

// Split the given array into K sub-arrays

// We have an Array[] of N elements and a number K.( 1 <= K <= N).
// Split the given array into K sub-arrays(they must cover all the elements). 
// The maximum subarray sum achievable out of K sub-arrays formed must be minimum among all possible
// Find the possible subarray sum.

// Examples:

// Input: arr[] = { 1, 2, 3, 4 }, K = 3
// Output: 4

// Input: arr[] = { 1, 2, 3, 4, 5 }, K = 2
// Output: 9

// Time Complexity: O((N-1)c(K-1))
// Here c is the binomial coefficient
// Space Complexity: O(N)

import java.util.*;

public class pq5
{
    public static int ans = Integer.MAX_VALUE;

    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4};
        int k = 3;
        int n = arr.length;
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans);

    }

    public static void solve(int arr[], int n, int k, int i, int sum, int max)
    {
        if(i == n)
        {
            if(k == 1)
            {
                ans = Math.min(ans, Math.max(sum, max));
            }
            return;
        }

        solve(arr, n, k, i + 1, sum + arr[i], Math.max(max, sum + arr[i]));
        solve(arr, n, k - 1, i + 1, arr[i], Math.max(max, arr[i]));
    }
}