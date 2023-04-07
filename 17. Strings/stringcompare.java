import java.io.*;

public class stringcompare 
{
    public static void main(String args[])
    {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String ("Tony");


        // read about the concept of INTERNING
        // String Interning in Java is a process where identical strings are searched in the string pool and if they are present, the same memory is shared with other strings having the same value. The intern() method creates an exact copy of a String that is present in the heap memory and stores it in the String constant pool
        if(s1 == s2)  // == checks whether both are same at object level 
        {
            System.out.println("Strings same");  // here the strings will be same as string s2 is pointing towards s1
        }
        else
        {
            System.out.println("Strings not same");
        }

        if(s1 == s3)  //instead of using == use (s1.equals(s3)), It returns boolean type value 
        {
            System.out.println("Strings same");
        }
        else
        {
            System.out.println("Strings not same"); // here the strings will not be same as when "new" keyword is used a new String is creted in memory space 
        }

         if(s1.equals(s3)) 
        {
            System.out.println("Strings same");
        }
        else
        {
            System.out.println("Strings not same"); 
        }
    }
}