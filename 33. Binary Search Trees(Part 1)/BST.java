// Build a BST 

public class BST{
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

    public static void inorder(Node root)
    {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Searching in BST
    public static boolean search(Node root, int key)  //O(H) time complexity
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == key)
        {
            return true;
        }

        if(root.data > key)
        {
            return search(root.left, key);
        }
        else
        {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int key)
    {
        if(root == null)
        {
            return null;
        }

        if(root.data > key)
        {
            root.left = delete(root.left, key);
        }
        
        else if(root.data < key)
        {
            root.right = delete(root.right, key);
        }

        else
        {
            // Node found 
            // Case 1 : No child(leaf Node)
            if(root.left == null && root.right == null)
            {
                return null;
            }

            // Case 2 : One child
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }

            // Case 3 : Two children
            
            
            Node succ = getSuccessor(root);
            root.data = succ.data;
            root.right = delete(root.right, succ.data);
        }

        return root;

    }

    public static Node getSuccessor(Node curr) // utility function for delete to find inorder successor
    {
        curr = curr.right;
        while(curr != null && curr.left != null)
        {
            curr = curr.left;
        }
        return curr;
    }

    public static void printInRange(Node root, int k1, int k2)
    {
        if(root == null)
        {
            return;
        }

        if(root.data >= k1 && root.data <= k2)
        {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1)
        {
            printInRange(root.right, k1, k2);
        }
        else
        {
            printInRange(root.left, k1, k2);
        }
    }

    public static void main(String args[])
    {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);

        if(search(root, 4))
        {
            System.out.println("\nFound");
        }
        else
        {
            System.out.println("\nNot Found");
        }

        // root = delete(root, 10);
        // System.out.println();
        // inorder(root);

        printInRange(root, 5, 11);
    }
}