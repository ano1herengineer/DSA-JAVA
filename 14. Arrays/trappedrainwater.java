import java.io.*;
import java.util.*;

public class trappedrainwater
{
    public static void main(String args[])
    {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("volume of trapped rainwater = " + trappedRainwater(height));
    }

    public static int trappedRainwater(int height[])  //Time Complexity = O(n)
    {
        int n = height.length;
        //calculate left max boundary - array 
        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        //calculate right max boundary - array 
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--)
        {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i =0; i < n; i++)
        {
            //waterLevel = min(leftmax boundary - rightmax boundary)
           int  waterLevel = Math.min(leftMax[i], rightMax[i]);

           //trapped water = waterlevel - height[i]
           trappedWater += waterLevel - height[i];
        }
        return trappedWater;
        
        
    }
}



// This Java code calculates the amount of water that can be trapped between the given boundaries. 
// The main function includes an integer array with some example height values. 
// trappedRainwater function that accepts an integer array and returns the total amount of trapped water. 
// It first calculates the maximum height boundaries to the left and right of each position in the height array. 
// Then it loops through the height array for each position, determines the minimum value of the left and right boundaries,
// calculates the corresponding water level and adds to the total trappedWater. Finally, it returns the total trapped water.