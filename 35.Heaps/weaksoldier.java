// Weakest Soldier 

import java.util.*;

public class weaksoldier
{
    static class Row implements Comparable<Row>
    {
        int soldiers;
        int idx;

        public Row(int soldiers, int idx)
        {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2)
        {
            if(this.soldiers == r2.soldiers)
            {
                return this.idx - r2.idx;  //Ascending Order (Min Heap)
            }
            else
            {
                return this.soldiers - r2.soldiers;  //Ascending Order (Min Heap)
            }
        }
    }

    public static void main(String args[])
    {
        int army[][] = {{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0},
                        {1,0,0,0}};

        int k=2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i = 0; i<army.length; i++)
        {
            int count = 0;
            for(int j = 0; j<army[0].length; j++)
            {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }

        System.out.println("Weakest "+k+" rows are: ");

        for(int i = 0; i < k; i++)
        {
            Row r = pq.remove();
            System.out.println("Row "+r.idx+" has "+r.soldiers+" soldiers");
        }
    }
    
}