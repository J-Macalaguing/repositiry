import java.util.Scanner;
import java.lang.Math;

public class AmbiguousCase {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Give me an angle");
        double angleA = k.nextDouble();
        System.out.println("Give me side value A");
        double a = k.nextDouble();
        System.out.println("Give me side value B");
        double b = k.nextDouble();

        double h = b * (Math.sin(angleA));
        if (h < 90) {
            if (a < h) {
                System.out.println("No triangle");
            } else if (a == h) {
                System.out.println("Right triangle");
            } else if (a > b) {
                System.out.println("One triangle");
            } else if (h < a && a < b) {
                System.out.println("Two triangles (ambiguous case)");
            }
        } else if (h > 90) {
            if (a < b || a == h) {
                System.out.println("No triange");
            } else if (a > b) {
                System.out.println("One triangle");
            }
        }
    }
}