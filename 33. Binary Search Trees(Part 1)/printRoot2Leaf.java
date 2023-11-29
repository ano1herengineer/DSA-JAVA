// To print a BST from root to tree (All possible paths from root to leaf node)

import java.util.*;

public class printRoot2Leaf
{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data = d;
            left = right = null;
        }
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

    public static void Root2Leaf(Node root, ArrayList<Integer> path)
    {
        if(root == null)
        {
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null)
        {
            printPath(path);
        }

        Root2Leaf(root.left, path);
        Root2Leaf(root.right, path);

        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path)
    {
        for(int i=0; i<path.size(); i++)
        {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("NULL");
    }

    public static void main(String args[])
    {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        ArrayList<Integer> path = new ArrayList<Integer>();
        Root2Leaf(root, path);
    }
}