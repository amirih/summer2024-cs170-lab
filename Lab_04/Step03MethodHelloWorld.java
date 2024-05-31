package Lab_04;

public class Step03MethodHelloWorld {
    public static void voidMethodWithoutParameter() {
        System.out.println("Hello World");
    }

    public static void voidMethodWithParameter(String message) {
        System.out.println(message);
    }

    public static int intMethodWithParameter(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        voidMethodWithoutParameter();
        voidMethodWithParameter("Hello World");
        int result = intMethodWithParameter(5, 10);
        System.out.println("Result: " + result);

    }
}