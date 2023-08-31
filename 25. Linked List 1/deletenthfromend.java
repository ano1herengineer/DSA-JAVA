// Delete nth node from end of linked list

//Approach : Intead of applying the approach to find the nth node from the end 
//           we can use the same approach , to conclude that nth from the end = size - n + 1
//           and then we can delete the node at that index

//Time Complexity : O(n)
//Space Complexity : O(1)

//Asked in = Amazon, Adobe, Qualcomm, Flipkart

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class LinkedList{
    Node head;
    Node tail;

    public void add(int data)
    {
        Node toAdd = new Node(data);
        if(head == null)
        {
            head = tail = toAdd;
        }
        else
        {
            tail.next = toAdd;
            tail = tail.next;
        }
    }

    public void deleteNthfromEnd(int n)
    {
        //calculate the size of the linked list
        int size = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            size++;
        }

        if(n > size)
        {
            System.out.println("Invalid Input");
            return;
        }

        //Corner Case : If the node to be deleted is the first node
        if(n == size)
        {
            head = head.next; //remove the first node
            return;
        }

        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind)
        {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class deletenthfromend {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        System.out.println("Before Deletion : ");
        ll.print();
        ll.deleteNthfromEnd(3);
        System.out.println("\nAfter Deletion : ");
        ll.print();
    }
}