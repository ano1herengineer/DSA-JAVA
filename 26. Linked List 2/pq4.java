// Question 4

// Odd Even Linked List

// We have a Linked List of integers, write a function to modify the Linked List such that all even 
// numbers appear before all the odd numbers in the modified Linked List. 
// Also, keep the order of even and odd numbers same.

// Sample Input 1:
// 8->12->10->5->4->1->6->NULL

// Sample Output 1:
// 8->12->10->4->6->5->1->NULL

// Sample Input 2:
// 8->12->10->5->4->1->6->NULL

// Sample Output 2:
// 8->12->10->4->6->5->1->NULL

// Time Complexity: O(N)
// Space Complexity: O(1)

import java.util.*;

class pq4
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }

    }

    void segregateEvenOdd()  //segregate even and odd nodes
    {
        Node end = head;
        Node prev = null;
        Node curr = head;

        while(end.next != null) //get pointer to last node
        {
            end = end.next;
        }

        Node new_end = end; //new_end is the pointer to last even node

        while(curr.data % 2 != 0 && curr != end) //if first node is odd
        {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        if(curr.data % 2 == 0) //if first node is even
        {
            head = curr;

            while(curr != end) //now curr points to last even node
            {
                if(curr.data % 2 == 0) //if curr node is even
                {
                    prev = curr;
                    curr = curr.next;
                }
                else //if curr node is odd
                {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        }
        else //if first node is odd
        {
            prev = curr;
        }

        if(new_end != end && end.data % 2 != 0) //if end node is odd
        {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }

    void push(int new_data) //insert at beginning
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() //print linked list
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        pq4 llist = new pq4(); //create a new linked list
        llist.push(11);
        llist.push(10);
        llist.push(8);
        llist.push(5);
        llist.push(4);
        llist.push(1);
        llist.push(0);
        System.out.println("Original Linked List");
        llist.printList();

        llist.segregateEvenOdd();

        System.out.println("Modified Linked List");
        llist.printList();
    }
}