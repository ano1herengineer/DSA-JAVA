import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(7);

        System.out.println("ArrayList before sorting = "+ list);

        Collections.sort(list); //ascending order 

        System.out.println("ArrayList after sorting = "+ list);

        //to sort in descending oder 
        Collections.sort(list, Collections.reverseOrder());
        //Collections.reverseOrder is a Comparator which defines the logic of the type of Sorting 

        System.out.println("ArrayList after reverse sorting = "+ list);
    }
}