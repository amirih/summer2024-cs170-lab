package Lab_07;

public class Step04ArrayUseInMethods {

    public static int[] numberGenerator(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    public static void callByValue(int x) {
        x = 10;
    }

    public static void callByReference(int[] numbers) {
        numbers[0] = 10;
    }

    public static void main(String[] args) {

        int[] numbers = numberGenerator(5);

        for (int number : numbers) {
            System.out.println("Number is " + number);
        }

        int x = 5;
        System.err.println("Value of x before callByValue: " + x);
        callByValue(x);
        System.out.println("Value of x after callByValue: " + x);

        System.err.println("Value of numbers[0] before callByReference: " + numbers[0]);
        callByReference(numbers);
        System.out.println("Value of numbers[0] after callByReference: " + numbers[0]);

    }

}