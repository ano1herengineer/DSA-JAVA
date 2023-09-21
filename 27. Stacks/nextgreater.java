// Next Greater Element

// The next greater element of some element x in an array is the first greater element that is to the right of x in the same array. 

// arr = [6, 8, 0, 1, 3]
// output = [8, -1, 1, 3, -1]

import java.util.*;

public class nextgreater
{
    public static void main(String args[])
    {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> stack = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--)
        {
            // Step 1: Pop all the elements from the stack which are smaller than the current element
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
            {
                stack.pop();
            }

            //Step 2: If the stack is empty, then there is no greater element to the right of the current element
            if(stack.isEmpty())
            {
                nextGreater[i] = -1;
            }
            else
            {
                // If the stack is not empty, then the top element of the stack is the next greater element
                nextGreater[i] = arr[stack.peek()];
            }

            //Step 3: Push the current element into the stack
            stack.push(i);
        }

        for(int i = 0; i< nextGreater.length; i++)
        {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}

//Next Greater Left = for loop from 0 to n-1
//Next Greater Right = for loop from n-1 to 0

// Next Smaller Element = Same as Next Greater Element but the while loop condition is reversed
// Next Smaller Left = for loop from 0 to n-1
// Next Smaller Right = for loop from n-1 to 0