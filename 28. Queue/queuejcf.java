//Implementataion of Queue using Java Collection Framework

import java.util.*; //Importing the java.util package

public class queuejcf
{
    public static void main(String args[])
    {
        //Queue is an interface, so we cannot instantiate it directly using new operator
        //We can use LinkedList class to instantiate a Queue object as LinkedList implements Queue interface
          
        //Queue q = new Queue(); //This will give an error
        Queue<Integer> q = new LinkedList<Integer>(); //Creating a Queue object

        //Instead of LinkedList, we can also use ArrayDeque class to instantiate a Queue object
        //Queue<Integer> q = new ArrayDeque<Integer>(); //Creating a Queue object

        //Adding elements to the queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        //Printing the queue
        System.out.println("Queue: " + q);

        while(!q.isEmpty())
        {
            //Removing the head of the queue
            System.out.println("Removed from the queue: " + q.remove());
        }

    }
}