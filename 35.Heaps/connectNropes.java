// Connect n ropes with minimum cost

// Given are N ropes of different lengths, we need to connect these ropes into one rope withh minimum cost.
// The cost to connect two ropes is equal to sum of their lengths. 

// Example:
// Input: ropes = [8, 4, 6, 12]
// Output: 58

// Explanation: The optimal way to connect ropes is as follows
// 1. Connect the ropes of length 4 and 6 (cost is 10). Ropes after connecting: [8, 10, 12]
// 2. Connect the ropes of length 8 and 10 (cost is 18). Ropes after connecting: [18, 12]
// 3. Connect the ropes of length 18 and 12 (cost is 30).
// Total cost to connect the ropes is 10 + 18 + 30 = 58

// Approach:
// We can observe that the lengths of the ropes which are picked first are included more than once in total cost.
// Therefore, the idea is to connect smallest two ropes first and recur for remaining ropes. This approach is similar to Huffman Coding. We put smallest ropes down the tree so that they can be repeated multiple times rather than the longer ropes.

// Using Min Heap: i.e Priority Queue
import java.util.*;

public class connectNropes
{
    public static void main(String args[])
    {
        int ropes[] = {2, 3, 3, 4, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < ropes.length; i++)
        {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size() > 1)
        {
            int r1 = pq.remove();
            int r2 = pq.remove();
            int newRope = r1 + r2;
            cost += newRope;
            pq.add(newRope);
        }

        System.out.println("Cost of connecting N ropes = "+ cost);
    }
}

