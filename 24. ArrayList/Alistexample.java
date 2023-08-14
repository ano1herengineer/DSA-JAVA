import java.util.ArrayList;

public class Alistexample
{
    public static void main(String args[])
    {

        //ArrayList is a part of Java Collectio Framework

        //ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>(); // to define Integer ArrayList 
        ArrayList<String> list1 = new ArrayList<>(); // to define String ArrayList 
        ArrayList<Boolean> list2 = new ArrayList<>(); // to define Boolean ArrayList 

        // to add elements to  list
        // time complexity to add a number in ArrayList = O(1); 
       
        list.add(1);  
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // there is also a way to ADD specific number at a specific index 
        list.add(1, 9); //O(n)


        // to get specific element from the list 
        // get opertaion takes O(1) time complexity
        int element = list.get(3);
        System.out.println(element);


        // to delete specific element from the list 
        // delete operation takes O(n) time 
        list.remove(3);
        System.out.println(list);

        //to set element at specific index = O(n)
        list.set(2, 10);  // list.set(index number, set element)
        System.out.println(list);

        //contain function = to check whether the specific element exist in the list or not 
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));


    }
}