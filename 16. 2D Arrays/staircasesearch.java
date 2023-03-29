//search in sorted matrix 

import java.io.*;
import java.util.*;

public class staircasesearch
{
    public static void main(String args[])
    {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 33;
        staircaseSearch(matrix, key);
    }

    public static boolean staircaseSearch(int matrix[][], int key)
    {
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col>= 0)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("key found at (" + row +","+col+")");
                return true;
            }

            else if(key < matrix[row][col])
            {
                col--;
            }
            else{
                row++;
            }
            
        }
        System.out.println("key not found");
        return false;
    }
}

//time complexity of this program depends on whether the rows are bigger or columns 
// when n>>>>m   then Time Complexity = O(n)
// when m>>>>n   then Time Complexity = O(m)


// Staircase Search Time Complexity = O(n+m)
