package Lab_05;

public class Step02BooleanExpression {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static boolean isGreaterThan(int number1, int number2) {
        return number1 > number2;
    }

    public static boolean isLessThan(int number1, int number2) {
        return number1 < number2;
    }

    public static boolean isEqual(int number1, int number2) {
        return number1 == number2;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        boolean yes = true;
        boolean no = false;

        // Examples of boolean expressions
        System.out.println(yes + " && " + isPositive(z) + " = " + (yes && isPositive(z)));
        System.out.println(yes + " && " + isNegative(z) + " = " + (yes && isNegative(z)));

        System.out.println(yes + " || " + isPositive(z) + " = " + (yes || isPositive(z)));
        System.out.println(yes + " || " + isNegative(z) + " = " + (yes || isNegative(z)));

        System.out.println("!" + isPositive(z) + " = " + !isPositive(z));

        System.out.println(isEven(x) + " ^ " + isOdd(x) + " = " + (isEven(x) ^ isOdd(x)));

        System.out.println(
                isGreaterThan(x, y) + " == " + isLessThan(x, y) + " = " + (isGreaterThan(x, y) == isLessThan(x, y)));

        System.out.println(isEqual(x, y) + " != " + isEqual(x, x) + " = " + (isEqual(x, y) != isEqual(x, x)));

    }

}
