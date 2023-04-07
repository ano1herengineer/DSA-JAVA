import java.util.*;
import java.io.*;

public class stringinput
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your word ");
        System.out.println("enter your sentence");
        String word = sc.nextLine();   // if only you want to take a word use sc.next()
        String sentence = sc.nextLine();
        System.out.println("Word = " + word );
        System.out.println("Sentence = " + sentence);
        int length = sentence.length();  //stringname.length() = to calculate the length of string 
        System.out.println("length of sentence = " + length);
        System.out.println("enter your firstname");
        String firstname = sc.nextLine();
        System.out.println("enter your lastname");
        String lastname = sc.nextLine();
        String fullname = firstname + " " + lastname; //concatenation using '+'
        System.out.println("your fullname is = "+ fullname);
        printLetter(fullname);
    }

    public static void printLetter(String fullname)
    {
        for(int i =0; i<fullname.length(); i++)
        {
            System.out.print(fullname.charAt(i) + " ");   // Stringname.characterAt(index number) = to pick a character from specific index fron the string 
        }
        System.out.println();
    }
}