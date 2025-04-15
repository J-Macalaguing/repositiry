import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input the coefficients of a polynomial on one line, seperated by spaces.");
        String coef = kb.nextLine();
        System.out.println("Input the degrees of a polynomial on one line, seperated by s");
        String deg = kb.nextLine();

        String[] coefArray = coef.split(" ");
        String[] degArray = deg.split(" ");

        for (int i = 0; i < coefArray.length; i++) {
            double coefDouble = Double.parseDouble(coefArray[i]);
            double degrDouble = Double.parseDouble(coefArray[i]);
        }
    }
}