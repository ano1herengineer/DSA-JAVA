import java.io.*;

//program to print half pyramid

// 1
// 1 2
// 1 2 3
// 1 2 3 4

public class halfpyramid
{
    public static void main(String args[])
    
    {    int n = 9;
        for(int line = 1 ; line <= n ; line++)
        { //print numbers
            for(int num=1; num<=line; num++)
            {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}