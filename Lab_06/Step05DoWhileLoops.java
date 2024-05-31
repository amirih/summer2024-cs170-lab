package Lab_06;

public class Step05DoWhileLoops {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        int counter = 0;
        boolean yes = true;
        boolean no = false;

        // do while loops
        do {
            System.out.println("first do while loop, condition is " + yes);
            yes = false;
        } while (yes);

        do {
            System.out.println("second do while loop, condition is " + no);
            no = false;
        } while (no);

        counter = 0;
        do {
            System.out.println("counter is " + counter);
            counter++;
        } while (counter <= 5);

    }

}
