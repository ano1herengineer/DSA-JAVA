// Implementation of queue using array
// Constraints: Array has a fixed size, Remove operation is expensive(done in O(n) time)


public class queueArray
{
    static class queue{
        static int arr[];
        static int size;
        static int rear;

        queue(int n) // The constructor of your queue class should match the class name in Java
        {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty()
        {
            return rear == -1;
        }

        //Add an element to the queue
        public static void add(int data)
        {
            if(rear == size-1)
            {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1; //Increase the size of the queue
            arr[rear] = data; //Add the element to the queue
        }

        //Remove an element from the queue
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0]; //Store the front element
            for(int i=0; i<=rear; i++)
            {
                arr[i] = arr[i+1]; //Shift the elements to the left
            }
            rear = rear - 1; //Reduce the size of the queue
            return front;
        }

        //Peek the front element of the queue
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Warning: Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[])
    {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // 1 2 3 4 5

        while(!q.isEmpty())
        {
            System.out.println(q.remove());
        }
    }
}