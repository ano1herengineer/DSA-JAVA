//Interleave 2 halves of a queue(even length)

// Input: 1 2 3 4 5 6 7 8 9 10
// Output: 1 6 2 7 3 8 4 9 5 10


import java.util.*; 

public class interleave2Queue
{
    public static void main(String args[])
    {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= 10; i++)
        {
            q.add(i);
        }
        interleave(q);
        System.out.println(q);
    }

    public static void interleave(Queue<Integer> q)
    {
       //New Queue fo9r storing the elements of the first half of the queue
       Queue<Integer> firstHalf = new LinkedList<>();
       int size = q.size();

       for(int i = 0; i < size/2; i++)
       {
           firstHalf.add(q.remove());
       }

       while(!firstHalf.isEmpty())
       {
              q.add(firstHalf.remove());
              q.add(q.remove());
       }
    }
}