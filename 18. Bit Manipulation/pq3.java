// Add 1 to an integer using Bit Manipulation.(Hint: try using Bitwise NOT Operator)


// The expression-~x will add 1 to an integer x.We know that to get negative of a number,
// invert its bits and add 1 to it(Remember negative numbers are stored in 2’scomplement form),
//  i.e.,
// -x = ~x + 1;
// -~x = x + 1 (by replacing x by ~x)
public class pq3
{
    public static void main(String args[])
    {
        int x = 6;
        System.out.println(x + " + " + 1 +" is " + -~x);
        x = -4;
        System.out.println(x + " + " + 1 +" is " + -~x);
        x= 0;
        System.out.println(x + " + " + 1 +" is " + -~x);
    }
}