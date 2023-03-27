// ARRAYS -Assignment
//Question 1:Given an integer array nums, return true if any value appears at least twice in the array, 
//and return false if every element is distinct.
//Example 1: Input:nums = [1, 2, 3, 1]   Output: true 
//Example 2:Input:nums = [1, 2, 3, 4]Output: false 
//Example 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] Output:true 
//Constraints:•1 <= nums .  lengtth <= 105•-109 <= nums [ i ] <= 109

import java.io.*;
import java.util.*;

public class pq1{
    public static void main(String args[]){
        int array[] = {1, 2, 3, 4, 5};
        int result = findDuplicate(array);

        if(result == 0){
            System.out.println("false"); // no duplicate value found 
        }
        else{
            System.out.println("true"); //duplicate value found 

        }

    }

    public static int findDuplicate(int array[])
    {
        int value = 0;
        for(int i=0; i<array.length; i++)
        {
            value = array[i];
            for(int j =i+1; j<array.length; j++)
            {
                if (value == array[j])
                {
                    return 1;
                }
            }
        }
        return 0;
    }
}

//brute force approach 
// time complexity = O(n2)

// public boolean containsDuplicate(int[] nums) 
// {for(int i=0; i<nums.length-1 ; i++) 
//{ for(int j=i+1; j<nums.length ; j++ ) {
// if( nums[i] == nums[j] ) {
    // return true ; } } } 
    //return false; }


    //given approach in pdf same as above 
    // there is no need for extra variable 



// hashset approach , Time complexity = O(n)
// A HashSet is a collection of items where every item is unique,
// and it is found in the java.util package:

public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
     for(int i=0; i<nums.length; i++) {
         if(set.contains(nums[i])) {
             return true; 
             }
              else {
                 set.add(nums[i]);
                } 
            } 
            return false; 
}
