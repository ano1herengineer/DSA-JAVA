// Question 3

// Lexicographically smallest string of length N and sum K

// We have given two integers N and K, the task is to find the lexicographically smallest string of length N
// consisting of lowercase English alphabets such that the sum of the characters of the string is equal to K.
// where a = 1, b = 2, c = 3, …, z = 26.

// Examples:

// Input: N = 3, K = 27
// Output: aaz

// Input: N = 5, K = 42
// Output: aaamz

// Time Complexity: O(N)
// Auxiliary Space: O(1)

import java.util.*;

public class pq3
{
    public static void main(String args[])
    {
        int N = 5;
        int K = 42;

        char arr[] = lexo_small(N, K);

        System.out.println(new String(arr));
    }

    public static char[] lexo_small(int n, int k)
    {
        char arr[] = new char[n];
        Arrays.fill(arr, 'a');
        for(int i = n - 1; i >= 0; i--)
        {
            k-=i;
            if( k >= 0)
            {
                if( k >= 26)
                {
                    arr[i] = 'z';
                    k -= 26;
                }
                else
                {
                    arr[i] = (char)(k + 'a' - 1);
                    k -= arr[i] - 'a' + 1;
                }

            }
            else{
                k+=i;
                break;
            }

            
        }
        return arr;
    }
}


// Here's a step-by-step explanation of the code:

// Initialize N and K with the given values (N = 5, K = 42).

// Create a character array arr of length N, and initialize all elements with the character 'a'.

// Iterate from the end of the array to the beginning (from n-1 to 0).

// Inside the loop, subtract i from k. This is because 'a' represents 1, 'b' represents 2, and so on. By subtracting i, you are effectively moving to the next character in the lexicographical order.

// Check if k is greater than or equal to 0. If it is, you can change the character at the current position.

// If k is greater than or equal to 26 (the number of lowercase English letters), set the current character to 'z' and subtract 26 from k.

// If k is less than 26, set the current character to the appropriate character that corresponds to k (using the 'a' offset) and update k accordingly.

// If k becomes negative, add i back to k (backtrack) and break the loop.

// Return the character array as the lexicographically smallest string.