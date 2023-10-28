//Question 5 

// Maximum Path Sum in a Binary Tree

// We have a binary tree, the task is to find the maximum path sum. The path may start and end at any node in the tree.

// Example 1:

// Input:

//               1
//             /   \
//            2     3

// Output: 6

// Explanation: Max path sum is 2 + 1 + 3 = 6   

import java.util.*;

public class pq5
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int d)
        {
            this.data = d;
            left = null;
            right = null;
        }
    }

    static int maxSum = Integer.MIN_VALUE;


    public static void main(String args[])
    {
        /*
        
                     10
                   /   \
                  2     10
                 / \    /  \
                20  1  -25  3
                             \
                              4

        */

        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(3);
        root.right.right.right = new Node(4);
        root.right.left = new Node(-25);
        

        System.out.println(maxPathSum(root));
    }

    public static int maxPathSum(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        maxPathSumUtil(root);
        return maxSum;
    }

    public static int maxPathSumUtil(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = maxPathSumUtil(root.left);
        int right = maxPathSumUtil(root.right);

        int max1 = Math.max(Math.max(left, right) + root.data, root.data);
        int max2 = Math.max(max1, left + right + root.data);

        maxSum = Math.max(maxSum, max2);

        return max1;
    }

    
}