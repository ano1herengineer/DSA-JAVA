// array as a function argument 
// pass by refernece i.e changes are reflected in main method also 

import java.io.*;

public class arrayfunction
{
    public static void update(int marks[], int nonChangeable)
    {
        nonChangeable = 10;
        for(int i =0; i<marks.length; i++)
        {
            marks[i] = marks[i] + 1;
        }

    }

    public static void main(String args[])
    {
        int marks[] = {99, 98, 97};
        int nonChangeable = 5;
        update(marks, nonChangeable);
        //here updated through call by reference 
        System.out.println(nonChangeable);

        for(int i =0; i<marks.length; i++)
        {
            System.out.print(marks[i] + " ");
        }

        System.out.println();


    }
}

// Note that the nonChangeable parameter in the update method is passed by value,
// so while its value is changed within the method, it does not change the value of the nonChangeable
// variable in the  main method. On the other hand, the marks array is passed by reference, so any changes made to it within the 
// update method are reflected in the main method.