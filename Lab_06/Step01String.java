package Lab_06;

public class Step01String {
    public static void printIndices(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Index of " + str.charAt(i) + ": " + str.indexOf(str.charAt(i)));
        }
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Character at index 6: " + str.charAt(6));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));
        System.out.println("Substring from index 4 to 9: " + str.substring(4, 9));
        System.out.println("Substring from index 3 to end: " + str.substring(3));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Index of 'o' after index 4: " + str.indexOf('o', 4));
        System.out.println("Index of 'o' after index 5: " + str.indexOf('o', 5));
        System.out.println("Index of 'o' after index 11: " + str.indexOf('o', 11));
        System.out.println("Index of 'o' from end: " + str.lastIndexOf('o'));
        System.out.println("Index of 'o' from end before index 10: " + str.lastIndexOf('o', 10));

        printIndices(str);
    }

}
