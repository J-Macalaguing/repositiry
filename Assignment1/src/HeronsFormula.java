import java.util.Scanner;
import java.lang.Math;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("give me side a");
        double a = k.nextDouble();
        System.out.println("give me side b");
        double b = k.nextDouble();
        System.out.println("give me side c");
        double c = k.nextDouble();
        double area = 0.25 * Math.sqrt((4 * (a * a) * (b * b)) - ((a * a) + (b * b) - (c * c)));
        System.out.println("area is " + area);
    }
}
