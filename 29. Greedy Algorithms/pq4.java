// Question 4

// Best Time to Buy and Sell Stock

// Given an array prices[] of length N, representing the stock prices on different days,
// the task is to find the maximum profit possible for buying and selling the stocks on different 
// days using transaction where at most one transaction is allowed.

// Note: Stock must be bought before selling.

// Examples:

// Input: prices[] = { 7, 1, 5, 3, 6, 4 }
// Output: 5

// Input: prices[] = { 7, 6, 4, 3, 1 }
// Output: 0

// Time Complexity: O(N)
// Auxiliary Space: O(1)

import java.util.*;

public class pq4
{
    public static void main(String args[])
    {
       int prices[] = { 7, 1, 5, 3, 6, 4 };
       int n = prices.length;
       int ans = maxProfit(prices, n);
       System.out.println("Maximum Profit = " + ans);

    }

    public static int maxProfit(int prices[], int n)
    {
        int buy = prices[0];
        int max_profit = 0;

        for(int i = 1; i < n; i++)
        {
            if(prices[i] < buy)
            {
                buy = prices[i];
            }
            else
            {
                max_profit = Math.max(max_profit, prices[i] - buy);
            }
        }

        return max_profit;

    }
}