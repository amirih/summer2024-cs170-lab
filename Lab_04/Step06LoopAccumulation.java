package Lab_04;

public class Step06LoopAccumulation {
    public static void main(String[] args) {
        int sum = 0; // outside the loop initialized to 0

        for (int i = 1; i <= 10; i++) {
            sum += i; // sum = sum + i
            System.out.println("i: " + i + " sum: " + sum);
        }

        System.out.println("Final sum:" + sum);

        // concatenation
        String message = "";
        for (char i = 49; i <= 130; i++) {
            message += i;
        }

        System.out.println("Message: " + message);
    }
}
