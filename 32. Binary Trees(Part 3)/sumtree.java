
// Transform to Sum Tree

// Given a Binary Tree of size N , where each node can have positive or negative values.
// Convert this to a tree where each node contains the sum of the left and right sub trees of the original tree.

// Example 1:

// Input:

//              10
//           /      \
//         -2        6
//        /   \      /  \
//       8     -4    7    5

// Output:

//            20
//          /    \
//        4        12
//       /  \     /  \
//     0     0   0    0

import java.util.*;

public class sumtree
{
    public static class Node{
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
                  2     3
                 / \   / \
                4   5 6   7

        */

       //Expected Output

       /*
        
                     27
                   /   \
                  9    13
                 / \   / \
                4   5 6   7

        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root); // To make a summ tree from the given tree

        preorder(root); // To print the tree in preorder
    }

    public static int transform(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;

        return data;
    }

    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

