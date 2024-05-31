package Lab_06;

public class Step03StringCompareTo {

    public static void main(String[] args) {
        // equal = 0 , if s1 > s2 positive value is returned, if s1 < s2 negative value
        // is returned
        // value is calculated by subtracting the unicode value of the characters
        System.out.println("abcdef".compareTo("abcdef"));
        System.out.println("abcd".compareTo("abcD")); // d > D so positive value is returned difference is 32
        System.out.println("abcdez".compareTo("abcdea")); // z > a so positive value is returned difference is 25

    }

}
