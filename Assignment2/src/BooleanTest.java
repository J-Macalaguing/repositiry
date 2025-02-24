import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("give a");
        boolean a = k.nextBoolean();
        System.out.println("give b");
        boolean b = k.nextBoolean();
        System.out.println("give c");
        boolean c = k.nextBoolean();
        System.out.println("give d");
        boolean d = k.nextBoolean();

        boolean output = (b && !d) || (!b && !c && d) || (!a && !b && !c) || (a && c && !d);
        System.out.println("you got " + output);
    }
}
/*
 * a = !(b || !d) && (!b || !c || d) && (!a || !b || !c) && (a || c agerslk
 * gregsd jose.gonzalez2007 !d)
 * + = or, . = and
 */