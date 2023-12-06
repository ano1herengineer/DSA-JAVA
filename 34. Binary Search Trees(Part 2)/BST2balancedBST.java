// BST to Balanced BST

import java.util.*;

public class BST2balancedBST
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = this.right = null;
            
        }
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

    public static void getInorder(Node root, ArrayList<Integer> inorder) // O(n) time and space
    {
        if(root == null)
        {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int start, int end) // O(n) time and space
    {
        if(start > end)
        {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, start, mid - 1);
        root.right = createBST(inorder, mid + 1, end);

        return root;

    }

    public static Node balanceBST(Node root) // O(n) time and space
    {
      // Step 1: Find the inorder sequence of the BST
      ArrayList<Integer> inorder = new ArrayList<>();
      getInorder(root, inorder);


      // Step 2: Create a balanced BST from the inorder sequence 
        root = createBST(inorder, 0, inorder.size() - 1);

        return root;

    }

    public static void main(String args[])
    {
        /*           8
                   /   \
                  6     10
                 /        \
                5          11
               /             \
              3               12
          
        */

       Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        /* Expected Balanced BST
                    8
                  /   \
                 5     11
                / \   /  \
               3   6 10   12
                          
                           
        */

        root = balanceBST(root);
        preorder(root);


    }

}