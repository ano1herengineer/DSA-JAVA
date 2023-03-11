import java.util.Scanner;
 
public class SphereInTetrahedron
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        for(int i = 0; i < t; i++)
        {
            double wx = sc.nextDouble();
            double wy = sc.nextDouble();
            double wz = sc.nextDouble();
            double xy = sc.nextDouble();
            double xz = sc.nextDouble();
            double yz = sc.nextDouble();
 
            double v = Math.sqrt(
                (4 * Math.pow(wx, 3) * Math.pow(wy, 3) * Math.pow(wz, 3) * Math.pow(xy, 3) * Math.pow(xz, 3) * Math.pow(yz, 3))/(Math.pow(wx, 2) * Math.pow(wy, 2) * Math.pow(wz, 2) * Math.pow(xy, 2) + Math.pow(wx, 2) * Math.pow(xz, 2) * Math.pow(yz, 2) + Math.pow(wy, 2) * Math.pow(xz, 2) * Math.pow(yz, 2) + Math.pow(wz, 2) * Math.pow(xy, 2) * Math.pow(yz, 2) + Math.pow(xy, 2) * Math.pow(xz, 2) * Math.pow(yz, 2) ) );
 
            double radius = Math.pow(v / (4/3 * Math.PI), 1/3);
            System.out.printf("%.4f\n", radius);
        }
    }
}