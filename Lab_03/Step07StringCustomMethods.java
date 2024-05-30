package Lab_03;

public class Step07StringCustomMethods {
    public static boolean isWord(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "this is a string with some spacial characters like @, #, $, %, ^, &, *, (, ), _, +, =, {, }, [, ], |, \\, :, ;, ', \", <, >, ,, ., ?, /, ~, `";
        for (String word : str.split(" ")) {
            System.out.println(word + " : " + isWord(word));
        }
    }

}
