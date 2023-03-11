import java.util.*;

public class p3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double pencil = sc.nextDouble();
        double pen = sc.nextDouble();
        double eraser = sc.nextDouble();
        double bill = 0.0;
        bill = (pencil + pen + eraser) ;
        double gstbill = 0.0;
        gstbill = ((0.18 * bill) + bill ) ;

        System.out.println("Bill without gst = "+ bill);
        System.out.println("Bill with gst = " + gstbill);
    }
}