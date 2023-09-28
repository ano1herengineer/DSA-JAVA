// Implemenation of a deque using JCF(Java Collection Framework)

// Deque is a double-ended queue that allows insertion and deletion from both the ends
// Deque is an interface, so we cannot create objects of it directly
// We can create objects of classes that implement the Deque interface
// ArrayDeque and LinkedList are the classes that implement the Deque interface

// Deque<Integer> deque = new ArrayDeque<>();
// Deque<Integer> deque = new LinkedList<>();

import java.util.*;

public class deque{
    public static void main(String args[])
    {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(1);
        deque.addLast(200);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);
    }
}

// Predefined methods of Deque interface

// addFirst() - Adds an element at the front of the deque
// addLast() - Adds an element at the end of the deque
// getFirst() - Returns the element at the front of the deque
// getLast() - Returns the element at the end of the deque
// removeFirst() - Removes and returns the element at the front of the deque
// removeLast() - Removes and returns the element at the end of the deque
// peekFirst() - Returns the element at the front of the deque
// peekLast() - Returns the element at the end of the deque
// pollFirst() - Removes and returns the element at the front of the deque
// pollLast() - Removes and returns the element at the end of the deque
// offerFirst() - Adds an element at the front of the deque
// offerLast() - Adds an element at the end of the deque
// size() - Returns the size of the deque
// isEmpty() - Returns true if the deque is empty, else returns false
// contains() - Returns true if the deque contains the specified element, else returns false
// iterator() - Returns an iterator to iterate over the deque
// descendingIterator() - Returns an iterator to iterate over the deque in reverse order
// toArray() - Returns an array containing all the elements of the deque
// toArray(T[] a) - Returns an array containing all the elements of the deque
// clear() - Removes all the elements from the deque
// remove(Object o) - Removes the specified element from the deque
// addAll(Collection c) - Adds all the elements of the specified collection to the deque
// removeAll(Collection c) - Removes all the elements of the specified collection from the deque
// retainAll(Collection c) - Removes all the elements of the deque except those present in the specified collection
// containsAll(Collection c) - Returns true if the deque contains all the elements of the specified collection, else returns false
// equals(Object o) - Returns true if the deque is equal to the specified object, else returns false
// hashCode() - Returns the hash code of the deque
// toString() - Returns a string representation of the deque
// clone() - Returns a shallow copy of the deque
