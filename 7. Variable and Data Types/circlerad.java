import java.util.*;
import java.lang.Math;
// to calculate the area of a circle 

public class circlerad
{
    public static void main(String args[])
    {  Scanner sc = new Scanner(System.in);
      int rad =sc.nextInt();
      double area;
      area = (Math.PI * (rad * rad));
      System.out.println(area);
    }
}