// * * * * * *
//  *       *
//   *     *
//    *   *
//     * *
//      *
//     * *
//    *   *
//   *     *
//  *       *
// * * * * * *
//Program to print the above pattern 




import java.util.Scanner;

public class paperpedia {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int i, j, k;
		int rows = 6;
		for (i = 1; i <= rows; i++ ) 
		{
			for (j = 1; j < i; j++ ) 
			{
				System.out.print(" ");
			}
			for(k = i; k <= rows; k++) 
			{
				if(i == 1 || k == i || k == rows)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for (i = rows - 1; i >= 1; i-- ) 
		{
			for (j = 1; j < i; j++ ) 
			{
				System.out.print(" ");
			}
			for(k = i; k <= rows; k++) 
			{
				if(i == 1 || k == i || k == rows)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}