// Question 5

// MAximum Sum BST in Binary Tree

// We have a Binary Tree , the task is to print the maximum sum of nodes of a Subtree 
// which is also a Binary Search Tree in the given Binary Tree.

/*      5
       / \
      9   2
     /     \
    6       3
   / \
  8   7   

 */  

// Sample Output : 8

// Time Complexity: O(N)
// Space Complexity: O(N)

import java.util.*;

class pq5 {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        int max;
        int min;
        boolean isBST;
        int sum;
        int currmax;

        Info(int m, int mi, boolean is, int su, int cur) {
            max = m;
            min = mi;
            isBST = is;
            sum = su;
            currmax = cur;
        }

        Info() {
        }
    }

    static class INT {
        int a;
    }

    static Info MaxSumBSTUtil(Node root, INT maxsum) {
        // Base case: If the root is null, return information for an empty tree
        if (root == null)
            return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, true, 0, 0);

        // If the current node is a leaf node, return information for a single node tree
        if (root.left == null && root.right == null) {
            maxsum.a = Math.max(maxsum.a, root.data);
            return new Info(root.data, root.data, true, root.data, maxsum.a);
        }

        // Recursively get information for the left and right subtrees
        Info L = MaxSumBSTUtil(root.left, maxsum);
        Info R = MaxSumBSTUtil(root.right, maxsum);

        // Information for the current subtree
        Info BST = new Info();

        // Check if the current subtree is a BST
        if (L.isBST && R.isBST && L.max < root.data && R.min > root.data) {
            // Update the maximum and minimum values for the current subtree
            BST.max = Math.max(root.data, Math.max(L.max, R.max));
            BST.min = Math.min(root.data, Math.min(L.min, R.min));

            // Update the maximum sum if the current subtree is a BST
            maxsum.a = Math.max(maxsum.a, R.sum + root.data + L.sum);

            // Update the sum for the current subtree
            BST.sum = R.sum + root.data + L.sum;

            // Update the current maximum sum
            BST.currmax = maxsum.a;

            // Indicate that the current subtree is a BST
            BST.isBST = true;

            return BST;
        }

        // If the current subtree is not a BST, indicate it
        BST.isBST = false;

        // Update the current maximum sum
        BST.currmax = maxsum.a;

        // Update the sum for the current subtree
        BST.sum = R.sum + root.data + L.sum;

        return BST;
    }

    static int MaxSumBST(Node root) {
        INT maxsum = new INT();
        maxsum.a = Integer.MIN_VALUE;
        return MaxSumBSTUtil(root, maxsum).currmax;
    }

    public static void main(String args[]) {
        // Sample Binary Tree
        Node root = new Node(5);
        root.left = new Node(14);
        root.right = new Node(3);
        root.left.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(1);

        // Calculate and print the maximum sum of nodes for a subtree that is also a BST
        System.out.println(MaxSumBST(root));
    }
}
