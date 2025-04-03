import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("initial root guess");
            double x2 = kb.nextDouble();

            while (true) {
                double func = 6 * Math.pow(x2, 4) - 13 * Math.pow(x2, 3) - 18 * Math.pow(x2, 2) + 7 * x2 + 6;
                double deriv = 24 * Math.pow(x2, 3) - 39 * Math.pow(x2, 2) - 36 * x2 + 7;
                double x1 = x2 - func / deriv;

                if (Math.abs(x1 - x2) < 0.00000000001) {
                    System.out.println("Root approximation: " + x1);
                    break;
                }

                x2 = x1;
            }
            System.out.println("try again?");
            if (kb.next().charAt(0) == 'n') {
                kb.close();
                break;
            }
        }

    }
}
