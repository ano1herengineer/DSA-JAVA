
public class findpermutation
{
    public static void main(String args[])
    {
        String str = "abc";
        findpermutations(str, "");
    }

    public static void findpermutations(String str, String ans)
    {
        //base case
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        //recursion - O(n * n!)  TIME COMPLEXITY
        for(int i=0; i<str.length(); i++)
        {
            char curr = str.charAt(i);
            //  suppose  want to delete something from the string 
            // "abcde" remove c = "ab"+"de"= "abde"

            String Newstr = str.substring(0, i) + str.substring(i+1);
            findpermutations(Newstr, ans+curr);
        } 
    }
}