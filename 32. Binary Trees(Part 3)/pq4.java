// Question 4 

// Find all Duplicate Subtrees

// We have a binary tree, the task is to find all duplicate subtrees.For each duplicate subtrees, we only need to return the root node of any one of them.
// Two trees are duplicate if they have the same structure with same node values.

// Example 1:

// Input:

//               1
//             /   \
//            4     3
//          /      /  \
//         3      4    3
//               /    
//              3

// Output: [4, 3]

import java.util.*;

public class pq4
{

    static HashMap<String, Integer> m;
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
                  4     3
                 /     / \
                3     4   3
                     /    
                    3

        */

        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        root.right.left.left = new Node(3);


        m = new HashMap<>();
        findDuplicateSubtrees(root);


         
    }

    public static String findDuplicateSubtrees(Node root)
    {
        if(root == null)
        {
            return "";
        }

        String s = "(";
        s += findDuplicateSubtrees(root.left);
        s += Integer.toString(root.data);
        s += findDuplicateSubtrees(root.right);
        s += ")";

        if(m.containsKey(s) && m.get(s) == 1)
        {
            System.out.println(root.data);
        }

        if(m.containsKey(s))
        {
            m.put(s, m.get(s) + 1);
        }
        else
        {
            m.put(s, 1);
        }

        return s;
    }



}