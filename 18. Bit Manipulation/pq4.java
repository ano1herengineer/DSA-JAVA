// This question is based on a trick, please directly look at the solution.Convert uppercase characters to lowercase using bits.

public class pq4
{
    public static void main(String args[])
    {
        // Convert Upper case characters to lowercase
        for(char ch = 'A' ; ch <= 'Z'; ch++)
        {
            System.out.print((char)(ch | ' '));
            //prints abcds small
        }
    }
}