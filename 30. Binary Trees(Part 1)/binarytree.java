// Build Binary Tree 

import java.util.*;
import java.io.*;
public class binarytree
{
    public static class Node
    {
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

    static class BinaryTree
    {
        static int index = -1;
        public static Node buildTree(int nodes[])
        {
            index++;
            if(index >= nodes.length || nodes[index] == -1)
            {
                return null;
            }
            Node nn = new Node(nodes[index]);
            nn.left = buildTree(nodes);
            nn.right = buildTree(nodes);
            return nn;
        }

        public static void preorder(Node root) // Root, Left, Right  [O(n)]
        {
            if(root == null)
            {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) // Left, Root, Right  [O(n)]
        {
            if(root == null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) // Left, Right, Root  [O(n)]
        {
            if(root == null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // Level Order Traversal
        public static void levelorder(Node root)
        {
            if(root == null)
            {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
                Node currNode = q.remove();
                if(currNode == null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else
                {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null)
                    {
                        q.add(currNode.right);
                    }
                }
            }

        }
    }

    public static void main(String args[])
    {
        int nodes[] ={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);

        System.out.println("Preorder Traversal");
        tree.preorder(root);

        System.out.println("\nInorder Traversal");
        tree.inorder(root);

        System.out.println("\nPostorder Traversal");
        tree.postorder(root);

        System.out.println("\nLevelorder Traversal");
        tree.levelorder(root);
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)