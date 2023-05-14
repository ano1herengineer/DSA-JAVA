// search in a rotated sorted array 

public class sortednrotated
{
    public static void main(String args[])
    {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; // expected output --> 4  
        int tarIdx = search(arr, target, 0, arr.length-1); 
        System.out.println(tarIdx);
    }

    public static int search(int arr[], int tar, int si, int ei)
    {
        //Base Case
        if(si > ei)
        {
            return -1;
        }
        //kaam ( to find mid)
        int mid = si + (ei-si)/2;

        //case found
        if(arr[mid] == tar)
        {
            return mid;
        }

        //mid on Line 1
        if(arr[si] <= arr[mid])
        {
            //case a : left of Line 1
            if(arr[si] <= tar && tar <= arr[mid])
            {
               return search(arr, tar, si, mid-1);
            } 
            else
            {
                //case b : right of Line 1
                return search(arr, tar, mid+1, ei);
            }

        }

        //mid on Line 2
        else
        {
            //Case c :right on Line 2
            if(arr[mid] <= tar && tar <= arr[ei])
            {
                return search(arr, tar, mid+1, ei);
            }
            else
            {
                //Case d: left of Line 2
                return search(arr, tar, si, mid-1);
            }

        }


    }
}



// public class sortednrotated {
//     public static void main(String args[]) {
//         int arr[] = {4, 5, 6, 7, 0, 1, 2};
//         int target = 0; // expected output --> 4
//         int tarIdx = search(arr, target);
//         System.out.println(tarIdx);
//     }

//     public static int search(int arr[], int target) {
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             // Case found
//             if (arr[mid] == target) {
//                 return mid;
//             }

//             // Mid on Line 1
//             if (arr[left] <= arr[mid]) {
//                 // Case a: Left of Line 1
//                 if (arr[left] <= target && target <= arr[mid]) {
//                     right = mid - 1;
//                 } else {
//                     // Case b: Right of Line 1
//                     left = mid + 1;
//                 }
//             }
//             // Mid on Line 2
//             else {
//                 // Case c: Right on Line 2
//                 if (arr[mid] <= target && target <= arr[right]) {
//                     left = mid + 1;
//                 } else {
//                     // Case d: Left of Line 2
//                     right = mid - 1;
//                 }
//             }
//         }
//         return -1; // Not found
//     }
// }
