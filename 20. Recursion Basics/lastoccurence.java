public class lastoccurence
{
    public static void main(String args[])
    {
          int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
          System.out.println(lastOccurence(arr,5 ,arr.length-1));
    }

    public static int lastOccurence(int arr[],int key,int i)
    {
        //Base Case
        if(i == 0)
        {
            if(arr[i] == key)
            {
                return i;
            }
            return -1;
        }
        if(arr[i] == key)
        {
            return i;
        }
        return lastOccurence(arr,key,i-1);
    }

    // public static int lastOccurence(int arr[],int key, int i)
    // {
    //     if(i == arr.length)
    //     {
    //         return -1;
    //     }
    //     isFound = lastOccurence(arr, key, i+1);
    //     if(isFound  == -1 && arr[i] == key)
    //     {
    //         return i;
    //     }
    //         return isFound;
    //     
    // }
}