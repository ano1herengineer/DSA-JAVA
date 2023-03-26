// Question 2:There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  
//such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed). 
// For example, [0,1,2,4,5,6,7] might be  rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//Given the array nums after the possible rotation and an integer target, 
//return the index oftarget if it is in nums, or -1   
//if it is not in nums.You must write an algorithm with O(log n) runtime complexity.

// Example 1:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 0 Output: 4 
// Example 2:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 3  Output: -1
// Example 3:Input:nums = [1], target = 0 Output:-1 
// Constraints:
// •1 <= nums . lengtth <= 5000 
// •-104 <= nums [ i ] <= 104
// •All values of nums are unique.
// •nums is an ascending array that is possibly rotated.
//•-104 <= target <= 104



// The task is to search for a target value in a sorted array of distinct integers.
// However, the array may have been rotated at an unknown pivot point. 
// For example, an array [0,1,2,4,5,6,7] may be rotated at pivot index 3 
// and become [4,5,6,7,0,1,2]. The task is to find the index of the target 
// value in the array within the logarithmic time complexity O(log n).
// If the target value is not in the array, return -1. 
// The length of the input array is between 1 and 5000,
// and the values of the array and target are between -10^4 and 10^4.


// public class pq2 {
//     public static void main(String args[]) {
//         int nums[] = {4, 5, 6, 7, 0, 1, 2};
//         int target = 0;

//         int result = search(nums, target);

//         System.out.println(result);
//     }

//     public static int search(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             }

//             if (nums[left] <= nums[mid]) {
//                 // left half is sorted
//                 if (nums[left] <= target && target < nums[mid]) {
//                     right = mid - 1;
//                 } else {
//                     left = mid + 1;
//                 }
//             } else {
//                 // right half is sorted
//                 if (nums[mid] < target && target <= nums[right]) {
//                     left = mid + 1;
//                 } else {
//                     right = mid - 1;
//                 }
//             }
//         }

//         return -1;
//     }
// }




public class pq2{
    public static void main(String args[])
    {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(nums, target);

        System.out.println(result);
    }

    public static int search(int[] nums, int target)
    {
        // min will have index of minimum element of nums 
        int min = minSearch(nums);
        //find in sorted left 

        if(nums[min] <= target && target <= nums[nums.length -1])
        {
            return search(nums,min,nums.length-1, target);
        }
        //find sorted right 
        else{
            return search(nums,0,min,target);
        }
    }

    //binary search to find target in left to right boundary 
    public static int search(int[] nums, int left, int right, int target)
    {
        int l = left;
        int r = right;

        //System.out.println(left+ " "+right);

        while(l <= r)
        {
            int mid = l +(r -l)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target)
            {
                r = mid -1;       
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }

    //smallest element index 
    public static int minSearch(int[] nums)
    {
        int left = 0;
        int right = nums.length -1;

        while(left < right )
        {
            int mid = left + (right - left)/2;
            if(mid > 0 && nums[mid-1] > nums[mid])
            {
                return mid;
            }
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right])
            {
                left = mid+1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
}