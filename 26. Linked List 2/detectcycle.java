// To find out whether there exists a cycle in the linked list or not


//Approach = Using Slow/Fast Pointers(2 Pointer Approach)
//If there exists a cycle in the linked list, then the fast pointer will eventually meet the slow pointer

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class detectcycle
{ static Node head;
    public static boolean isCycle()  //Floyd's Cycle Detection Algorithm
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if(slow == fast)
            {
                return true; // Cycle is present
            }
        }

        return false; // Cycle is not present
    }

    public void insertAtEnd(int data) {
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

    public static void main(String[] args) 
    {
        detectcycle ll = new detectcycle();

        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);

        // Creating a cycle
        ll.head.next.next.next.next.next = ll.head.next.next;

        System.out.println(ll.isCycle());
        
    }
}