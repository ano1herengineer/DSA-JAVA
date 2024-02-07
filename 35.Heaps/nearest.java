// Nearest Cars to Origin

// We are given a list of (x, y) coordinates representing cars on a cartesian plane.
// Given a number k, return the k closest cars to the origin (0, 0).

import java.util.*;

public class nearest{

    static class Point implements Comparable<Point>
    {
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx)
        {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }
        

        @Override
        public int compareTo(Point p2)
        {
            return this.distSq - p2.distSq;  //Ascending Order (Min Heap)
        }
        
    }
    public static void main(String args[])
    {
        int pts[][] = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i = 0; i < pts.length; i++)
        {
            int x = pts[i][0];
            int y = pts[i][1];
            int distSq = x * x + y * y;
            Point p = new Point(x, y, distSq, i);
            pq.add(p);
        }

        //Nearst K Cars

        for(int i = 0; i < k; i++)
        {
            Point p = pq.remove();
            System.out.println("C"+p.idx+" ("+p.x+", "+p.y+")");
        }
    }
}