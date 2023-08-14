import java.util.*;

public class PairSum1Brute
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        //1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum1(list, target));
    }

    //Brute Force
    public static boolean pairSum1(ArrayList<Integer> list, int target)
    {
        for(int i =0; i<list.size(); i++)
        {
            for(int j =i+1; j<list.size(); j++)
            {
                if(list.get(i)+ list.get(j) == target)
                {
                    System.out.println("Numbers are = "+list.get(i)+","+list.get(j));
                    return true;
                }
            }
        }
        return false;

    }
}