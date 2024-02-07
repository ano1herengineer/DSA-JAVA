// Priority Queue in Objects 

import java.util.*; 

public class PQobj
{
    static class Student implements Comparable<Student> //Overriding
    {
        String name;
        int marks;

        public Student(String name, int marks)
        {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student s2)
        {
            return this.marks - s2.marks;
        }

    }

    public static void main(String args[])
    {
        PriorityQueue<Student> pq = new PriorityQueue<Student>();

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name + " -> " + pq.peek().marks);
            pq.remove();
        }
    }
}