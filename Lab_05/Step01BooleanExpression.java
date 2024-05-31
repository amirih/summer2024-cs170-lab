package Lab_05;

public class Step01BooleanExpression {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        boolean yes = true;
        boolean no = false;

        // Logical AND
        System.out.println(yes + " && " + no + " = " + (yes && no));
        System.out.println(yes + " && " + yes + " = " + (yes && yes));
        System.out.println(no + " && " + no + " = " + (no && no));
        System.out.println(no + " && " + yes + " = " + (no && yes));

        // Logical OR
        System.out.println(yes + " || " + no + " = " + (yes || no));
        System.out.println(yes + " || " + yes + " = " + (yes || yes));
        System.out.println(no + " || " + no + " = " + (no || no));
        System.out.println(no + " || " + yes + " = " + (no || yes));

        // Logical NOT
        System.out.println("!" + yes + " = " + !yes);
        System.out.println("!" + no + " = " + !no);

        // Logical XOR
        System.out.println(yes + " ^ " + no + " = " + (yes ^ no));
        System.out.println(yes + " ^ " + yes + " = " + (yes ^ yes));
        System.out.println(no + " ^ " + no + " = " + (no ^ no));
        System.out.println(no + " ^ " + yes + " = " + (no ^ yes));

        // equality
        System.out.println(x + " == " + y + " = " + (x == y));
        System.out.println(x + " == " + x + " = " + (x == x));
        System.out.println(y + " == " + y + " = " + (y == y));

        // inequality
        System.out.println(x + " != " + y + " = " + (x != y));
        System.out.println(x + " != " + x + " = " + (x != x));
        System.out.println(y + " != " + y + " = " + (y != y));

        // greater than
        System.out.println(x + " > " + y + " = " + (x > y));
        System.out.println(x + " > " + x + " = " + (x > x));
        System.out.println(y + " > " + y + " = " + (y > y));

        // less than
        System.out.println(x + " < " + y + " = " + (x < y));
        System.out.println(x + " < " + x + " = " + (x < x));
        System.out.println(y + " < " + y + " = " + (y < y));

    }

}
