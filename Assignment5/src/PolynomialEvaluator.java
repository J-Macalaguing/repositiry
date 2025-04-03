import java.util.StringTokenizer;
import java.util.Scanner;

public class PolynomialEvaluator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("give polynomial with 5 terms pls");
        String poly = kb.nextLine();
        System.out.println("Give me an x value");
        double x = kb.nextDouble();

        StringTokenizer polyToken = new StringTokenizer(poly, " ");
        while (polyToken.hasMoreTokens()) {
            System.out.println(polyToken.nextToken());
        }

        
    }
}
// weiner