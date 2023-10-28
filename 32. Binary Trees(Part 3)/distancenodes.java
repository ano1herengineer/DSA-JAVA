// Minimum Distance between Nodes

import java.util.*;
public class distancenodes
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

        int n1 = 4, n2 = 6;

        System.out.println(minDistance(root, n1, n2));


    }

    public static int minDistance(Node root, int n1, int n2)
    {
        Node lca = LCA2(root, n1, n2);

        int d1 = lcaDist(lca, n1);
        int d2 = lcaDist(lca, n2);

        return d1 + d2;

    }

    public static int lcaDist(Node root, int n)
    {
        if(root == null)
        {
            return -1;
        }

        if(root.data == n)
        {
            return 0;
        }

        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);

        if(left == -1 && right == -1)
        {
            return -1;
        }
        else if(left == -1)
        {
            return right + 1;
        }
        else
        {
            return left + 1;
        }
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