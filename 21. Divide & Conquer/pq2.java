// Given an array nums of size n, return the makority element.

//The majority element is the element that appears more than |n/2| (floor value)times.
//You may assume that the majority element always exists in the array.

//Example 1
//Sample Input : nums =[3, 2, 3]
//Sample Output : 3

//Example 2
//Sample Input : nums =[2, 2, 1, 1, 1, 2, 2]
//Sample Output : 2

//Constraints (extra Conditions):
// n ==nums.length
// 1<=n<= 5*104
// -109 <= nums[i] <= 109

// public class pq2
// {
//     public static void main(String args[])
//     {
//         int nums[] ={2, 2, 1, 1, 1, 2, 2};
//         System.out.println(majorityElement(nums));
//     }

//     public static int majorityElement(int nums[])
//     {
//         int majorityCount = nums.length/2;

//         for(int i =0; i<nums.length; i++)
//         {
//             int count =0;
//             for(int j =0; j<nums.length; j++)
//             {
//                 if(nums[j] == nums[i])
//                 {
//                     count ++;
//                 }
//             }
//             if(count > majorityCount)
//             {
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }

//Brute Force Approach with Time Complexity = O(n^2)

//Approach 2 (Divide & Conquer)

//Idea : If we know the majority element in the left and right halves of an array,
//we can determine which is the global majority element in linear time.

//Here, we apply a classical divide & conquer approach that recurses on the left and right
//halves of an array until an answer can trivially achieved for a length -1 array. Note that
//becuase actually passing copies of subarrays costs time and space, we instead pass loand hi 
//indices that describes the relevant slice of the overall array. in thus case, the majority
//element for a length-1 slice is trivially its only element, so the recursion stops ther. If the
//current slice is longer than length-1, we must combine the answer for the slice's leftt and 
//right halves. If they agree on the majority element, then the majority element for the overall 
//slice is obviously the same[1]. If they disagree, only one of them can be "right", so we need to 
//count the occurences of the left and right majority elements to determine which subslice's
//answer is globally correct. The overall answer for the array is thus the majority element 
//between indices 0 and n.

//Time Complexity = O(nlogn)

public class pq2{
    public static void main(String args[])
    {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int countInRange(int nums[], int num, int lo, int hi)
    {
        int count = 0;
        for(int i = lo; i<=hi; i++)
        {
            if(nums[i] == num)
            {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementsRec(int nums[] , int lo, int hi)
    {
        //base case; the only element in an array of size 1 is the majority element

        if(lo == hi)
        {
            return nums[lo];
        }

        //recurse on left and right halves of this slice
        int mid = (hi-lo)/2 +lo;
        int left = majorityElementsRec(nums, lo, mid);
        int right = majorityElementsRec(nums, mid+1, hi);

        //if the two halves agree on the majority element, return it
        if(left == right)
        {
            return left;
        }

        //otherwise , count each element and return the "winner"
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int nums[])
    {
        return majorityElementsRec(nums, 0, nums.length-1);
    }
}
