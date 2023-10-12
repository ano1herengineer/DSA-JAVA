// Question 1 

// Maximum Balanced String Partitions 

// We have balanced string str of size N with an equal number of L and R, the task is to find a 
// maximum number X, such that a given string can be partitioned into X balanced substring.
// A string is called to be balanced if the number of L and R are equal in the string.

// Examples:

// Input: str = “LRRRRLLRLLRL"
// Output: 3

// Time Complexity: O(N)
// Auxiliary Space: O(1)

import java.util.*;

public class pq1
{
    public static void main(String args[])
    {
        String str = "LRRRRLLRLLRL";
        int n = str.length();

        System.out.println("Maximum Balanced String Partitions = " + maxBalancedPartitions(str, n));
    }

    public static int maxBalancedPartitions(String str, int n)
    {
        if(n ==0)
        {
            return 0;
        }

        int r =0, l =0;
        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            if(str.charAt(i) == 'L')
            {
                l++;
            }
            else
            {
                r++;
            }

            if(l == r)
            {
                ans++;
            }

        }
        return ans;
    }
}