// First Non-Repeating Letter in a Stream of Characters
// "Stream of characters" = Hint for using a queue(most likely)

import java.util.*;
public class firstnonrepeat
{
    public static void main(String args[])
    {
        String str = "aabccxb";
        printNonRepeating(str);
 
    }

    public static void printNonRepeating(String str)
    {
        int freq[] = new int[26]; //Assuming the string contains only lowercase letters
        Queue<Character> q = new LinkedList<>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            freq[ch - 'a']++; //Increment the frequency of the character
            q.add(ch);
            while(!q.isEmpty()) //Remove all the characters from the queue whose frequency is greater than 1
            {
                if(freq[q.peek() - 'a'] > 1) //If the frequency of the character at the front of the queue is greater than 1, then remove it
                {
                    q.remove();
                }
                else
                {
                    System.out.print(q.peek() + " "); //Else print the character at the front of the queue
                    break;
                }
            }
            
            if(q.isEmpty()) //If the queue is empty, then all the characters have frequency greater than 1
            {
                System.out.print(-1 + " ");
            }
            System.out.println();
        }

    }
    
}