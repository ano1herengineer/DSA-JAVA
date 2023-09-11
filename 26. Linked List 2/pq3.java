// Question 3

//Swapping Nodes in a Linked List

// We have a linked list and two keys in it, swap nodes for two given keys.
// Nodes should be swapped by changing links. Swapping data of nodes may be expensive
// in many situations when data contains many fields.

//It may be assumed that all the keys in the linked list are distinct.

// Sample Input 1:
// 1->2->3->4->5->6->7->8->9->10  , x = 2, y = 4

// Sample Output 1:
// 1->4->3->2->5->6->7->8->9->10

// Sample Input 2:
// 1->2->3->4->5->6->7->8->9->10  , x = 2, y = 10

// Sample Output 2:
// 1->10->3->4->5->6->7->8->9->2

//Time Complexity: O(N)
//Space Complexity: O(1)

import java.util.*;

class Node{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }

}

    class pq3
    {
        Node head;

        public void swapNodes(int x, int y)
        {
            if(x == y)
            {
                return; //if x and y are same, no need to swap
            }

            Node prevX = null, currX = head;
            while(currX != null && currX.data != x) //search for x
            {
                prevX = currX;
                currX = currX.next;
            }

            Node prevY = null, currY = head;
            while(currY != null && currY.data != y) //search for y
            {
                prevY = currY;
                currY = currY.next;
            }

            if(currX == null || currY == null) //if x or y is not present, return
            {
                return;
            }

            if(prevX != null) //if x is not head of linked list
            {
                prevX.next = currY;
            }
            else  //make y the new head
            {
                head = currY;
            }

            if(prevY != null) //if y is not head of linked list
            {
                prevY.next = currX;
            }
            else //make x the new head
            {
                head = currX;
            }

            // Swap next pointers
            Node temp = currX.next;  
            currX.next = currY.next; 
            currY.next = temp; 
        }

        public void push(int new_data)  //insert at beginning
        {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

        public void printList() //print linked list
        {
            Node tnode = head;
            while(tnode != null)
            {
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
        }

        public static void main(String[] args)
        {
            pq3 llist = new pq3();

            llist.push(7);
            llist.push(6);
            llist.push(5);
            llist.push(4);
            llist.push(3);
            llist.push(2);
            llist.push(1);

            System.out.print("\n Linked list before calling swapNodes() ");
            llist.printList();

            llist.swapNodes(4, 2);

            System.out.print("\n Linked list after calling swapNodes() ");
            llist.printList();
        }
    }
