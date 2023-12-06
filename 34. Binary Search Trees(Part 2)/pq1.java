//Question 1 

// Range Sum of BST
// We have a Binary Search Tree consisting of N nodes and two positive integers L and R, 
// the task is rteurn the sum of all nodes with values between L and R (inclusive).

// Sample Input

/*       8
        / \
       5   11
      / \    \
     3   6    20
*/

// Sample Output : 19

// Time Complexity: O(N)
// Space Complexity: O(N)

import java.util.*;

public class pq1 {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    static int sum = 0;

    static int rangeSumBST(Node root, int low, int high) {
        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr.data >= low && curr.data <= high) {
                sum += curr.data;
            }

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }

        return sum;
    }

    static Node insert(Node root, int data) {
        if (root == null) {
            return newNode(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 8);
        root = insert(root, 5);
        root = insert(root, 11);
        root = insert(root, 3);
        root = insert(root, 6);
        root = insert(root, 20);

        int low = 7, high = 15;

        System.out.println(rangeSumBST(root, low, high));
    }
}
