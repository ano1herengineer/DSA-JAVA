// Height of Tree 

public class heightOfTree
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

     System.out.println(height(root));

     System.out.println("Total Number of Nodes = "+ count(root));

     System.out.println("Sum of all Nodes = "+ sum(root));

    }

    public static int height(Node root) // Time Complexity: O(n)
    {
        if(root == null)
        {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int count(Node root) // Time Complexity: O(n)
    {
        if(root == null)
        {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount + rightCount + 1;
    }

    public static int sum(Node root) // Time Complexity: O(n)
    {
        if(root == null)
        {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + rightSum + root.data;
    }

}