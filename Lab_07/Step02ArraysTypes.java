package Lab_07;

public class Step02ArraysTypes {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // numbers[5] = 60; // ArrayIndexOutOfBoundsException

        System.out.println("Length of numbers array: " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.err.println("Element at index " + i + " is " + numbers[i]);
        }

        // Enhanced for loop
        for (int number : numbers) {
            System.out.println("Element is " + number);
        }

        // Array of Strings
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Doe";
        names[2] = "Smith";

        for (String name : names) {
            System.out.println("Name is " + name);
        }

        // Array of doubles
        double[] prices = { 10.5, 20.5, 30.5, 40.5, 50.5 };

        for (double price : prices) {
            System.out.println("Price is " + price);
        }

        // Array of booleans

        boolean[] flags = { true, false, true, false, true };

        for (boolean flag : flags) {
            System.out.println("Flag is " + flag);
        }

        for (int i = 0; i < flags.length; i++) {
            System.out.println("Flag at index " + i + " is " + flags[i]);
        }

    }
}
