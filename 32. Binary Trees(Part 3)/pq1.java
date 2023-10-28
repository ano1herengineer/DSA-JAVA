// Question 1 

// Check if a binary tree is univalued or not

// A binary tree is univalued if all the nodes in the tree have the same value.

// We have a binary tree, the task is to check if the binary trees is univalued or not.
// If found to be univalued, print YES, else print NO.

// Time Complexity: O(N), where N is the number of nodes in the tree.

import java.util.*;

class pq1
{
    static class Node{
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

    public static void main(String args[])
    {
        /*
        
                     1
                   /   \
                  1     1
                 / \   / \
                1   1 1   1

        */

        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);

        if(isUnivalued(root))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

    public static boolean isUnivalued(Node root)
    {
        if(root == null)
        {
            return true;
        }

        if(root.left != null && root.left.data != root.data)
        {
            return false;
        }

        if(root.right != null && root.right.data != root.data)
        {
            return false;
        }

        return isUnivalued(root.left) && isUnivalued(root.right);
    }
}