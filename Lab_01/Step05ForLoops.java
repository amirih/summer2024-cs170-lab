package Lab_01;

public class Step05ForLoops {
    public static void main(String[] args) {
        // we learn for loops in Java
        // for loop is used to iterate a part of the program several times

        // for loop syntax
        // for (initialization statement; condition check to stop the loop; update the
        // loop variable) {
        // // code to be executed
        // }

        System.out.println("Hello, World!, 5 times:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World!");
        }

        System.out.println("Using the loop variable:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        System.out.println("Reverse loop:");
        for (int i = 5; i > 0; i--) {
            System.out.println("Iteration: " + i);
        }

        System.out.println("Different increment:");
        for (int i = 0; i < 10; i += 2) {
            System.out.println("Iteration: " + i);
        }

        System.out.println("Nested loop:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        System.out.println("Break statement:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Break at: " + i);
                break;
            }
            System.out.println("Iteration: " + i);
        }

        System.out.println("Continue statement:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Continue at: " + i);
                continue;
            }
            System.out.println("Iteration: " + i);
        }

        System.out.println("Loop with multiple variables:");
        for (int i = 0, j = 8; i < 10 && j > 0; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }

        System.out.println("Infinite loop:");
        for (;;) {
            System.out.println("Infinite loop");
            break;
        }

    }

}
