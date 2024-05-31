package Lab_05;

public class Step03IfElseStatements {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        boolean yes = true;
        boolean no = false;

        // if-else statements
        if (yes) {
            System.out.println("it is true");
        } else {
            System.out.println("it is false");
        }

        if (no) {
            System.out.println("it is true");
        } else {
            System.out.println("it is false");
        }

        if (yes && no) {
            System.out.println("it is true");
        } else {
            System.out.println("it is false");
        }

        if (yes || no) {
            System.out.println("it is true");
        } else {
            System.out.println("it is false");
        }

        if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is positive");
        }
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(x + " is less than " + y);
        }

        if (Step02BooleanExpression.isEven(x)) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

        if (Step02BooleanExpression.isPositive(y)) {
            System.out.println(y + " is positive");
        } else {
            System.out.println(y + " is negative");
        }

        if (Step02BooleanExpression.isGreaterThan(z, x)) {
            System.out.println(z + " is greater than " + x);
        } else {
            System.out.println(z + " is less than " + x);
        }

        if (Step02BooleanExpression.isEqual(x, y)) {
            System.out.println(x + " is equal to " + y);
        } else {
            System.out.println(x + " is not equal to " + y);
        }
    }
}
