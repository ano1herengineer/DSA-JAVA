/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		
		while(T>0)
		{
		    if(X == Y)
		    {
		        System.out.println("ANY");
		    }
		    if (X > Y)
		   {
		        System.out.println("FIRST");   
		   }
		    if (X < Y)
		    {
		       System.out.println("SECOND");
		   }
		 T--;
		  
		}
		
	}
}
