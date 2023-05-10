// you are given a number (eg = 2019), convert it into a String of English like
//"two zero one nine". Use a recursive function to solve this problem.

//NOTE = the digits of the number will only be in the range 0-9 and the last digit of a 
// number can't be 0.

//Sample Input = 1947
//Sample Output = "one nine four seven"

public class pq2
{
    public static void main(String args[])
    {
        printDigits(696969);
        System.out.println();
    }

    static String digits[] ={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int number)
    {
        if(number == 0)
        {
            return;
        }

        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
}