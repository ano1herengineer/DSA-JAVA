// Sliding Window Maximum O(nlogk)

// It can also be solved in O(n) using deque

// Given an array of integers and a number k, find the maximum element of the array in the window of size k.

// Important Points
// 1. We need to find the maximum element of the array in the window of size k.
// 2. We can solve this problem using a max heap.
// 3. We can also solve this problem using a deque in O(n) time.

// Important Points

import java.util.*;

public class slidingwindowmax
{
    static class Pair implements Comparable<Pair>
    {
        int val;
        int idx;

        public Pair(int val, int idx)
        {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2)
        {
            return p2.val - this.val;  //Max Heap
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int res[] = new int[arr.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        //1st window
        for(int i = 0; i<k; i++)
        {
            pq.add(new Pair(arr[i], i));
        }
        res[0] = pq.peek().val;

        //rest of the windows

        for(int i = k; i<arr.length; i++)
        {
            while(pq.size() > 0 && pq.peek().idx <= i-k)
            {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }

        for(int i = 0; i<res.length; i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}


