// MONOTONIC ARRAYLIST(EASY)

//An ArrayList is monotonic if it is either monotone increasing or monotone decreasing.

//An arraylist nums is monotone increasing if for all i <= j, nums.get(i) <=nums.get(j).
//An ArrayList nums is monotone decreasing if for all i<=j, nums.get(i) >=nums.get(j).

//Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.

//Sample Input 1: nums = [1,2,2,3]
//Sample Output 1: true

//Sample Input 2: nums = [6,5,4,4]
//Sample Output 2: true

//Sample Input 3: nums = [1,3,2]
//Sample Output 3: false

//Constraints:
//1 <= nums.size() <= 105
//-105 <= nums.get(i) <= 105

import java.util.*;

public class pq1
{
    public static boolean isMonotonic(ArrayList<Integer> list)
    {
        boolean inc = true;
        boolean dec = true ;

        for(int i = 0; i<list.size() - 1; i++)
        {
            if(list.get(i) > list.get(i+1))
                inc = false;
            if(list.get(i) < list.get(i+1))
                dec = false;
            
        }

        return inc && dec;
        //Also, you should use the && operator instead of the || operator when checking if the list is monotonic.
        // This is because you want to return true only if the list is either increasing or decreasing, not both.
    } 

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        //1, 2, 3, 6, 3, 5 - It shold return false 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(3);
        list.add(5);
        System.out.println(isMonotonic(list));
    }


}
