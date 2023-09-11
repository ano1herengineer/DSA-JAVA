//Linked List implementation using Java Collections Framework

import java.util.LinkedList;
class llimplementation
{
    public static void main(String args[])
    {
        //create a linked list
        //Here we cannot use primitive data types like int, char, double, float, etc.
        //We can only use wrapper classes like Integer, Character, Double, Float, etc.
        LinkedList<Integer> ll = new LinkedList<>();

        //add elements to the linked list
        //Types of add() method:
        //1. add(Object o) - appends the element to the end of the linked list
        //2. add(int index, Object o) - inserts the element at the specified position
        //3. addFirst(Object o) - inserts the element at the beginning of the linked list
        //4. addLast(Object o) - appends the element to the end of the linked list
        //5. addAll(Collection c) - appends all the elements of the specified collection to the end of the linked list
        //6. addAll(int index, Collection c) - inserts all the elements of the specified collection to the specified position of the linked list
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        //0->1->2->null
        System.out.println(ll);

        //remove elements from the linked list
        //Types of remove() method:
        //1. remove(Object o) - removes the first occurence of the specified element from the linked list
        //2. remove(int index) - removes the element at the specified position from the linked list
        //3. removeFirst() - removes the first element from the linked list
        //4. removeLast() - removes the last element from the linked list
        //5. removeAll(Collection c) - removes all the elements of the specified collection from the linked list
        //6. removeFirstOccurence(Object o) - removes the first occurence of the specified element from the linked list
        //7. removeLastOccurence(Object o) - removes the last occurence of the specified element from the linked list
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }

}