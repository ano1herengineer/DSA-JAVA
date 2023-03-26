import java.io.*;
import java.util.*;

public class pq1{
    public static void main(String args[]){
        int array[] = {1, 2, 3, 4, 5};
        int result = findDuplicate(array);

        if(result == 0){
            System.out.println("false"); // no duplicate value found 
        }
        else{
            System.out.println("true"); //duplicate value found 

        }

    }

    public static int findDuplicate(int array[])
    {
        int value = 0;
        for(int i=0; i<array.length; i++)
        {
            value = array[i];
            for(int j =i+1; j<array.length; j++)
            {
                if (value == array[j])
                {
                    return 1;
                }
            }
        }
        return 0;
    }
}