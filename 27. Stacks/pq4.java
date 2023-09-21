// Question 4 

// Trapping Rain Water
// Given n non-negative integers representing an elevation map where the width of each bar is 1,
// compute how much water it can trap after raining.

// Note : We have already solved this question using Arrays in the previous module, but here we will solve it using Stack

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6

// Input: height = [7,0,4,2,5,0,6,4,0,6]
// Output: 27

// Time Complexity: O(n)
// Space Complexity: O(n)

// Implementation using Stack

import java.util.*;

class pq4 {
    public static void main(String args[]) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int ans = 0;
        Stack<Integer> s = new Stack<>(); // stack to store the indices of the array
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] < height[i]) //Remove bars from the stack until the condition holds
            {
                int top = s.pop(); // pop the top element of the stack
                if (s.isEmpty()) // if the stack is empty then we break
                {
                    break;
                }
                int distance = i - s.peek() - 1; // calculating the distance between the bars
                int bounded_height = Math.min(height[i], height[s.peek()]) - height[top]; // calculating the bounded height of the bars
                ans += distance * bounded_height; // calculating the area of the bars and adding it to the answer variable
            }
            s.push(i); // pushing the index of the array into the stack
        }
        return ans;
    }
}


//  We can use a stack to track the bars that are bounded by the higher left and right bars.
//  This can be done using only one iteration.

//  For this we will keep pushing elements in stack, until an element with higher value than the stack top is found.
//  This denotes that there is a chance of storing position on the left side of the current element with the current bar being an end.
//  So remove the smaller element on left and find the left bar (which is the current top of stack) and the amount
//  of water stored by the left end bar and the current bar being the right end. Continue this till the stack is not empty or a higher value element is found.

//  Now, if the stack is not empty, then we have found a bar at the right side of the current bar that is higher than the current bar.

//  So, we can find the amount of water stored by the right end bar and the current bar being the left end.
//  Add this to the total amount of water stored and continue this till the stack is not empty.
//  If the stack is empty, then we have found a bar at the right side of the current bar that is lower than the current bar.
//  So, push the current bar in the stack and continue the iteration.
