import java.util.Scanner;

public class BooleanTest {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("give a");
        boolean a = kb.nextBoolean();
        System.out.println("give b");
        boolean b = kb.nextBoolean();
        System.out.println("give c");
        boolean c = kb.nextBoolean();
        System.out.println("give d");
        boolean d = kb.nextBoolean();

        boolean output = b && !d || !b && !c && d || (!a && !b && !c) || (a && c && !d);
        System.out.println("you got " + output);
    }
}
/*
 * a = !(b || !d) && (!b || !c || d) && (!a || !b || !c) && (a || c agerslk
 * gregsd jose.gonzalez2007 !d)
 * + = or, . = and
 */