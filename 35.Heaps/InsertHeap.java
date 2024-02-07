// Insert in a Heap

import java.util.*;

public class InsertHeap
{
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<Integer>();

        public void add(int data)  // O(logn)  
        {
            // Add the element at the end of the array
            arr.add(data);

            // Now, we need to check if the heap property is violated or not
            // If it is violated, we need to swap the element with its parent
            int childIndex = arr.size() - 1;
            int parentIndex = (childIndex - 1) / 2;

            while(arr.get(childIndex) < arr.get(parentIndex))  // To make it a MAX HEAP, change the sign
            {
                // Swap the elements
                int temp = arr.get(childIndex);
                arr.set(childIndex, arr.get(parentIndex));
                arr.set(parentIndex, temp);

                // Update the indices
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }

        public int peek()  // O(1)
        {
            return arr.get(0);
        }

        private void heapify(int index)
        {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;

            int minIndex = index;

            if(leftChildIndex < arr.size() && arr.get(leftChildIndex) < arr.get(minIndex)) // To make it a MAX HEAP, change the sign of the comparison (i.e. arr.get(leftChildIndex) > arr.get(minIndex)
            {
                minIndex = leftChildIndex;
            }

            if(rightChildIndex < arr.size() && arr.get(rightChildIndex) < arr.get(minIndex)) // To make it a MAX HEAP, change the sign of the comparison (i.e. arr.get(rightChildIndex) > arr.get(minIndex)
            {
                minIndex = rightChildIndex;
            }

            if(minIndex != index)
            {
                // Swap the elements
                int temp = arr.get(index);
                arr.set(index, arr.get(minIndex));
                arr.set(minIndex, temp);

                // Heapify the subtree  // O(logn)
                heapify(minIndex);
            }
        }

        public int remove()
        {
            int data = arr.get(0);

            // Step 1 - Swap the first and the last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2 - Remove the last element
            arr.remove(arr.size() - 1);

            // Step 3 - Heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty()
        {
        return arr.size() == 0;
        }

    }

    

    public static void main(String args[])
    {
        Heap h = new Heap();   //Working Like a Priority Queue implemented using Heap

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(7);

        System.out.println(h.arr);

        while(!h.isEmpty())  // Heap Sort O(nlogn)
        {
            System.out.println(h.peek());
            h.remove();
        }

    }
}