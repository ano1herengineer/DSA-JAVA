// To calculate the stock span, we will use the same logic as above but instead of pushing the data at the bottom of the stack, we will push the index of the data at the bottom of the stack.

//Ususally calculating the prevHigh is done using a loop for each index which gives O(n^2) Time Complexity. But using stacks we can do it in O(n) Time Complexity.

// O(n) Time Complexity and O(n) Space Complexity

import java.util.*;

public class stockspan
{
    public static void main(String args[])
    {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for(int i= 0; i< span.length; i++)
        {
            System.out.print(span[i] + " ");
        }
    }

    public static void stockSpan(int stocks[], int span[])
    {
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);

        for(int i = 1; i < stocks.length; i++)
        {
            int currPrice = stocks[i];
            while(!stack.isEmpty() && stocks[stack.peek()] < currPrice)
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                span[i] = i + 1;
            }
            else
            {
                int prevHigh = stack.peek();
                span[i] = i - prevHigh;
            }

            stack.push(i);
        }
    }
}