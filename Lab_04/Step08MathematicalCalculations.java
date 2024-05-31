package Lab_04;

public class Step08MathematicalCalculations {
    // Fibonacci series: a(i) = a(i-1) + a(i-2)
    public static int fibonacci(int n) {
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    // Factorial: n! = n * (n-1) * (n-2) * ... * 1
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Custom formula: a(i) = a(i-1)^i + a(i-2)^i-1
    public static double customFormula(int n) {
        double a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = Math.pow(a, i) + Math.pow(b, i - 1);
            a = b;
            b = c;
        }
        return c;

    }

    public static void main(String[] args) {
        System.out.println("Fibonacci: " + fibonacci(10));
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Custom Formula: " + customFormula(1));
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            System.out.println("Fibonacci: " + fibonacci(i));
            System.out.println("Factorial: " + factorial(i));
            System.out.println("Custom Formula: " + customFormula(i));
            System.out.println("--------------------");
        }

    }
}
