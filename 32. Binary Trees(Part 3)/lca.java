// Lowest Common Ancestor of a Binary Tree

// Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

// Time Complexity: O(N)    

import java.util.*;

public class lca
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

        int n1 = 4;
        int n2 = 6;

        
        // Node ans = LCA1(root, n1, n2);  //Appraoch 1 FUNCTION CALL
        Node ans = LCA2(root, n1, n2);     //Appraoch 2 FUNCTION CALL
        System.out.println(ans.data);
    }

    public static Node LCA1(Node root, int n1, int n2) //Approach 1
    {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // Last Common Ancestor in the two paths
        int i = 0;
        while(i < path1.size() && i < path2.size())
        {
            if(path1.get(i) != path2.get(i))
            {
                break;
            }
            i++;
        }

        Node lca = path1.get(i-1); // i-1 because we want the last common ancestor 
        return lca;
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path)
    {
        if(root == null)
        {
            return false;
        }

        path.add(root);

        if(root.data == n)
        {
            return true;
        }

        if(getPath(root.left, n, path) || getPath(root.right, n, path))
        {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }

    public static Node LCA2(Node root, int n1, int n2) //Approach 2  O(N) 
    {

        if(root == null || root.data == n1 || root.data == n2)
        {
            return root;
        }

        Node leftLCA = LCA2(root.left, n1, n2);
        Node rightLCA = LCA2(root.right, n1, n2);

        if(leftLCA != null && rightLCA != null)
        {
            return root;
        }

        if(leftLCA != null)
        {
            return leftLCA;
        }
        else
        {
            return rightLCA;
        }
    }
}