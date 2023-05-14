// program to sort array using quick sort 

public class QuickSort
{
    public static void main(String args[])
    {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }

    public static void printArr(int arr[])
    {
        for (int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei )
    {
        //Base Case 
        if(si >= ei)
        {
            return;
        }
        //pivot = last element
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1); //left part 
        quickSort(arr, pidx+1, ei); //right part 

    }

    public static int partition(int arr[], int si, int ei)
    {
        int pivot = arr[ei];
        int i = si-1; // to make place for elements smaller than pivot 

        for(int j = si; j<ei; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //to place the pivot element in the right spot 
         i++;
                //swap
                int temp = pivot;
                arr[ei] = arr[i]; // pivot = arr[i] it will be wrong 
                arr[i] = temp;
                return i;

    }
}

