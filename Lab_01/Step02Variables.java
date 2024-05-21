package Lab_01;

public class Step02Variables {
    public static void main(String[] args) {
        // 1. Initialize variables
        // 2. Use variables

        // Initialization:
        // basic data types
        int a = 5; // integer
        double b = 5.5; // double
        char c = 'c'; // char
        String d = "Hello"; // string
        boolean e = true; // boolean
        // Use variables
        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Char: " + c);
        System.out.println("String: " + d);
        System.out.println("Boolean: " + e);

        // 3. Modify variables
        // Modify variables
        a = 10;
        b = 10.5;
        c = 'd';
        d = "World";
        e = false;
        System.out.println("After modification");
        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Char: " + c);
        System.out.println("String: " + d);
        System.out.println("Boolean: " + e);

        // 4. Declare multiple variables
        // Declare multiple variables
        int f, g, h;
        // Initialize multiple variables
        f = 1;
        g = 2;
        h = 3;
        // Use multiple variables
        System.out.println("Multiple variables");
        System.out.println("f: " + f);
        System.out.println("g: " + g);
        System.out.println("h: " + h);

        // 5. Declare multiple variables in one line
        // Declare multiple variables in one line
        int i = 4, j = 5, k = 6;
        // Use multiple variables
        System.out.println("Multiple variables in one line");
        System.out.println("i: " + i + "j: " + j + "k: " + k);

        // 6. Declare constants
        // Declare constants
        final int l = 7;
        final double m = 7.5;
        final char n = 'e';
        final String o = "Hello World";
        final boolean p = false;
        // Use constants
        System.out.println("Constants");
        System.out.println("Integer: " + l);
        System.out.println("Double: " + m);
        System.out.println("Char: " + n);
        System.out.println("String: " + o);
        System.out.println("Boolean: " + p);

        // 7. Declare multiple constants in one line
        // Declare multiple constants in one line
        final int q = 8, r = 9, s = 10;
        // Use multiple constants
        System.out.println("Multiple constants in one line");
        System.out.println("q: " + q + "r: " + r + "s: " + s);

    }

}
