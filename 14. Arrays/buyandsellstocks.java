// buy and sell stocks 
import java.io.*;
import java.util.*;
 

public class buyandsellstocks
{
    public static void main(String args[])
    {
       int prices[] = {7, 1, 5, 3, 6, 4};
       System.out.println("Maximum Profit Obtained = " +Stonks(prices));
    }

    public static int Stonks(int prices[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++)
        {
            if(buyPrice < prices[i]) // Profit condition 
            {
                int profit = prices[i] - buyPrice;  //today's Profit 
                maxProfit = Math.max(maxProfit, profit);
            }
            else 
            {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}

// time complexity = O(n)