// Chocola Problem (SPOJ)
// Hard Problem

// We are given a bar of chocolatecomposed of m*n square pieces. One should break the chocolate into single squares.
// Each break of a part of chocolate is charged a cost (i.e. breaking a part of size p*q costs p*q) expressed by a positive integer.
// This cost does not depend on where we make a break (it doesn't matter how the chocolate bar is split into single squares).
// But only depends on the line the break is made on. We want to break the chocolate into single squares with minimum cost.


import java.util.*;

public class chocolaproblem
{
    public static void main(String args[])
    {
        int n = 4;
        int m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4}; // Cost of breaking chocolate vertically (m-1)
        Integer costHor[] = {4, 1, 2}; // Cost of breaking chocolate horizontally (n-1)

        // Sort the costs in descending order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while( h < costHor.length && v < costVer.length)
        {
            if( costVer[v] <= costHor[h])  // Horizonatl Cut 
            {
                cost += costHor[h] * (vp);
                hp++;
                h++;
            }

            else // Vertical Cut
            {
                cost += costVer[v] * (hp);
                vp++;
                v++;
            }
        }

        // If there are still horizontal cuts left
        while( h < costHor.length)
        {
            cost += costHor[h] * (vp);
            hp++;
            h++;
        }

        // If there are still vertical cuts left
        while( v < costVer.length)
        {
            cost += costVer[v] * (hp);
            vp++;
            v++;
        }

        System.out.println("Minimum Cost of Cuts  = " + cost); 

    }
}

// Working of the above code

// 1. Sort the costs in descending order
// 2. Initialize the number of horizontal cuts (h) and vertical cuts (v) to 0
// 3. Initialize the number of horizontal pieces (hp) and vertical pieces (vp) to 1
// 4. Initialize the cost (cost) to 0
// 5. While there are still horizontal cuts and vertical cuts left
//     a. If the cost of the next vertical cut is less than or equal to the cost of the next horizontal cut
//         i. Add the cost of the next horizontal cut to the total cost
//         ii. Increment the number of horizontal pieces by 1
//         iii. Increment the number of horizontal cuts by 1
//     b. Else
//         i. Add the cost of the next vertical cut to the total cost
//         ii. Increment the number of vertical pieces by 1
//         iii. Increment the number of vertical cuts by 1
// 6. While there are still horizontal cuts left
//     a. Add the cost of the next horizontal cut to the total cost

// 7. While there are still vertical cuts left
//     a. Add the cost of the next vertical cut to the total cost
// 8. Print the total cost

// Time Complexity: O(m+n)
// Space Complexity: O(1)