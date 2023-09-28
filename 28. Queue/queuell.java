// Queue using Linked List in Java

public class queuell
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null; //By default, the next node is null
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        
        public static boolean isEmpty()
        {
            return head == null && tail == null; //If head and tail are null, then the queue is empty
        }

        //Add to the queue
        public static void add(int data)
        {
            Node newNode = new Node(data); //Create a new node
            if(isEmpty()) //If the queue is empty, then the head and tail point to the new node
            {
                head = newNode;
                tail = newNode;
                return;
            }
            tail.next = newNode; //Add the new node to the end of the queue
            tail = newNode; //Update the tail
        }

        //Remove from the queue
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            else if(head == tail) //If head and tail are equal, then the queue has only one element
            {
                int data = head.data;
                head = null;
                tail = null;
                return data;
            }
            else
            {
                int data = head.data;
                head = head.next; //Update the head
                return data;
            }
        }

        //Print the queue
        public static void print()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        //Peek the queue
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }


    }

    public static void main(String args[])
    {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        q.print();
    }
}