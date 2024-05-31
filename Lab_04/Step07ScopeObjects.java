package Lab_04;

public class Step07ScopeObjects {
    int a = 5; // this is a global variable (instance variable)
    static int b = 10; // this is a global variable

    public static void printGlobalVariable() {
        System.out.println("Global variable b: " + b);
    }

    public void printInstanceVariable() {
        System.out.println("Instance variable a: " + a);
    }

    public void printLocalVariable() {
        System.out.println("\n Inside printLocalVariable method");
        int a = 150; // this is a local variable
        System.out.println("Local variable a: " + a);
    }

    public void showScope() {
        System.out.println("\n Inside showScope method");
        System.out.println("Global variable b: " + b);
        System.out.println("Instance variable a: " + a);
        int a = 100; // this is a local variable
        System.out.println("Local variable a: " + a);

        for (int i = 0; i < 2; i++) {
            System.out.println("Loop variable i: " + i);
            // System.out.println("Loop variable j: " + j); // this will give an error
            for (int j = 0; j < 2; j++) {
                System.out.println("Inner loop variable j: " + j);
                {
                    int k = 10; // this is a local variable
                    System.out.println("Inner block variable k: " + k); // k value is reset every time the block is
                                                                        // executed
                    k++; // it will not affect the value of k in the next block

                }
                // System.out.println("Inner block variable k: " + k); // error
            }
        }
    }

    public static void main(String[] args) {
        // we will learn scope here
        // System.out.println("Local variable a: " + a); // error
        System.out.println("Global variable b: " + b);
        int a = 10; // this is a local variable
        System.out.println("Local variable a: " + a);
        int b = 15; // this is a local variable
        System.out.println("Local variable b: " + b);

        printGlobalVariable();

        Step07ScopeObjects exampleObject1 = new Step07ScopeObjects();
        Step07ScopeObjects exampleObject2 = new Step07ScopeObjects();

        System.out.println("Object 1 (a): " + exampleObject1.a);
        System.out.println("Object 2 (a): " + exampleObject2.a);

        exampleObject1.a = 20;

        System.out.println("Object 1 (a): " + exampleObject1.a);
        System.out.println("Object 2 (a): " + exampleObject2.a);

        exampleObject2.b = 25; // you should not access static variables using objects

        System.out.println("Object 1 (b): " + exampleObject1.b);
        System.out.println("Object 2 (b): " + exampleObject2.b);

        exampleObject1.printInstanceVariable();
        exampleObject2.printInstanceVariable();

        exampleObject1.printLocalVariable();
        exampleObject2.printLocalVariable();

        exampleObject1.showScope();

    }

}
