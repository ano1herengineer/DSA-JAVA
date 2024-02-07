import java.util.*;

public class HeapSort
{
    
    public static void heapify(int arr[], int index, int n)
    {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        int maxIndex = index;

        if(leftChildIndex < n && arr[leftChildIndex] > arr[maxIndex]) // To make it a MIN HEAP, change the sign of the comparison (i.e. arr[leftChildIndex] < arr[maxIndex])
        {
            maxIndex = leftChildIndex;
        }

        if(rightChildIndex < n && arr[rightChildIndex] > arr[maxIndex]) // To make it a MIN HEAP, change the sign of the comparison (i.e. arr[rightChildIndex] < arr[maxIndex])
        {
            maxIndex = rightChildIndex;
        }

        if(maxIndex != index)
        {
            // Swap the elements
            int temp = arr[index];
            arr[index] = arr[maxIndex];
            arr[maxIndex] = temp;

            // Heapify the remaining array
            heapify(arr, maxIndex, n);
        }
    }
    public static void heapSort(int arr[])
    {
        // Step 1: Build a maxHeap
        int n = arr.length;
        for(int i = n / 2 - 1; i >= 0; i--) // O(n)
        {
            heapify(arr, i, n); // O(logn)
        }

        // Step 2: Push the largest element to the end of the array and heapify the remaining array
        for(int i = n - 1; i >= 0; i--) // O(n)
        {
            // Swap the elements
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the remaining array
            heapify(arr, 0, i); // O(logn)
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1, 2, 4, 5, 3};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}