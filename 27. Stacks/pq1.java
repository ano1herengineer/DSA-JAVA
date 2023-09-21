// Question 1 :

//Palindrome Linked List 
// We have a singlylinked list of characters , write a function that returns true if the 
// given list is a palindrome , else return false

// Input : a -> b -> c -> b -> a -> null
// Output : true

// Input : a -> b -> c -> d -> null
// Output : false

// Input : a -> b -> c -> c -> b -> a -> null
// Output : true


import java.util.*;
class Node
{
    int data;
    Node ptr;
    Node(int data)
    {
        this.data = data;
        this.ptr = null;
    }
}
class pq1
{
    public static void main(String args[])
    {
        Node head = new Node(1);
        head.ptr = new Node(2);
        head.ptr.ptr = new Node(3);
        head.ptr.ptr.ptr = new Node(2);
        head.ptr.ptr.ptr.ptr = new Node(1);
        System.out.println(isPalindrome(head));

    }

    public static boolean isPalindrome(Node head)
    {
        Node slow = head;
        boolean ispalin = true; // assuming that the list is a palindrome
        Stack<Integer> s = new Stack<>(); 

        while(slow != null)
        {
            s.push(slow.data); // pushing the data of the list into the stack
            slow = slow.ptr; // moving the slow pointer
        }
        while(head != null)
        {
            int i = s.pop(); // popping the top element of the stack
            if(head.data == i) // comparing the popped element with the data of the list
            {
                ispalin = true; // if the data matches then the list is a palindrome
            }
            else
            {
                ispalin = false; // if the data does not match then the list is not a palindrome
                break;
            }
            head = head.ptr; // moving the head pointer
        }
        return ispalin;
    }

}