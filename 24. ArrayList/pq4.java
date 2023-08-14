// Beautiful ArrayList(MEDIUM)

//An Arraylist nums of size n is beautiful if:

//nums is a permutation of the integers in the range [1, n].
//For every 0<=i<j<n, there is no index k with i<k<j where 2*nums.get(k)==nums.get(i)+nums.get(j).
//Given the integer n,return any beautiful arraylist nums of size n.

//There will be atleast one valid answer for the given n.

//Sample Input 1: n = 4
//Sample Output 1:  [2,1,4,3]

//Sample Input 2: n = 5
//Sample Output 2:  [3,1,2,5,4]

//Constraints:
//●1 <= n <= 1000




import java.util.*;

public class pq4
{

    ////Approach 1 (Iterative)

    //We can see that if we separate odd and even numbers then there is no possibility that even numbers 
    //will violate the rule with odd numbers and vice versa. Now we have to arrange even and odd numbers 
    //in such a way that they do not violate rules with themselves. 
    
    //For doing so first let's say we have a beautiful array list of size n and we want to make n+1 size of 
    //arraylist so what we do is first put all odd numbers that lie within 1 to n+1 and then even (WE can do even then odd also).
    //Beautiful arraylist has the property that if we multiply any number with arraylist then it still remains beautiful or if we add 
    //or subtract any number from arraylist then it still remains beautiful. For only obtaining even number from n size arraylist we do 2*num 
    //and for obtaining odd size arraylist we do 2 * n-1
   public static ArrayList<Integer> beautifulArray(int n)
   {
    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(1);

    for(int i = 2; i <=n; i++)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer e:ans)
        {
            if(2*e<=n)temp.add(e*2);
        }

        for(Integer e:ans)
        {
            if(2*e-1<=n)temp.add(e*2-1);
        }

        ans = temp;
    }

    return ans;
   }

   //Appproach 2 
   //Divide and Conquer
   //Let's start from simple 3 number cases:(1,2,3)-> the only thing we need to do is move 2 out of 1 and 3 ->(1,3,2).
   //Then what if the case is(1,5,9) which has increment = 4? It's the same thing-> move 3 out of 1 and 5 ->(1,9,5).
   
   //Now, what if the case is(1,3,5,7,9)? With the odd+even or divide+conquer idea in mind, we can simply divide it to (1,5,9) and(3,7).
   //Since no changes needed for the 2 numbers case, after following the above steps, we can conquer them to (1,9,5,3,7).

//    public static ArrayList<Integer> beautifulArray(int n)
//    {
//     ArrayList<Integer> res = new ArrayList<>();
//     divideConque(1,1,res,n);
//     return res;
//    }

//    private static void divideConque(int start, int increment, ArrayList<Integer> res, int n)
//    {
//     if(start + increment > n)
//     {
//         res.add(start);
//         return;
//     }
//     divideConque(start, 2* increment, res, n);
//     divideConque(start + increment, 2* increment, res, n);
//    }


   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(beautifulArray(n));

    // ArrayList<Integer> result = beautifulArray(n);
    //     for (int num : result) {
    //         System.out.print(num + " ");
    //     }

   }
}