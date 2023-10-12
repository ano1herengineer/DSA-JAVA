// Indian Coins

// We are given an infinite supply of coins of different denominations in a set A. We need to find the minimum number of coins required to get a desired change for a value V.

// Using Greedy Approach, we can solve this problem by selecting the coin with the highest denomination till it is less than the remaining value V, and keep adding the selected coins till V becomes 0.
// This approach will only work on the coin system that are Canonical Coin Systems.

// Canonical Coin Systems: A coin system (S) is said to be canonical if the number of coins of each denomination is infinite. In other words, we can always obtain a desired change using coins of denomination available in S.

// Given Denominations = {1, 2, 5, 10, 20, 50, 100, 500, 2000}

// Input : V = 121
// Output : 3 (100, 20, 1)

// Input : V = 590
// Output : 6 (500, 50, 20, 20)

// Steps:

// Sort the coins in descending order.
// Initialize result as empty.
// Find the largest denomination that is smaller than current amount.
// Add found denomination to result. Subtract value of found denomination from amount.
// If amount becomes 0, then print result.
// Else repeat steps 3 and 4 for new value of V.

// Java program to find minimum number of denominations

import java.util.*;

public class indiancoins
{
    public static void main(String args[])
    {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int n = coins.length;

        Arrays.sort(coins, Comparator.reverseOrder()); // sorting the coins in descending order
        int contOfCoins = 0;
        int amount = 590;

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            if(coins[i] <= amount)
            {
                while(coins[i] <= amount)
                {
                    amount -= coins[i];
                    result.add(coins[i]);
                    contOfCoins++;
                }
            }
        }

        System.out.println("Minimum number of denominations = " + contOfCoins);
        System.out.println("Denominations are: " + result);

    }
}