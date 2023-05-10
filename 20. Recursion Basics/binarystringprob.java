//Print all binary string of size n without consecutive ones

public class binarystringprob
{
    public static void main(String args[])
    {
       printBinStrings(4, 0,"");
    }

    public static void printBinStrings(int n, int lastPlace, String str)
    {
        //Base Case
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
        // //kaam 
        // if( lastPlace == 0)
        // {
        //      // sit 0 on chair n
        //      printBinStrings(n-1, 0, str.append("0"));
        //      printBinStrings(n-1, 0, str.append("1"));
        // }
        // else
        // {
        //     printBinStrings(n-1, 0, str.append("0"));
        // }

        printBinStrings(n-1, 0, str+"0");
        if( lastPlace == 0)
        {
            printBinStrings(n-1, 1, str+"1");
        }
    }
}


//Using String Builder

// public class binarystringprob {
//     public static void main(String args[]) {
//         printBinStrings(3, 0, new StringBuilder(""));
//     }

//     public static void printBinStrings(int n, int lastPlace, StringBuilder str) {
//         // Base Case
//         if(n == 0) {
//             System.out.println(str);
//             return;
//         }

//         // Recursive Case
//         StringBuilder newStr = new StringBuilder(str.toString() + "0");
//         printBinStrings(n - 1, 0, newStr);
//         if(lastPlace == 0) {
//             newStr = new StringBuilder(str.toString() + "1");
//             printBinStrings(n - 1, 1, newStr);
//         }
//     }
// }