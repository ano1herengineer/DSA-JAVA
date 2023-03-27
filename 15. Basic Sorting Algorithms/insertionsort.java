import java.io.*;

public class insertionsort
{
    public static void main(String args[])
    {
        int arr[] = {5, 4, 1, 2, 3};
        insertionSort(arr);
        printArr(arr);

    }

   // Function to perform insertion sort on an array
    public static void insertionSort(int arr[])
    {
        // Looping through the array
        for(int i =1; i<arr.length; i++)
        {
            // Setting the current value to curr and position of previous value to prev
            int curr = arr[i];
            int prev = i-1;

            // Looping through the previous values to find the position where current value needs to be inserted
            while(prev >= 0 && arr[prev] > curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }

            // Inserting the current value at the correct position
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[])
    {
        System .out.print("Sorted array = ");
        for(int i =0; i<arr.length; i++)
        {
            
            System.out.print(arr[i] +" ");
        }
    }
}