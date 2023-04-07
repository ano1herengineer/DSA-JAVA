import java.io.*;

public class stringbuild
{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch<='z' ; ch++)
        {
            sb.append(ch);
        }
        //time complexity =O(n)
        //as we have used String Builder instead of a String thus the Time Complexity is not increased.
        System.out.println(sb);
    }

    // if we have used String, Time Complexity = O( 26 * n^2) I.E  approx O(n^2)

}