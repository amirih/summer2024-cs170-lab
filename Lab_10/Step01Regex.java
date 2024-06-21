package Lab_10;

public class Step01Regex {
    public static void main(String[] args) {

        // System.out.println("hello".matches("hello"));
        // System.out.println("hello".matches("Hello"));
        // System.out.println("hello".matches("h.*"));
        // System.out.println("hello".matches("h.*o"));
        // System.out.println("hello".matches("h.*l.*"));
        // System.out.println("hello".matches("h.*l.*o"));
        // System.out.println("hello".matches("h\\w{3}o"));
        // System.out.println("hello".matches("h\\w{4}o"));
        // System.out.println("hello".matches("h\\w{3,4}o"));
        // System.out.println("hello".matches("^h.*o$"));
        // System.out.println("hello".matches("^h.*$"));
        // System.out.println("hello10".matches("^h.*$"));
        // System.out.println("hello10".matches("^h.*\\d{2}$"));
        // System.out.println("hello10".matches("^h.*\\d{1,2}$"));
        // System.out.println("hello10".matches("^h.*\\d{1,}$"));
        // System.out.println("hello10".matches("^h.*\\d{1,}$"));
        // use regex to match if h and d is is not important in abfsdhfksdhfsdprder
        // System.out.println("abfsdhfksdhfsd".matches(".*d.*.*h.*d.*"));
        // System.out.println("two too to".replaceAll("t[wo]+", "2"));
        System.out.println("5398?a".matches("\\d{4}[!\\?]\\w"));
    }
}