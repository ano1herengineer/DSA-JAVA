// Implementation of Stack using Array List

import java.util.ArrayList;

public class stackalist
{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<Integer>();

        //isEmpty()
        public static boolean isEmpty()
        {
            return list.size() == 0;  // we can also use [list.isEmpty()]
        }

        //push()
        public static void push(int data)
        {
            list.add(data);
        }

        //pop()
        public static int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack Underflow");
                return -1;
            }
            else
            {
                int top = list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;

            }
        }

        //peek()
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Stack Underflow");
                return -1;
            }
            else
            {
                int top = list.get(list.size()-1);
                return top;
            }
        }
    }

    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}