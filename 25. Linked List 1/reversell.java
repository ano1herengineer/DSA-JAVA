//Linked List reverse

//Follow 4 main steps:

// Create 3 pointers: prev, curr, next
// Iterate through the linked list

//1. curr.next = prev
//2. prev = curr
//3. curr = next
//4. head = prev



class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
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

    public void reverse()
    {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
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

public class reversell
{
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.print();
        ll.reverse();
        System.out.println();
        ll.print();
    }
}

//Space Complexity = O(1)
//Time Complexity = O(n) because we are iterating through the linked list of size n
