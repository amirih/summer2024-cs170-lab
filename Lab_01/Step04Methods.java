package Lab_01;

public class Step04Methods {
    // methods have a return type, a name, and parameters
    // the return type can be void or any other type

    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // you can have multiple methods with the same name but different parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // We learn methods in Java
        // Call a method
        sayHello();
        sayHello("Java");

        int a = 10;
        int b = 20;
        int sum = add(a, b);
        System.out.println("Sum: " + sum);

        int c = 30;
        sum = add(a, b, c);
        System.out.println("Sum: " + sum);

    }
}
