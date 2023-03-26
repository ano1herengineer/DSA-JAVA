// Maximum Subarray Sum using KADANE'S ALGORITHM

import java.io.*;
import java.util.*;

public class maxsubsum3
{
    public static void main(String args[])
    {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
// for special case where all the numbers are negative kadanes will not work.
// in that condition just print the smallest negative number
// It will give the Maximum Subarray Sum 
    public static void kadanes(int numbers[])
    {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<numbers.length; i++)
        {
            cs = cs + numbers[i];
            if(cs < 0)
            {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Maximum Subarray Sum is = "+ ms);
    }
}