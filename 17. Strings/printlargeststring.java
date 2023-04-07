// program to print the largest string lexicographically 

public class printlargeststring
{
    public static void main(String args[])
    {
        String fruits[] = { "apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++)
        {
            if(largest.compareTo(fruits[i]) < 0)
            {
                largest = fruits[i];
            }
        }

        System.out.println(largest);
        
    }
}

// Time Complexity = O( x * N) 

// where
//  x = length of largest word
//  N = length of array