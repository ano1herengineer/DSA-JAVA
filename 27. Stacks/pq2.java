// Simplify Directory Path
// We have an absolute path for a file (Unix-style) , write a function that simplifies the path. 
// Note : The absolute path always starts with a slash '/' (root directory), a dot '.' in path represents
// the current directory itself and two consecutive dots '..' represents the parent directory.

// Input : /a/./b/../../c/
// Output : /c

// Input : /a/./b/./c/./d/
// Output : /a/b/c/d

// Input : /a/../../b/../c//.//
// Output : /c

// Input : /a/..
// Output : /

// Input : /thispc/
// Output : /thispc

import java.util.*;
import java.io.*;

class pq2
{
    public static void main(String args[])
    {
        String path = "/a/./b/./c/./d/"; //Output : /a/b/c/d
        System.out.println(simplifyPath(path));
    }

    public static String simplifyPath(String path)
    {
        Stack<String> s = new Stack<>();
        String arr[] = path.split("/"); // splitting the string at every '/' and storing it in an array

        for(String i : arr) // iterating over the array
        {
            if(i.equals("..")) // if the string is '..' then we pop the top element of the stack
            {
                if(!s.isEmpty()) // if the stack is not empty
                {
                    s.pop(); // pop the top element
                }
            }
            else if(i.equals(".") || i.equals("")) // if the string is '.' or '' then we continue
            {
                continue;
            }
            else
            {
                s.push(i); // else we push the string into the stack
            }
        }

        String ans = ""; // initializing the answer string
        while(!s.isEmpty()) // iterating over the stack
        {
            ans = "/" + s.pop() + ans; // adding the top element of the stack to the answer string
        }

        if(ans.length() == 0) // if the answer string is empty then we return '/'
        {
            return "/";
        }
        return ans;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)

// class pq2
// {
//     public static void main(String args[])
//     {
//         String str = new String("/a/./b/../../c/");
//         String res = sinmplify(str);
//         System.out.println(res);
//     }

//     static String simplify(String A)
//     {
//         Stack<String> st = new Stack<>();
//         String res = "";
//         res += "/";
//         int len_A = A.length();

//         for(int i = 0; i < len_A; i++)
//         {
//             String dir = "";
//             while(i < len_A && A.charAt(i) == '/')
//             {
//                 i++;
//             }
//             while(i < len_A && A.charAt(i) != '/')
//             {
//                 dir += A.charAt(i);
//                 i++;
//             }
//             if(dir.equals(".."))
//             {
//                 if(!st.isEmpty())
//                 {
//                     st.pop();
//                 }
//             }
//             else if(dir.equals("."))
//             {
//                 continue;
//             }
//             else if(dir.length() != 0)
//             {
//                 st.push(dir);
//             }

//             Stack<String> st1 = new Stack<>();
//             while(!st.isEmpty())
//             {
//                 st1.push(st.pop());
//             }
//             while(!st1.isEmpty())
//             {
//                 String temp = st1.pop();
//                 if(st1.isEmpty())
//                 {
//                     res += temp;
//                 }
//                 else
//                 {
//                     res += temp + "/";
//                 }
//             }
//             return res;
//         }
//     }

// }