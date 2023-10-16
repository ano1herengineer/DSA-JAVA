// Subtree of another tree

//Given the roots of two binary trees root and subroot, return true if there is a subtree of root with the same structure and node values of subroot and false otherwise.

//A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.

//Example 1:

//Input: root = [3,4,5,1,2], subroot = [4,1,2]
//Output: true

//Example 2:

//Input: root = [3,4,5,1,2,null,null,null,null,0], subroot = [4,1,2]
//Output: false

import java.util.*;

public class subtreematch 
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

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
            
                       2
                     /   \
                    4     5
    
        */

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(isSubtree(root, subroot));


    }

    public static boolean isSubtree(Node root, Node subroot)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == subroot.data)
        {
            if(isIdentical(root, subroot))
            {
                return true;
            }
        }

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static boolean isIdentical(Node root, Node subroot)
    {
        if(root == null && subroot == null)
        {
            return true;
        }

        if(root == null || subroot == null || root.data != subroot.data)
        {
            return false;
        }

        if(!isIdentical(root.left, subroot.left))
        {
            return false;
        }

        if(!isIdentical(root.right, subroot.right))
        {
            return false;
        }

        return true;
    }
}