// Question 3 

// Delete leaf Nodes from a Binary Tree with value as x

// Given a Binary Tree and a value x, delete all leaf nodes with value equal to x.
// Also delete the newly formed leaves with the target value as x.

import java.util.*;

public class pq3
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
                  2     4
                 / \   / \
                4   5 4   4

        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(4);
        root.right.right = new Node(4);


        int x = 4;

        System.out.println("Before deleting leaf nodes with value "+x+" the preorder traversal is:");
        preorder(root);

        root = deleteLeafNodes(root, x);

        System.out.println("\nAfter deleting leaf nodes with value "+x+" the preorder traversal is:");
        preorder(root);

        
    }

    public static Node deleteLeafNodes(Node root, int x)
    {
        if(root == null)
        {
            return null;
        }

        root.left = deleteLeafNodes(root.left, x);
        root.right = deleteLeafNodes(root.right, x);

        if(root.left == null && root.right == null && root.data == x)
        {
            return null;
        }

        return root;
    }

    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}