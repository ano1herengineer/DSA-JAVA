//For a given integer array of size n. You have to printall the occurences (indices) of a given 
//element (key) and print them. Use recursive function to solve this.

//sample input = arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
//sample output = 1 5 7 8 

public class pq1
{
    public static void main(String args[])
    {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        allOccurences(arr, key, 0);
        System.out.println();
    }

    public static void allOccurences(int arr[], int key, int i)
    {
        //Base Case
        if(i == arr.length)
        {
            return;
        }
        if(arr[i] == key)
        {
            System.out.println(i +" ");
        }
        allOccurences(arr, key, i+1);
    }
}