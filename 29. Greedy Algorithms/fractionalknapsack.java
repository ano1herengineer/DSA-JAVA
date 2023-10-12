// Fractional Knapsack Problem

// Given weights and values of n items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
// In Fractional Knapsack, we can break items for maximizing the total value of knapsack.
// This problem in which we can break an item is also called the fractional knapsack problem.

// To determine the maximum value obtainable from an item we take the ratio of value and weight of the item.
// And then we sort the items according to this ratio.
// Then we take the item with the highest ratio and add them until we can’t add the next item as a whole and at the end add the next item as much as we can.
// Which will always be the optimal solution to this problem.

// Example :
// Input:
// Items as (value, weight) pairs
// arr[] = {{60, 10}, {100, 20}, {120, 30}}
// Knapsack Capacity, W = 50;

// Output:
// Maximum possible value = 240

import java.util.*;

public class fractionalknapsack
{
    public static void main(String args[])
    {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        // calculating ratio of value and weight of each item
        double ratio[][] = new double[value.length][2];
        //0th column will store the index of the item
        //1st column will store the ratio of value and weight of the item

        for(int i=0; i<value.length; i++)
        {
            ratio[i][0] = i;
            ratio[i][1] = (double)value[i]/weight[i];
        }
        
        //Ascending Order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // sorting the items according to their ratio

        int capacity = W;
        int finalVal =0;

        for(int i=ratio.length-1; i>=0; i--)
        {
            int idx = (int)ratio[i][0]; // index of the item
            if(capacity >= weight[idx])
            {
                //include full item
                capacity -= weight[idx]; // reducing the capacity of the knapsack
                finalVal += value[idx]; // adding the value of the item
            }

            else
            {
                //include fractional part of the item
                finalVal += (ratio[i][1] * capacity); // adding the fractional value of the item
                capacity = 0; // knapsack is full
                break;
            }

        }

        System.out.println("Maximum value that can be obtained = " + finalVal);
    }
}