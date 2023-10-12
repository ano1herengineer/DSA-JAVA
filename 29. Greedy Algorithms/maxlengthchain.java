// Maximum length chain of pairs

// Given a set of n pairs of numbers of the form (a, b) where a is always less than b. 
// A pair (c, d) can follow another pair (a, b) if b < c.
// Find the longest chain which can be formed from a given set of pairs.

// Examples:

// Input: n = 5
// pairs[] = { {5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90} }
// Output: 3

// Explanation: The longest chain that can be formed is { {5, 24}, {27, 40}, {50, 90} }

// Input: n = 2
// pairs[] = { {5, 10}, {1, 11} }
// Output: 1

// Explanation: The longest chain that can be formed is { {1, 11} } or { {5, 10} }

import java.util.*;

public class maxlengthchain
{
    public static void main(String args[])
    {
        int pairs[][] = { {5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90} };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // sorting the pairs according to their second element

        int chainLen = 1;
        int chainEnd = pairs[0][1]; // last element of the first pair or chain end

        for(int i =1; i<pairs.length; i++)
        {
            if(pairs[i][0] > chainEnd) // if the first element of the pair is greater than the chain end
            {
                chainLen++; // increment the chain length
                chainEnd = pairs[i][1]; // update the chain end
            }
        }

        System.out.println("Maximum length chain of pairs = " + chainLen);

    }
}

// Time Complexity: O(n*log(n))
// Auxiliary Space: O(1)
