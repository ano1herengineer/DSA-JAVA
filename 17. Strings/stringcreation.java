public class stringcreation
{
    public static void main(String args[])
    {
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("abcd");
        //all will give the same output
        //Strings are IMMUTABLE in Java i.e they cannot be changed 
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str2);
    }
}