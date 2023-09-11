// To remove cycle from the linked list

// Approach = Using Slow/Fast Pointers(2 Pointer Approach)
// If there exists a cycle in the linked list, then the fast pointer will eventually meet the slow pointer

// Step 1 = Detect the cycle
// Step 2 = Find Meeting Point 
// Step 3 = Remove Cycle -> last.next = null

//Linked List implementation
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class removecycle
{
    static Node head;

    public static void removeCycle()
    {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null)
        {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if(slow == fast)
            {
                cycle = true; // Cycle is present
                break; 
            }
        }
        if(cycle == false)
        {
            return ;
        }

        //find meeting point
        slow = head;
        Node prev = null; //last node 
        while(slow != fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }
     public void insertAtEnd(int data) 
     {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = toAdd;
        }
    }
    public void print()
    {
        if(head == null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

   public static void main(String[] args) 
    {
        removecycle ll = new removecycle();

        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);


        // Creating a cycle
        ll.head.next.next.next.next.next = ll.head.next.next;

        ll.removeCycle();
        ll.print();
    }
}

