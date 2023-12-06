//Find the closest element in BST
// We have a Binary Search Tree and target Node K. The task is to find the node with minimum 
// absolute difference with given target value K.

/*

        8
       / \
      5   11
     / \    \
    3   6    20

*/

// Sample Input : K = 5
// Sample Output : 5(difference = 0)

// Sample Input : K = 19
// Sample Output : 20(difference = 1)

// Time Complexity: O(h) where h is the height of the tree
// Space Complexity: O(1)

import java.util.*;

public class pq2
{
    static int min_Diff, min_Diff_Key;
    static class Node
    {
        int key;
        Node left;
        Node right;
    }

    static Node newNode(int key)
    {
        Node temp = new Node();
        temp.key = key;
        temp.left = temp.right = null;
        return temp;
    }

    static void maxDiffUtil(Node ptr, int k)
    {
        if(ptr == null)
        {
            return;
        }

        if(ptr.key == k)
        {
            min_Diff_Key = k;
            return;
        }

        if(min_Diff > Math.abs(ptr.key - k))
        {
            min_Diff = Math.abs(ptr.key - k);
            min_Diff_Key = ptr.key;
        }

        if(k < ptr.key)
        {
            maxDiffUtil(ptr.left, k);
        }
        else
        {
            maxDiffUtil(ptr.right, k);
        }
    }

    static int maxDiff(Node root, int k)
    {
        min_Diff = Integer.MAX_VALUE;
        min_Diff_Key = -1;

        maxDiffUtil(root, k);

        return min_Diff_Key;
    }

    public static void main(String args[])
    {
        Node root = newNode(8);
        root.left = newNode(5);
        root.right = newNode(11);
        root.left.left = newNode(3);
        root.left.right = newNode(6);
        root.right.right = newNode(20);

        int k = 19;

        System.out.println(maxDiff(root, k));
    }

}