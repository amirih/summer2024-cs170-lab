package Lab_01;

public class Step03Operations {
    public static void main(String[] args) {
        // We learn simple operations in Java
        // Addition
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + a + " + " + b + " -> " + sum);

        // Subtraction
        int c = 30;
        int d = 10;
        int diff = c - d;
        System.out.println("Difference: " + c + " - " + d + " -> " + diff);

        // Multiplication
        int e = 5;
        int f = 6;
        int prod = e * f;
        System.out.println("Product: " + e + " * " + f + " -> " + prod);

        // Division
        int g = 20;
        int h = 5;
        int quot = g / h;
        System.out.println("Quotient: " + g + " / " + h + " -> " + quot);

        // Modulus
        int i = 20;
        int j = 6;
        int mod = i % j;
        System.out.println("Modulus: " + i + " % " + j + " -> " + mod);

        // Increment
        int k = 10;
        k++; // k = k + 1
        System.out.println("Increment: " + (k - 1) + " ++ -> " + k);

        // Decrement
        int l = 10;
        l--; // l = l - 1
        System.out.println("Decrement: " + (l + 1) + " -- -> " + l);

        // Compound assignment
        int m = 10;
        m += 5; // m = m + 5
        System.out.println("Compound assignment: " + (m - 5) + " += 5 -> " + m);

        // Compound assignment
        int n = 10;
        n -= 5; // n = n - 5
        System.out.println("Compound assignment: " + (n + 5) + " -= 5 -> " + n);

        // Compound assignment
        int o = 10;
        o *= 5; // o = o * 5
        System.out.println("Compound assignment: " + (o / 5) + " *= 5 -> " + o);

        // Compound assignment
        int p = 10;
        p /= 5; // p = p / 5
        System.out.println("Compound assignment: " + (p * 5) + " /= 5 -> " + p);

        // Compound assignment
        int q = 10;
        q %= 5; // q = q % 5
        System.out.println("Compound assignment: " + (q * 5) + " %= 5 -> " + q);

    }

}
