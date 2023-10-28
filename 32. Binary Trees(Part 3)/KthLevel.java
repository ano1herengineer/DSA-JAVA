// To print the Kth level of Tree

import java.util.*;

public class KthLevel
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

        int k = 3;

        KLevel(root, 1, k); //0 is the level of root node


    }

    public static void KLevel(Node root, int level, int K)
    {
        if(root == null)
        {
            return;
        }

        if(level == K)
        {
            System.out.print(root.data+" ");
            return;
        }

        KLevel(root.left, level+1, K);
        KLevel(root.right, level+1, K);
    }

}