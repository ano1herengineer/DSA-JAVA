//Find out the pair Sum in Sorted and rotated Array List
import java.util.*;

public class PairSum2
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        //11, 15, 6, 8, 9, 10 - SORTED AND ROATATED
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));
    }

    //O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target)
    {
        int bp = -1;
        int n = list.size();
        for(int i = 0; i<list.size(); i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                //BREAKING POINT
                bp = i;
                break;

            }
        }

        int lp = bp+1; //smallest value
        int rp = bp; //largest value 

        while(lp != rp)
        {
            //Case 1
            if(list.get(lp) + list.get(rp) == target)
            {
                System.out.println("Numbers are = "+list.get(lp)+","+list.get(rp));
                return true; 
            }

            //Case 2
            if(list.get(lp) + list.get(rp) < target)
            {
                lp = (lp+1) % n;
            }

            //Case 3
            if(list.get(lp) + list.get(rp) > target)
            {
                rp =(n+rp-1) % n;
            }

        }
        return false;


    }

}