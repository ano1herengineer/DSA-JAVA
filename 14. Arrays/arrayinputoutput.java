import java.io.*;
import java.util.*;

public class arrayinputoutput
{
    public static void main(String args[])
    {
        int marks[] = new int[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your marks of phy,chem and maths");

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        marks[2] = 100; //update
        marks[1] = marks[1] + 2; //update
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        int percentage = (marks[1] + marks[0] + marks[2]) / 3 ;
        System.out.println("total percentage  = "+ percentage+"%" );

        //araays length 

        System.out.println("length of array =" + marks.length);
        



    }
}