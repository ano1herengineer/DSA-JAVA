//Question 2 

// Invert Binary Tree

//Mirror of a Tree: Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.

import java.util.*;

public class pq2
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
                  2     3
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

        System.out.println("Before Inverting Tree the preorder traversal is:");
        preorder(root);

        invertTree(root);

        System.out.println("\nAfter Inverting Tree the preorder traversal is:");
        preorder(root);

        
    }

    public static void invertTree(Node root)
    {
        if(root == null)
        {
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

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