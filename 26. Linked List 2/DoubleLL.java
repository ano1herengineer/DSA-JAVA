public class DoubleLL
{
    public class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    //addLast
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //removeFirst
    public void removeFirst()
    {
        if(head == null)
        {
            return;
        }
        if(head == tail) //size = 1
        {
            head = tail = null;
            return;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        head.prev = null;
        size--;
    }

    //removeLast
    public void removeLast()
    {
        if(head == null)
        {
            return;
        }
        if(head == tail)
        {
            head = tail = null;
            return;
        }

        Node temp = tail;
        tail = tail.prev;
        temp.prev = null;
        tail.next = null;
        size--;
    }

    //print
    public static void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }   

    //reverse
    public void reverse()
    {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        Node temp = head;
        head = tail;
        tail = temp;
    }

    public static void main(String args[])
    {
        DoubleLL dll = new DoubleLL();

        dll.addFirst(50);
        dll.addFirst(40);
        dll.addFirst(30);
        dll.addFirst(20);
        dll.addFirst(10);

        dll.print();
        System.out.println(dll.size);

        dll.addLast(60);
        dll.addLast(70);
        dll.addLast(80);
        dll.print();
        System.out.println(dll.size);

        dll.removeFirst();
        System.out.println("After removing first element:");
        dll.print();

        dll.removeLast();
        System.out.println("After removing last element:");
        dll.print();

        dll.reverse();
        System.out.println("After reversing the list:");
        dll.print();

    }
}