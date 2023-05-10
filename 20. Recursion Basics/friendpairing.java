public class friendpairing
{
    public static void main(String args[])
    {
       System.out.println(friendsPairing(8));
    }

    public static int friendsPairing(int n)
    {
        if(n == 1 || n ==2)
        {
            return n;
        }
        //choice 
        //single 
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totalWays
        int totWays = fnm1 + pairWays;
        return totWays;
        //or we could use
        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
}


//Recursion is like Driving
//Comes better with intution