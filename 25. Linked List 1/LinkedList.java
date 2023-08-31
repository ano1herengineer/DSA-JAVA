

public class LinkedList
{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    

    public static Node head;
    public static Node tail;
    public static int size;

    //ADd in Linked List 
    
    //Add in the beginning(addFirst) = O(1)
    public void addFirst(int data)
    {
        //Step 1 : Create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        //Step 2 : newNode next = head
        newNode.next = head; //linking step

        //Step 3 : head = newNode
        head = newNode;

    }

    //Add in the end(addLast) = O(1)
    public void addLast(int data)
    {
        //Step 1 : Create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        //Step 2 : tail.next = newNode
        tail.next = newNode;

        //Step 3 : tail = newNode
        tail = newNode;
    }

    //Printing the Linked List 
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

    public void add(int idx, int data)
    {
        if(idx == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx - 1)
        {
            temp = temp.next;
            i++;
        }

        // i = idx - 1 ; temp -> previous node
        // i = idx ; temp -> node at idx
        newNode.next = temp.next;
        temp.next = newNode;
    }

 // Methods/Function 
    // add()
    // remove()
    // print()
    // search()

    public int removeFirst()
    {
        if(head == null) //size == 0 i.e Linked List is empty
        {
            System.out.println("Linked List is empty");
            return -1;
        }
        int val = head.data;
        if(head == tail) //size == 1
        {
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        return val;
    }


    public int removeLast()
    {
        if(head == null) //size == 0 i.e Linked List is empty
        {
            System.out.println("Linked List is empty");
            return -1;
        }
        int val = tail.data;
        if(head == tail) //size == 1
        {
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        while(prev.next != tail)
        {
            prev = prev.next;
        }
        // prev -> node at (size - 2)
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int iterativeSearch(int key)  //O(n)
    {
        int idx = 0;
        for(Node temp = head; temp != null; temp = temp.next)
        {
            if(temp.data == key) //key found
            {
                return idx;
            }
            idx++;
        }

        //key not found
        return -1;
    }

    public int recursiveSearch(int key)
    {
        return helper(head, key);
    }

    public int helper(Node head, int key) //Main recursive function
    {
        if(head == null)
        {
            return -1;
        }
        if(head.data == key)
        {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1)
        {
            return -1;
        }
        return idx + 1;
    }

     public void reverse()
       {
          Node prev = null;
          Node curr = tail = head;
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

    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        // Instead od adding each node, we can use a function to add nodes
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.add(2, 5);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        ll.reverse();
        ll.print();
        

        //to find the size of the linked list
        System.out.println("Size of the Linked List is : " + size); //ll.size
        System.out.println("Index of 3 is at = " + ll.iterativeSearch(3));
        System.out.println("Index of 10 is at = "+ ll.iterativeSearch(10));

        //recursiveSearch
        System.out.println("Index of 5 is at = " + ll.recursiveSearch(5));
        System.out.println("Index of 10 is at = "+ ll.recursiveSearch(10));

    }
}