// Greedy Algorithms = Those algorithms which make locally optimal(best) choice at each stage with the hope of finding global optimum.

// Activity Selection Problem
// Given n activities with their start and finish times. 
// Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.
// The activities are sorted according to their finishing(end) time.


import java.util.*;

public class activityselection
{
    public static void main(String args[])
    {
        int start[] =  {1, 3, 0, 5, 8, 5};
        int end[] =  {2, 4, 6, 7, 9, 9};
        // the activity array is sorted according to their end time
        
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        // first activity is always selected
        maxAct = 1; 
        ans.add(0);  // activity 1
        int lastEnd = end[0]; // end time of first activity

        for(int i=0; i<end.length; i++)
        {
            if(start[i] >= lastEnd) // if start time of current activity is greater than or equal to end time of last activity
            {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Maximum number of activities that can be performed by a single person = " + maxAct);
        System.out.println("The activities are : ");
        for(int i=0; i<ans.size(); i++)
        {
            System.out.println("Activity " + (i+1) + " : A" + ans.get(i));
        }
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)

// If the activities are not sorted according to their end time, then we have to sort them first and then apply the above algorithm.
// Time Complexity : O(nlogn) + O(n) = O(nlogn)
// Space Complexity : O(n)

// Way to sort the activities according to their end time in ascending order(using comparator) :

// int activities[][] = new int[start.length][3];
// for(int i=0; i<start.length; i++)
// {
//     activities[i][0] = start[i];
//     activities[i][1] = end[i];
//     activities[i][2] = i;
// }

//  lambda expression -> short form of writing a function
// Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // sorting according to end time
