// Question 4

// Two Sum BSTs

// Given a BST, transform it into a greater sum tree where each node contains sum of all nodes greater than that node.

// Sample Input 1:

/*       5
        / \
       3   7
      / \  /\
     2  4  6 8

        
         10
        /  \
       6    15
      / \   / \
     3   8 11  18
    
*/

// x = 16

// Sample Output 1: 3
// The pairs are (5,11) and (6, 10) and (8,8)

// Time Complexity: O(n1 + n2)
// Space Complexity: O(h1 + h2)

import java.util.*;
 class Node
    {
        int data;
        Node left;
        Node right;
    
     
    Node(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
    }
public class pq4
{
    

    static Node root1;
    static Node root2;

    static int countPairs(Node root1, Node root2, int x)
    {
        if(root1 == null || root2 == null)
        {
            return 0;
        }

        int count = 0;

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        Node top1, top2;

        while(true)
        {
            while(root1 != null)
            {
                s1.push(root1);
                root1 = root1.left;
            }

            while(root2 != null)
            {
                s2.push(root2);
                root2 = root2.right;
            }

            if(s1.isEmpty() || s2.isEmpty())
            {
                break;
            }

            top1 = s1.peek();
            top2 = s2.peek();

            if((top1.data + top2.data) == x)
            {
                count++;

                s1.pop();
                s2.pop();

                root1 = top1.right;
                root2 = top2.left;
            }
            else if((top1.data + top2.data) < x)
            {
                s1.pop();
                root1 = top1.right;
            }
            else
            {
                s2.pop();
                root2 = top2.left;
            }
        }

        return count;
    }

    public static void main(String args[])
    {
        root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);

        int x = 16;

        System.out.println(countPairs(root1, root2, x));
    }

}