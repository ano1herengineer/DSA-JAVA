import java.io.*;
import java.util.*;

public class reversesort
{
    //sorting using Collections 
    //import java.util.Collections;
    public static void main(String args[])
    {
        Integer arr[] = {5, 4, 1, 2, 3};
        Arrays.sort(arr, Collections.reverseOrder()); //type 1
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

//type 2 
// Arrays.sort(arrayname, starting index, ending index, Collections.reverseOrder())

//reverseOrder() function internally uses a Comparator

//Comparator Logic 

//for example 

//public static int compare(int a, int b)
// {
//     a<b  -ve 
//     a==b 0 
//     a>b +ve  
//     return a-b;      for reverse sorting they reversed the logic and returned b-a
// }