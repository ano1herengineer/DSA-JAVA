// Question 1 

//Intersection of Two Linked Lists

//In a system there are two singly linked list. By some programming error the end node of one of the linked list 
//got linked into the second list, forming a inverted Y shaped list. Write a program to get the point where two linked list merge.

//We have to find the interection part in this system

class pq1
{
    static class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public Node getIntersectionNode(Node head1, Node head2)
    {
        while(head2 != null)
        {
            Node temp = head1;
            while(temp != null)
            {
                if(temp == head2)
                {
                    return temp;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) 
    {
        pq1 list = new pq1();

        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node interectionPoint = list.getIntersectionNode(head1, head2);

        if(interectionPoint != null)
        {
            System.out.println("The interection point is: " + interectionPoint.data);
        }
        else
        {
            System.out.println("No interection point");
        }
        
    }
}


// Imagine you have two lists of items, like a list of books and a list of toys. These lists are like linked lists in this program. Now, let's say there's a mistake, and someone accidentally connects the end of the toy list to the end of the book list, making a Y-shaped list. This is what the program is trying to solve - finding the point where these two lists meet or intersect.

// In the program:

// 1. There's a class called `pq1`, and inside it, there's another class called `Node`. Think of `Node` as a box that can hold an item (like a book or a toy) and a pointer to the next box (the next item in the list).

// 2. In the `getIntersectionNode` method, the program looks at each item in the toy list (head2) and compares it with each item in the book list (head1) one by one. When it finds an item that's the same in both lists, it means that's where the two lists meet, and it returns that item.

// 3. In the `main` method, two lists are created - `head1` and `head2`, representing the book and toy lists. They have items in them, and at some point, they share a common item.

// 4. The program runs the `getIntersectionNode` method to find where these two lists meet. If it finds a meeting point (intersection), it prints out the item at that point. If there's no meeting point, it says there's no intersection.

// In your example:

// - `head1` has items: 10 -> 15 -> 30
// - `head2` has items: 3 -> 6 -> 9 -> 15 (notice that it connects to the same item as in `head1`)

// So, when you run the program, it will tell you that the intersection point is 15 because that's where the two lists connect.

// Imagine it like two paths (lists) that cross each other in a forest, and you're trying to find the exact spot where they cross. That's what this program does with linked lists.