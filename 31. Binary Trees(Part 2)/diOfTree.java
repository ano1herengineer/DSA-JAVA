// To Calculate the Diameter of a Binary Tree

public class diOfTree
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

       // System.out.println(diameter1(root));

        Info ans = diameter2(root);
        System.out.println(ans.diam);

     

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

    public static int diameter1(Node root) // Time Complexity: O(n^2)  Approach 1 
    {
        if(root == null)
        {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDiameter = diameter1(root.left);
        int rightDiameter = diameter1(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));

        
    }

    static class Info
    {
        int diam;
        int ht;

        public Info(int diam, int ht)
        {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root) // Time Complexity: O(n)  Approach 2
    {
        if(root == null)
        {
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int selfDiam = leftInfo.ht + rightInfo.ht + 1;
        int maxDiam = Math.max(selfDiam, Math.max(leftInfo.diam, rightInfo.diam));
        int selfHeight = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(maxDiam, selfHeight);
    }
}