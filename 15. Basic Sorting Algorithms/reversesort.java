import java.io.*;
import java.util.*;

public class reversesort
{
    //sorting using Collections 
    //import java.util.Collections;
    public static void main(String args[])
    {
        Integer arr[] = {5, 4, 1, 2, 3};
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);

    }

     public static void printArr(Integer arr[])
    {
        System .out.print("Sorted array = ");
        for(int i =0; i<arr.length; i++)
        {
            
            System.out.print(arr[i] +" ");
        }
    }
}