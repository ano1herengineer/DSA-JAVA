// Check whether the given linked list is a palindrome or not

//Palindrome means that the linked list is same when read from front and back

//Arrpoach : 

// Step 1:(Find Middle)   Using Slow/Fast Pointers to calculate the middle of the linked list

// Step 2:(Half LL reverse)   Reverse the second half of the linked list

// Step 3: (Compare 1st half with 2nd half)  Compare the first half and the second half of the linked list

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class palindromell
{
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

    // Slow Fast Pointers Approach
    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next; // slow is moving one step at a time
            fast = fast.next.next; // fast is moving two steps at a time
        }
        return slow; // slow is the middle of the linked list
    }

    public boolean checkpalindrome()
    {
        if(head == null || head.next == null)
        {
            return true;
        }
        //Step 1 - Find the middle of the linked list
        Node midNode = findMid(head);

        //Step 2 - Reverse the second half of the linked list
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;



        //Step 3 - Compare the first half and the second half of the linked list
        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(4);
        ll.add(2);
        ll.add(1);

        System.out.println(ll.checkpalindrome());
    }
}

