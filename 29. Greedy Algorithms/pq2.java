// Question 2

// Kth Largest Odd Number in a Given Range 

// we have two variables L and R, indicating a range of integers from L to R inclusive, and a 
// number K,the task is to find Kth largest odd number. If K > number of odd numbers in the range
// L to R the return 0.

// Examples:

// Input: L = -3, R = 3, K = 1
// Output: 3

// Time Complexity: O(1)
// Auxiliary Space: O(1)


import java.util.*;

public class pq2
{
    public static void main(String args[])
    {
        int[] p = {-10, 10};
        int k = 8;
        System.out.println("Kth Largest Odd Number = " + kthLargestOdd(p, k));
    }

    public static int kthLargestOdd(int[] range, int K)
    {
        if(K <= 0)
        {
            return 0;
        }

        int L = range[0];
        int R = range[1];

        if((R & 1) > 0)
        {
            int Count = (int) Math.ceil((R - L + 1) / 2);
            if(K > Count)
            {
                return 0;
            }
            else
            {
                return (R - 2 * K + 2);
            }
        }

        else{
            int Count = (int) Math.ceil((R - L + 1) / 2);
            if(K > Count)
            {
                return 0;
            }
            else
            {
                return (R - 2 * K + 1);
            }
        }
    }
}