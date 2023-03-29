import java.io.*;
import java.util.*;

 public class diagonalsum
 {
    public static void main(String args[])
    {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        int result = diagonalSum(matrix);
        System.out.println("Diagonal Sum = "+result);
    }

    public static int diagonalSum(int matrix[][])  //Time Complexity = O(n2) Brute force Approach 
    {
        int sum = 0;
        // for(int i = 0; i<matrix.length; i++)
        // {
        //     for(int j = 0; j<matrix[0].length; j++)
        //     {
        //         if(i==j)
        //         {
        //             sum +=matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1)
        //         {
        //             sum += matrix[i][j];

        //         }
        //     }
        // }

        for(int i =0; i<matrix.length; i++) // Time Complexity = O(n)
        {
            //primary diagonal 
            sum += matrix[i][i];

            //secondary diagonal 
            if(i != matrix.length-1-i)
            {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
 }