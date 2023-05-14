// program to implement merge sort techique

public class MergeSort
{
    public static void main(String args[])
    {
        int arr[] = {6, 3, 9, 5, 2, 8, -2};
        mergeSort(arr, 0, arr.length-1);
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

    //Recursive Function 
    public static void mergeSort(int arr[], int si, int ei)
    {
        //Base Case
        if(si >= ei)
        {
            return;
        }
        // kaam 
        int mid = si + (ei - si)/2; //(si+ei)/2
        mergeSort(arr, si, mid); //left
        mergeSort(arr, mid+1, ei); //right

        merge(arr, si, mid, ei);
    }

    //merge method to merge the sorted parts
    public static void merge(int arr[], int si, int mid, int ei)
    {
        //left(0,3)=4  right(4,6)=3 i.e = (ei-si+1)
        //because the arrays using 0 based indexing
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part 
        int k =0; // iterator for temp array

        while(i <= mid && j <= ei)
        {
            //elements compare 
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                 i++;
            }
            else
            {
                temp[k] = arr[j];
                j++; 
            }
            k++;
        }
         //for the leftover elements of left part (1st Sorted Part)
        while(i <= mid)
        {
            temp[k++] = arr[i++];
        }

        //for the leftover elements of right part (2nd Sorted Part) 
        while(j <= ei)
        {
            temp[k++] = arr[j++];
        }

        //copy temp to original array 
        for(k =0, i = si; k<temp.length; k++, i++)
        {
            arr[i] = temp[k];
        }


    }
}