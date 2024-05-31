package Lab_05;

public class Step05ShortCircuitEvaluation {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 0;

        if (x != 0 && y / x > 0) {
            System.out.println("Short-circuit evaluation: it is true");
        } else {
            System.out.println("Short-circuit evaluation: it is false");
        }

        if (z != 0 && y / z > 0) {
            System.out.println("Short-circuit evaluation: it is true");
        } else {
            System.out.println("Short-circuit evaluation: it is false");
        }
        System.out.println("Runtime error due to division by zero");

        if (y / z > 0) {
            System.out.println("It doesn't matter it is true");
        } else {
            System.out.println("It doesn't matter it is false");

        }

    }

}
