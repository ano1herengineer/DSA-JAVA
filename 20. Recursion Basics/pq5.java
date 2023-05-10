// Tower of Hanoi

//You have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle starts with 
//disks sorted in ascending order of size from top to bottom(i.e.,each disk sits on top of an even larger one).

//You have the following constraints:
//(1) Only one disk can be moved at a time.
//(2) A disk is slid off the top of one tower onto another tower.
//(3)A disk cannot be placed on top of a smaller disk.

//Write a program to move the disks from the first tower to the last using Stacks.
//Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'.
//An example with 2 disks i.e. N=2:
//Step 1 : Shift the first disk from 'A' to 'B'.
//Step 2 : Shift the second disk from 'A' to 'C'.
//Step 3 : Shift the first disk from 'B' to 'C'.

//An example with 3 disks i.e. N=3 :
//Step 1 : Shift the first disk from 'A' to 'C'.
//Step 2 : Shift second disk from 'A' to 'B'.
//Step 3 : Shift the first disk from 'C' to 'B'.
//Step 4 : Shift the third disk from 'A' to 'C'.
//Step 5 : Shift the first disk from 'B' to 'A'.
//Step 6 : Shift second disk from 'B' to 'C'.
//Step 7 : Shift the first disk from 'A' to 'C'

//The Approach here is :
//- Shift 'n-1' disks from 'A' to 'B', using C.
//- Shift the last disk from 'A' to 'C'.
//- Shift 'n-1' disks from 'B' to 'C', using A

public class pq5
{
    public static void main(String args[])
    {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest)
    {
        //Base Case
        if(n == 1)
        {
            System.out.println("transfer disk "+ n +" from " + src +" to " + dest);
            return;
        }

        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);

        //transer nth from src to dest
        System.out.println("transfer disk "+ n +" from " + src +" to " + helper);

        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
        
    }
}
