// Implementing a circular queue using an array

public class circularqueueArray
{
    static class queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n) // The constructor of your queue class should match the class name in Java
        {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        //Check if the queue is empty
        public static boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }
    
        //Check whether the queue is full
        public static boolean isFull()
        {
            return (rear+1)%size == front; //The queue is full when the next position of rear is equal to front
        }

        //Add to the circular queue
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }
            else if(isEmpty()) //If front=-1 and rear=-1, then the queue is empty,condition for the first element
            {
                front = 0;
                rear = 0;
            }
            else
            {
                rear = (rear+1)%size; //Increase the size of the queue
            }
            arr[rear] = data; //Add the element to the queue
        }

        //Remove from the circular queue in o(1) time
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            else if(front == rear) //If front and rear are equal, then the queue has only one element
            {
                int temp = arr[front];
                front = -1;
                rear = -1;
                return temp;
            }
            else
            {
                int temp = arr[front];
                front = (front+1)%size; //Increase the size of the queue
                return temp;
            }
        }

        //Peek the front element of the queue
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Warning: Queue is empty");
                return -1;
            }
            return arr[front];
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
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while(!q.isEmpty())
        {
            System.out.println(q.remove());
        }
    }
}