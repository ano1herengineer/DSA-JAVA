import java.io.*;
import java.util.*;

public class inbuiltsort
{
    public static void main(String args[])
    {
        int arr[] = {5, 4, 1, 2, 3};
       Arrays.sort(arr);  // inbulit method in java to sort arrays using java.util.Arrays package
       printArr(arr);
       //here sorting will be done in ascending order 

        //other method to sort = Arrays.sort(arrayname, starting index, ending index(it is non inclusive) )
        //  Arrays.sort(arr, 0, 3);
       //  printArr(arr);
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

//for descending order sorting we use Collections 

//import java.util.Collections;
//Arrays.sort(arr, Collections.reverseOrder())   Type 1
//Arrays.sort(arrayname, starting index, ending index, Collections.reverseOrder() i.e way of Sorting )