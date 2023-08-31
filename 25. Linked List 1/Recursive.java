// program to find a key in Linked List using recursive Search i.e recursion 

public class Recursive
{
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        System.out.println(list.recursiveSearch(30));
        System.out.println(list.recursiveSearch(50));
    }

    public static class LinkedList
    {
        private class Node
        {
            int data;
            Node next;
        }

        private Node head;
        private Node tail;
        private int size;

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

        public void addLast(int val)
        {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0)
            {
                head = tail = temp;
            }
            else
            {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }

}