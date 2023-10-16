// To find out the top view of Tree

// We will be using HashMap, Level Order Traversal and Horizontal Distance to find out the top view of Tree

import java.util.*;

public class topview
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

        TopView(root);

    }

     static class Info{
        Node node;
        int hd;
        public Info(Node node, int hd)
        {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void TopView(Node root)
    {
        // Level Order Traversal

        Queue<Info> q = new LinkedList<>();

        HashMap<Integer, Node> map = new HashMap<>();   // To store the first node of each horizontal distance

        int min =0, max = 0;
        q.add(new Info(root, 0));  // Adding the root node with horizontal distance 0
        q.add(null);   // Adding null to mark the end of first level

        while(!q.isEmpty())
        {
            Info curr = q.remove();
            
            if(curr == null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }

            else
            {

            if(!map.containsKey(curr.hd)) // first time we are seeing this horizontal distance
            {
                map.put(curr.hd, curr.node); //then add key,value pair 
            }

            if(curr.node.left != null) // if left child exists
            {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }

            if(curr.node.right != null) // if right child exists
            {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }

            }

            
        }

        for(int i = min; i <= max; i++)
        {
            System.out.print(map.get(i).data + " ");
        }
    }
}