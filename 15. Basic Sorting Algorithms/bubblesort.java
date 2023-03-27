import java.io.*;

public class bubblesort
{
    public static void main(String args[])
    {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printArr(arr);
    }

    public static void bubbleSort(int arr[])
    {
        for(int turn =0; turn<arr.length - 1; turn++)
        {     boolean swaps =false;
            for(int j =0; j<arr.length-1-turn; j++)
            {    
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps = true; //if after 1 iteration swap is not incremented it states that the array is already sorted 
                }
                
            }
            if(!swaps)
            {
                break;
            }
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