package Lab_05;

public class Step07WhileLoops {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        boolean yes = true;
        boolean no = false;

        // while loops
        while (yes) {
            System.out.println("first while loop, condition is" + yes);
            yes = false;
        }

        while (no) {
            System.out.println("second while loop, condition is" + no);
            no = false;
        }

        while (yes && no) {
            System.out.println("second while loop, condition is" + yes + " and " + no);
            yes = false;
            no = false;
        }

        while (yes || no) {
            System.out.println("second while loop, condition is" + yes + " or " + no);
            yes = false;
            no = false;
        }

        while (x < 0) {
            System.out.println(x + " is negative");
            x = 0;
        }

        while (x > y) {
            System.out.println(x + " is greater than " + y);
            x = 0;
            y = 0;
        }

        while (Step02BooleanExpression.isEven(x)) {
            System.out.println(x + " is even");
            x = 1;
        }

        while (Step02BooleanExpression.isPositive(y)) {
            System.out.println(y + " is positive");
            y = 0;
        }

        while (Step02BooleanExpression.isGreaterThan(z, x)) {
            System.out.println(z + " is greater than " + x);
            z = 0;
            x = 0;
        }

        int counter = 0;
        while (counter < 10) {
            System.out.println("counter is " + counter);
            counter++;
        }
        System.out.println("Outside the loop:counter is " + counter);

    }

}
