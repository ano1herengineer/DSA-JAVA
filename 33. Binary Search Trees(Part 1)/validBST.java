// To Validate a BST (Binary Search Tree)

import java.util.*;

public class validBST
{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }

    public static boolean isValidBST(Node root, Node min, Node max)
    {
        if(root == null)
        {
            return true;
        }

        if(min != null && root.data <= min.data)
        {
            return false;
        }

        if(max != null && root.data >= max.data)
        {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);

    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            // insert in left subtree
            root.left = insert(root.left, data);
        }
        else{
            // insert in right subtree
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void main(String args[])
    {
        // int values[] = {8, 5, 3, 6, 10, 11, 14}; Valid BST
        int values[] = {1, 1, 1, 1, 1, 1, 1}; // Not a Valid BST
        Node root = null;

        for(int i=0; i<values.length; i++)
        {
            root = insert(root, values[i]);
        }

        if(isValidBST(root, null, null))
        {
            System.out.println("Valid BST");
        }
        else
        {
            System.out.println("Not a Valid BST");
        }
    }
}