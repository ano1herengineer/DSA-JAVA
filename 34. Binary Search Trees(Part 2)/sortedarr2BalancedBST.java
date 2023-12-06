// Sorted array to balanced BST

import java.util.*;

public class sortedarr2BalancedBST {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static Node createBST(int[] arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid], null, null);
        node.left = createBST(arr, start, mid - 1);
        node.right = createBST(arr, mid + 1, end);

        return node;
    }

    public static void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }   

    public static void main(String[] args){
        int[] arr = {3, 5, 6, 8, 10, 11, 12};
        Node root = createBST(arr, 0, arr.length - 1);
        preOrder(root);
    }

}