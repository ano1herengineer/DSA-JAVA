// To merge 2 BSTs and make a Balanced BST 

import java.util.*;

public class merge2BSTs
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

    public static Node mergeBSTs(Node root1, Node root2) // O(n+m) time and space
    {
        //Step 1  : Inorder of BST1
        ArrayList<Integer> inorder1 = new ArrayList<>();
        getInorder(root1, inorder1);

        //Step 2 : Inorder of BST2
        ArrayList<Integer> inorder2 = new ArrayList<>();
        getInorder(root2, inorder2);

        //Step 3 : Merge 2 sorted arrays
        int i = 0, j = 0;
        ArrayList<Integer> inorder = new ArrayList<>();

        while(i < inorder1.size() && j < inorder2.size())
        {
            if(inorder1.get(i) < inorder2.get(j))
            {
                inorder.add(inorder1.get(i));
                i++;
            }
            else
            {
                inorder.add(inorder2.get(j));
                j++;
            }
        }

        while(i < inorder1.size())
        {
            inorder.add(inorder1.get(i));
            i++;
        }

        while(j < inorder2.size())
        {
            inorder.add(inorder2.get(j));
            j++;
        }

        //Step 4 : Create a balanced BST from the inorder sequence
        return createBST(inorder, 0, inorder.size() - 1);

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


    public static void main(String args[])
    {
        /*  BST 1

                2
               / \
              1   4
        */

       Node root1 = new Node(2);
       root1.left = new Node(1);
       root1.right = new Node(4);


       /* BST 2

                9
               / \
              3   12
        */

       Node root2 = new Node(9);
       root2.left = new Node(3);
       root2.right = new Node(12);

       // Expected Final BST

       /*

                 3
               /   \
              1     9
               \    / \
                2  4   12
              
       */

        Node root = mergeBSTs(root1, root2);
        preorder(root);

    }
}