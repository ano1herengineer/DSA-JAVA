import java.io.*;

public class selectionsort
{
    public static void main(String args[])
    {
        int arr[] = {5, 4, 1, 2, 3};
        selectionSort(arr);
        printArr(arr);

    }

    public static void selectionSort(int arr[])
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minPos] > arr[j]) // for decreasing order sorting 
                                         // arr[minPos] < arr[j]
                {
                    minPos = j;
                }
            }
            //swap 
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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

//Time Complexity = O(n2)