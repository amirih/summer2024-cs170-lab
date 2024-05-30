package Lab_03;

public class Step06StringOperations {
    public static void main(String[] args) {
        String str = "  lo  Hello, World!         ";
        System.out.println("The length of the string is: " + str.length());
        System.out.println("The character at index 1 is: " + str.charAt(1));
        System.out.println("The substring from index 1 to 5 is: " + str.substring(1, 5));
        System.out.println("The index of the character 'e' is: " + str.indexOf('e'));
        System.out.println("The index of the character 'l' is: " + str.indexOf('l'));
        System.out.println("The index of the character 'l' after index 3 is: " + str.indexOf('l', 3));
        System.out.println("The index of the substring 'lo' is: " + str.indexOf("lo"));
        System.out.println("The index of the substring 'lo' after index 3 is: " + str.indexOf("lo", 3));
        System.out.println("The string in uppercase is: " + str.toUpperCase());
        System.out.println("The string in lowercase is: " + str.toLowerCase());
        System.out.println("The string without space at the beginning and end is: " + str.trim());
        System.out.println("The string after replacing 'Hello' with 'Hi' is: " + str.replace("Hello", "Hi"));
        System.out.println("The string after replacing 'l' with 'z' is: " + str.replace('l', 'z'));
        System.out.println("The string after replacing all 'l' with 'z' is: " + str.replaceAll("l", "z"));
        System.out.println("The string after replacing all 'l' with 'z' is: " + str.replaceFirst("l", "z"));
        System.out.println("The string after removing all 'l' is: " + str.replaceAll("l", ""));
        System.out.println("The string after removing all 'l' is: " + str.replaceFirst("l", ""));
        System.out.println("The string after removing all spaces is: " + str.replaceAll(" ", ""));
        System.out.println("The string after removing all spaces is: " + str.replace(" ", ""));

    }
}
