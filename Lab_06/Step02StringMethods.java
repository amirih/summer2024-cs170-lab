package Lab_06;

public class Step02StringMethods {

    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "Bye";
        System.out.println("String.length(): " + str.length());
        System.out.println("String.toUpperCase(): " + str.toUpperCase());
        System.out.println("String.toLowerCase(): " + str.toLowerCase());
        System.out.println("String.replace('o', 'a'): " + str.replace('o', 'a'));
        System.out.println("String.replace(\"Hello\", \"Hi\"): " + str.replace("Hello", "Hi"));
        System.out.println("String.startsWith(\"Hello\"): " + str.startsWith("Hello"));
        System.out.println("String.startsWith(\"World\"): " + str.startsWith("World"));

        System.out.println("String.trim(): " + "  Hello World  ".length());
        System.out.println("String.trim().length(): " + "  Hello World  ".trim().length());
        System.out.println("String.trim(): " + "  Hello World  ".trim());

        System.out.println("String.compareTo(\"Hello World\"): " + str.compareTo("Hello World"));
        System.out.println("String.compareTo(\"Hello\"): " + str.compareTo("Hello"));
        System.out.println("String.compareTo(\"Hello World!\"): " + str.compareTo("Hello World!"));
        System.out.println("str.compareTo(str2): " + str.compareTo(str));

        System.out.println("String.concat(\"!\"): " + str.concat("!"));
        System.out.println("String.concat(\"!\").concat(\"!\"): " + str.concat("!").concat("!"));

    }

}
