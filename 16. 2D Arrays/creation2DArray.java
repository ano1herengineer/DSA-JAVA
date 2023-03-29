// program to create a 2D Array and print it 

import java.util.*;
import java.io.*;

public class creation2DArray
{
    public static void main(String args[])
    {
        int matrix[][] = new int[3][3];
        int n = matrix.length; // number of rows 
        int m = matrix[0].length; // number of columns

        Scanner sc = new Scanner(System.in);
        for(int i =0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j] = sc.nextInt();

            }
        }
        
        //output
        for(int i =0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);

    }

    public static boolean search(int matrix[][], int key)
    {
         for(int i =0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.println("found at cell (" + i + "," + j +")");
                    return true;
                }

            }
        }
        System.out.println("key not found");
        return false;
    }
}