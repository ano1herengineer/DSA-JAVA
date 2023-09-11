// Question 5

// Merge k Sorted Linked Lists

// We have k sorted linked lists, we have to merge them into a single sorted linked list.

// Sample Input 1:
// k = 3, n = 2
// 11 = 1->3->NULL
// 12 = 6->8->NULL
// 13 = 9->10->NULL

// Sample Output 1:
// 1->3->6->8->9->10->NULL

// Sample Input 2:
// k = 3, n = 3
// 11 = 1->3->5->NULL
// 12 = 2->4->6->NULL
// 13 = 7->8->9->NULL

// Sample Output 2:
// 1->2->3->4->5->6->7->8->9->NULL

// Time Complexity: O(Nlogk)
// Space Complexity: O(k)

import java.util.*;

class pq5
{
    public static Node SortedMerge(Node a, Node b) //merge two sorted linked lists
    {
        Node result = null;
        if(a== null) //if a is null, return b
        {
            return b;
        }
        else if(b == null) //if b is null, return a
        {
            return a;
        }
        if(a.data <= b.data) //if a's data is smaller than b's data
        {
            result = a;
            result.next = SortedMerge(a.next, b);
        }
        else //if b's data is smaller than a's data
        {
            result = b;
            result.next = SortedMerge(a, b.next);
        }

        return result;
    }

    public static Node mergeKLists(Node arr[], int k) //merge k sorted linked lists
    {
        int i = 0; //first list
        int last = k - 1; //last list
        int j; //second list

        while(last != 0) //repeat until only one list is left
        {
            i = 0; //first list
            j = last; //second list

            while(i < j) //merge first and last, second and second last and so on
            {
                arr[i] = SortedMerge(arr[i], arr[j]); //merge ith and jth list and store in ith list
                i++;
                j--;

                if(i >= j) //if all pairs are merged, update last
                {
                    last = j;
                }
            }
        }

        return arr[0]; //return first list
    }

    public static void printList(Node node) //print linked list
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[])
    {
        int k = 3;
        int n = 4;

        Node arr[] = new Node[k];
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        Node head = mergeKLists(arr, k);
        printList(head);
    }
}

class Node{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}