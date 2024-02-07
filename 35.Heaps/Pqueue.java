// Implementation of Priority Queue using JCF(Java Collection Framework)

import java.util.*;  // import java.util.PriorityQueue;

public class Pqueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());

        pq.add(3); // O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);
        
        while(!pq.isEmpty()){
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logn)
        }
    }
}