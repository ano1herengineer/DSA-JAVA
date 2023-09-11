// // to make a zig-zag linked list

// //Approach 
// // 1. Find the mid of the linked list
// // 2. Split the linked list into two halves and reverse the second half
// // 3. Zig-Zag merge the two linked lists

// //Time complexity: O(n)

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class zigzagll{
    Node head;

    public void zigzag() {
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head.next;

        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // Reverse the second half of the linked list
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // Alternate Zig-Zag Merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        zigzagll zigzagList = new zigzagll();  //Object of the class for calling the methods

        // Create the linked list and add elements to it
        zigzagList.head = new Node(10);
        zigzagList.head.next = new Node(2);
        zigzagList.head.next.next = new Node(3);
        zigzagList.head.next.next.next = new Node(4);
        zigzagList.head.next.next.next.next = new Node(5);
        zigzagList.head.next.next.next.next.next = new Node(6);
        zigzagList.head.next.next.next.next.next.next = new Node(50);
        zigzagList.head.next.next.next.next.next.next.next = new Node(40);
        zigzagList.head.next.next.next.next.next.next.next.next = new Node(30);
        zigzagList.head.next.next.next.next.next.next.next.next.next = new Node(20);
        zigzagList.head.next.next.next.next.next.next.next.next.next.next = new Node(100);

        System.out.println("Original Linked List:");
        zigzagList.display();

        zigzagList.zigzag();

        System.out.println("Zig-Zag Linked List:");
        zigzagList.display();
    }
}

