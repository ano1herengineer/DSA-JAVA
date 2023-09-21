// To Calculate the maximum area in a Histogram

// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
// return the area of the largest rectangle in the histogram.

// Input: heights = [2,1,5,6,2,3]
// Output: 10

// Input: heights = [2,4]
// Output: 4

// Input: heights = [2,1,2]
// Output: 3

// Time Complexity: O(n)
// Space Complexity: O(n)

// Implementation using Stack

import java.util.*;
public class maxarea 
{
    public static void main(String args[])
    {
        int heights[] = {2,1,5,6,2,3};
        maxArea(heights);
    }

    public static void maxArea(int [] heights)
    {
        int maxArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        // Next Smaller Right
        Stack<Integer> s = new Stack<>();

        for(int i = heights.length - 1; i >= 0; i--)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i])
            {
                s.pop();
            }

            if(s.isEmpty())
            {
                nsr[i] = heights.length;
            }
            else
            {
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        // Next Smaller Left

        s = new Stack<>();
        for(int i = 0; i < heights.length ; i++)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i])
            {
                s.pop();
            }

            if(s.isEmpty())
            {
                nsl[i] = -1;
            }
            else
            {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // Width = NSR - NSL - 1
        // Area = Width * height of the bar

        for(int i = 0; i < heights.length ; i++)
        {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Max Area in Histogram = " + maxArea);
    }
}