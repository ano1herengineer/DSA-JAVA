//Tiling Problem 
//Given a 2*n board and tiles of size 2*1, count the number of ways to tile the 
//given board using the tiles.
// (A tile can either be placed horizonatally or vertically)

public class tiling{
    public static void main(String args[])
    {
        System.out.println(tilingProblem(8));
    }

    public static int tilingProblem(int n)
    {
        // 2 x N(floor size)

        //Base Case
        if(n == 0 || n == 1)
        {
            return 1;
        }


        //vertical choice 
        int fnm1 = tilingProblem(n -1);

        //horizonatal choice 
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;

    }
}

// for 4 x n floor and 4 x 1 tile the solution will be same 