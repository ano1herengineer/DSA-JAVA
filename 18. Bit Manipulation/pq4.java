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



// This code converts uppercase characters to lowercase. It does this by performing a bitwise OR operation between the ASCII value of the uppercase character and the ASCII value 
// of the space character (' '). The ASCII value of the space character is 32 in decimal or 0x20 in hexadecimal. 
// When you perform a bitwise OR operation between an uppercase character and the space character,
//  it sets the sixth bit (counting from right to left) of the uppercase character to 1, which corresponds to the lowercase version of that character. Here’s how it works:

// The loop iterates over all uppercase characters from ‘A’ to ‘Z’.
// For each character, it performs a bitwise OR operation with ’ ’ (space).
// This sets the sixth bit of the character to 1, which corresponds to the lowercase version of that character.
// The resulting value is cast back to a char and printed using System.out.print().