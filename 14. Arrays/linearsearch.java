import java.io.*;
import java.util.*;

public class linearsearch
{
    public static void main(String args[])
    {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 12;
        int index = linearSearch(numbers, key);

        if(index == -1)
        {
            System.out.println("key not found");
        }
        else{
            System.out.println("key found at index = " +index);
        }
    }

    public static int linearSearch(int numbers[], int key)
    {
        for(int i =0; i<numbers.length; i++)
        //Instead of `i<=numbers.length`, it should be `i < numbers.length`,
        // as the array is 0-indexed, and the last index is `numbers.length-1`. 

        {
            if (numbers[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
}