import java.io.*;
import java.util.*;

public class shortestpath
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter your String direction to calculate shortest path");
         String path = sc.next();   // Sample input = "WNEENESENNN"   Sample Output = 5.0
         System.out.println(getShortestPath(path));
    }

    public static float getShortestPath(String path)
    {
        int x = 0, y =0;
            
            // time complexity = O(n)

        for(int i = 0; i<path.length(); i++)
        {
            char dir = path.charAt(i);
            //South
            if(dir == 'S')
            {
                y--;
            }

            //North
            else if(dir == 'N')
            {
                y++;
            }
            
            //West
            else if(dir == 'W')
            {
                x--;
            }

            //East
            else{
                x++;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
}