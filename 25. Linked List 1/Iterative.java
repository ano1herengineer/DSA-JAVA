// Program to find a key in a linked list using iterative Search i.e Linear Search

public class Iterative 
{
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        System.out.println(list.iterativeSearch(30));
        System.out.println(list.iterativeSearch(50));
    }

    static class LinkedList
    {
        private class Node
        {
            int data;
            Node next;
        }

        private Node head;
        private Node tail;
        private int size;

        public int iterativeSearch(int key)
        {
            int idx = 0;
            for(Node temp = head; temp != null; temp = temp.next)
            {
                if(temp.data == key)
                {
                    return idx;
                }
                idx++;
            }
            return -1;
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