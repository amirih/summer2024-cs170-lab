package Lab_04;

public class Step06ScopeSimple {
    public static void method(int input) {
        int a = 10;
        System.out.println("inside the method :" + a);
        a = input;
        System.out.println("inside the method :" + a);
        for (int i = 0; i < 5; i++) {
            {
                a = i;
                System.out.println("inside the loop :" + a);
            }
        }
        // i = 0; i is not accessible here
        System.out.println("inside the method :" + a);

    }

    public static void main(String[] args) {
        int a = 30;
        System.out.println("inside the method :" + a);
        method(20);
        System.out.println("inside the method :" + a);

    }
}
