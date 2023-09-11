// To perform merge sort on a linked list

//Step 1: Find the middle of the linked list
//Step 2: Apply merge sort on the first half and second half of the linked list
//Step 3: Merge the two sorted linked lists

//Time complexity: O(nlogn)

import java.util.LinkedList;

class mergesortll{
    private Node getMid(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the linked list
        Node mid = getMid(head);

        // Split the linked list into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Recursively sort both halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge the sorted halves
        return merge(newLeft, newRight);
    }

    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(10);
        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(8);
        ll.addLast(1);
        ll.addLast(6);
        ll.addLast(4);
        ll.addLast(7);
        ll.addLast(3);
        ll.addLast(9);

        System.out.println(ll);

        mergesortll obj = new mergesortll();
        Node head = new Node(-1);
        Node temp = head;
        for (int i = 0; i < ll.size(); i++) {
            temp.next = new Node(ll.get(i));
            temp = temp.next;
        }
        head = head.next;

         Node sortedHead = obj.mergeSort(head);
         while (sortedHead != null) {
            System.out.print(sortedHead.data + " ");
            sortedHead = sortedHead.next;
        }
    }
}
