public class nqueen 
{
    public static void main(String args[])
    {
        int n = 4;
        char board[][] = new char[n][n];
        //initialize
        for( int i =0; i<n; i++)
        {
            for(int j =0; j<n; j++)
            {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
    }

    public static void nQueens(char board[][], int row)
    {
        //base case 
        if(row == board.length)
        {
           printBoard(board);
           return;
        }
        //column loop
        for(int j =0;j<board.length; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] ='Q';
                nQueens(board, row+1); //function call
                board[row][j] = 'X';  //backtracking
                //step after backtrack so that initial queen is removed 
            }
        
            
        }
    }

    public static void printBoard(char board[][])
    {
        System.out.println("------------ chess board -----------");
        for(int i =0; i<board.length; i++)
        {
            for(int j =0; j<board.length; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col)
    {
        //vertical up = same column, different row, i.e row-1
        for(int i = row-1; i>=0; i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        //diagonal up left  = (i-1, j-1)--> (i-2, j-2)
        for(int i = row-1, j = col -1; i>=0 && j>=0;i--, j--)
        {
             if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        // diagonal up right = (i-1, j+1)-->(i-2, j+2)
         for(int i = row-1, j = col +1; i>=0 && j<board.length;i--, j++)
        {
             if(board[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;

    }
}