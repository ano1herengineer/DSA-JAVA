//Question 2 

//Delete n Nodes After M Nodes of a Linked List

// We have a linked list and two integers M and N. 
// Traverse the linked list such that you retain M nodes then delete next N nodes, 
//continue the same till end of the linked list.

// Sample Input 1: 
// M = 2, N = 2
// Linked List: 1->2->3->4->5->6->7->8
// Sample Output 1:
// Linked List: 1->2->5->6

// Sample Input 2:
// M = 3, N = 2
// Linked List: 1->2->3->4->5->6->7->8->9->10
// Sample Output 2:
// Linked List: 1->2->3->6->7->8

// Sample Input 3:
// M = 1, N = 1
// Linked List: 1->2->3->4->5->6->7->8->9->10
// Sample Output 3:
// Linked List: 1->3->5->7->9

// Time Complexity: O(N)
// Space Complexity: O(1)

import java.util.*;
class pq2
{
    static class Node
    {
        int data;
        Node next;
    }

    static Node push(Node head, int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        return head;
    }

    static void printList(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static void skipMdeleteN(Node head, int M, int N)
    {
        Node curr = head, t;
        int count;

        while(curr != null)
        {
            for(count = 1; count < M && curr != null; count++)
            {
                curr = curr.next;
            }

            if(curr == null)
            {
                return;
            }

            t = curr.next;
            for(count = 1; count <= N && t != null; count++)
            {
                Node temp = t;
                t = t.next;
            }
            curr.next = t;
            curr = t;
        }
    }

    public static void main(String args[])
    {
        Node head = null;
        int M =2, N = 2;
        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);

        System.out.println("Given Linked List: ");
        printList(head);
        skipMdeleteN(head, M, N);
        System.out.println("\nLinked List after deletion: ");
        printList(head);
    }

}