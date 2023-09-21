//Implementation of Stack using Linked List

import java.util.LinkedList;

public class stackllist
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

        static class Stack{
            static Node head = null;

            //isEmpty()
            public static boolean isEmpty()
            {
                return head == null;
            }

            //push()
            public static void push(int data)
            {
                Node newNode = new Node(data);

                if(isEmpty())
                {
                    head = newNode;
                    return;
                }

                newNode.next = head;
                head = newNode;
            }

            //pop()
            public static int pop()
            {
                if(isEmpty())
                {
                    System.out.println("Stack Underflow");
                    return -1;
                }

                else{
                    int top = head.data;
                    head = head.next;
                    return top;
                }
            }

            //peek()
            public static int peek()
            {
                if(isEmpty())
                {
                    System.out.println("Stack Underflow");
                    return -1;
                }
                else{
                    return head.data;
                }
            }

        }
    }

    public static void main(String args[])
    {
        Node.Stack s = new Node.Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}