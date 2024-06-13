package Lab_09;

public class Step01Recursion {
    // Factorial of a number n is the product of all positive integers less than or
    // equal to n.
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    // Fibonacci series is a series of numbers in which each number is the sum of
    // the two preceding ones.
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Sum of n natural numbers
    public static int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }

    // Power of a number
    public static int power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        return base * power(base, exponent - 1);
    }

    // Greatest Common Divisor (GCD) of two numbers
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Least Common Multiple (LCM) of two numbers
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // search for a number in an array
    public static boolean search(int[] arr, int n, int index) {
        if (index == arr.length)
            return false;
        if (arr[index] == n)
            return true;
        return search(arr, n, index + 1);
    }

    // print array in reverse order
    public static void printReverse(int[] arr, int index) {
        if (index == arr.length)
            return;
        printReverse(arr, index + 1);
        System.out.print(arr[index] + " ");
    }

    // print array in reverse order
    public static void printReverse(int[] arr) {
        printReverse(arr, 0);
    }

    // look for 'x' in a string
    public static boolean find(String str, char x, int index) {
        if (index == str.length())
            return false;
        if (str.charAt(index) == x)
            return true;
        return find(str, x, index + 1);
    }

    // look for 'x' in a string
    public static boolean find(String str, char x) {
        return find(str, x, 0);
    }

    // decimal to binary
    public static String decimalToBinary(int n) {
        if (n == 0)
            return "";
        return decimalToBinary(n / 2) + n % 2;
    }

    // binary to decimal
    public static int binaryToDecimal(String binary) {
        if (binary.length() == 0)
            return 0;
        return 2 * binaryToDecimal(binary.substring(0, binary.length() - 1))
                + Integer.parseInt(binary.substring(binary.length() - 1));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Fibonacci of 5: " + fibonacci(5));
        System.out.println("Sum of 5: " + sum(5));
        System.out.println("Power of 2^5: " + power(2, 5));
        System.out.println("GCD of 12 and 15: " + gcd(12, 15));
        System.out.println("LCM of 12 and 15: " + lcm(12, 15));
        System.out.println("Search 5 in arr: " + search(arr, 5, 0));
        System.out.println("Search 6 in arr: " + search(arr, 6, 0));
        printReverse(arr);
        System.out.println();
        System.out.println("Find 'e' in 'Hello': " + find("Hello", 'e'));
        System.out.println("Find 'a' in 'Hello': " + find("Hello", 'a'));

        System.out.println("Decimal to Binary of 5: " + decimalToBinary(5));
        System.out.println("Binary to Decimal of 101: " + binaryToDecimal("101"));

    }

}
