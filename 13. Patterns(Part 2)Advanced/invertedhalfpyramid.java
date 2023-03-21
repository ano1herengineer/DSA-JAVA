import java.io.*;

public class invertedhalfpyramid
{
    public static void main(String args[])
    {
             inverted_rotated_halfpyramid(10);
    }

    public static void inverted_rotated_halfpyramid(int n)
    {
        //outer
        for(int i =1; i<=n ; i++)
        {
            //spaces
            for(int j =1; j<= n-i; j++)
            {
                System.out.print(" ");
            }
            
            //stars
            for(int j =1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}





// //Approach -2

// public class CodeXam {
//     public static void main(String[] args) {
//         for (int i = 4; i>=1; i--) {
//             for (int j = 1; j<i ; j++) {
//                 System.out.print(" ");}
//             for (int j = 0; j <= 4-i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }










// //Approach -3

// public class CodeXam {
//     public static void main(String[] args) {
//         for (int i = 1; i < 5; i++) {
//             for (int j = 5; j > 0; j--) {
//                 if (j > i) {
//                     System.out.print(" ");
//                 } else {
//                     System.out.print("*");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }