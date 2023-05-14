// Inversion Count 
//Given an array of Integers. Find the Inversion Count in the array.

//Inversion Count = For an array, inversion count indicates how far(or close) the array is from being sorted.
//If the array is already sorted then the inversion count is 0. If an arrays is sorted in the reverse order 
//then the inversion count will be maximum.
//Formally , two wlwmwnts a[id and a[j] form an inversion if a[i] > a[j] and i < j.

//Sample Input 1 : N =5, arr[] = {2, 4, 1, 3, 5}
//Sample Output 1: 3, because it has 3 inversions -(2, 1), (4, 1), (4, 3).

//Sample Input 2: N = 5, arr[ ] = {2, 3, 4, 5, 6}
//Sample Output 2: 0, because the array is already sorted

//Sample Input 3: N = 3, arr[] = {5, 5, 5}
//Sample Output3: 0, because all the elements of the array are the same & already in a sorted manner.

//Hint :  A sorting algorithm will be used to solvethis question

//Note-This question is important. Even if you are not able to come up with the approach, please understand the solution.

//Approach 1 (Brute Force)

// Idea: Traverse through the array, and for every index, find the number of smaller elements on its right side of the array.
// This can be done using a nested loop. Sum up the counts for all indexes in the array and print the sum

//Traverse through the array from start to end
//For every element, find the count of elements smaller than the current number upto that index using another loop.
//Sum up the count of inversion for every index
//Print the count of inversions.

//Time Complexity = O(n^2)

// public class pq3
// {
//     public static void main(String args[])
//     {
//         int arr[] = {1, 20, 6, 4, 5};
//         System.out.println("Inversion Count = "+ getInvCount(arr));
//     }

//     public static int getInvCount(int arr[])
//     {
//         int n = arr.length;
//         int invCount = 0;
//         for(int i = 0; i < n-1; i++)
//         {
//             for(int j =i+1; j<n; j++)
//             {
//                 if(arr[i] > arr[j])
//                 invCount++;
//             }

//         }
//         return invCount;
//     }
// }


public class pq3 {
    public static void main(String args[]) {
        int arr[] = {7, 9, 12, 5, 6, 8, 10};
        System.out.println("Inversion Count = " + getInvCount(arr));
    }

    public static int getInvCount(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];
        return mergeSort(arr, temp, 0, n - 1);
    }

    public static int mergeSort(int arr[], int temp[], int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            // Calculate the inversion count for the left subarray
            invCount += mergeSort(arr, temp, left, mid);

            // Calculate the inversion count for the right subarray
            invCount += mergeSort(arr, temp, mid + 1, right);

            // Merge the subarrays and count the inversions during the merge step
            invCount += merge(arr, temp, left, mid + 1, right);
        }
        return invCount;
    }

    public static int merge(int arr[], int temp[], int left, int mid, int right) {
        int invCount = 0;
        int i = left; // Index for the left subarray
        int j = mid; // Index for the right subarray
        int k = left; // Index for the merged subarray

        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++]; // Place the smaller element in the merged subarray
            } else {
                temp[k++] = arr[j++]; // Place the smaller element in the merged subarray
                invCount += (mid - i); // Count the inversions between the elements in the left and right subarrays
            }
        }

        // Copy the remaining elements from the left subarray, if any
        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        // Copy the remaining elements from the right subarray, if any
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy the merged subarray back to the original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }
}


//Total Inversion 
// (7, 5)
// (9, 5)
// (9, 6)
// (12, 5)
// (12, 6)
// (12, 8)
// (9, 8)
// (10, 5)
// (10, 6)