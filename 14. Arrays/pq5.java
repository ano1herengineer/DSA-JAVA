// Question 5:Given an integer array nums, return all the triplets [nums[i], nums[j],  
// nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets

// Example 1:Input:nums = [-1, 0,  1, 2, -1, -4]   Output:[ [-1, -1, 2] , [-1, 0, 1] ]

// Example 2:Input:nums = [ ]  Output:   [ ]  
// Example 3:Input:nums = [ 0   ]  Output:   [ ]  
// Constraints:
// •     0 <= nums . length <= 3000 
// •    -105 <= nums [ i ] <= 10


import java.util.*;

public class pq5 {

    public static void main(String args[])
    {
        int nums[] = { -1, 0, 1, 2, -1, -4};
        List<List<Integer>> results = threeSum(nums);
        for(List<Integer> res: results) {
            System.out.println(res);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>(); // create an array list to store the result
        
        if (nums == null || nums.length == 0) { // if nums array is empty or null return empty result
            return res;
        }
        
        Arrays.sort(nums); // sort the array
        
        for (int i = 0; i < nums.length - 2; i++) { // loop through the array.

            if (i > 0 && nums[i] == nums[i - 1]) { // if the current element is same as previous element then skip
                continue;
            }
            
            int j = i + 1, k = nums.length - 1; // take two pointers j and k
            
            while (j < k) { // loop while j is less than k

                int sum = nums[i] + nums[j] + nums[k]; // get the sum of three numbers
                
                if (sum == 0) { // if sum is equal to zero then add to result

                    res.add(Arrays.asList(nums[i], nums[j], nums[k])); // add the triplet to the result array list
                    
                    j++; k--; // increment j and decrement k

                    while (j < k && nums[j] == nums[j - 1]) j++; // if current j is same as previous element then increment j
                    while (j < k && nums[k] == nums[k + 1]) k--; // if current k is same as next element then decrement k

                } else if (sum < 0) { // if sum is negative then increment j
                    j++;
                } else { // if sum is positive then decrement k
                    k--;
                }
            }
        }
        
        return res;
    }

}

// Given solution in pdf = Uses the same approach of lists