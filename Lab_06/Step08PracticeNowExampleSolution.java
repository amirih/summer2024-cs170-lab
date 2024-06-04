package Lab_06;

public class Step08PracticeNowExampleSolution {
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not a palindrome");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("Is a palindrome");
        return true;
    }

    public static String reverseWord(String word) {
        String output = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            output += word.charAt(i);
        }
        return output;
    }

    public static String reverseString1(String str) {
        // reverse the charters in a word in a string and keeps the words order
        String[] words = str.split(" ");
        String output = "";
        for (String word : words) {
            output += reverseWord(word) + " ";
        }
        System.out.println(output);
        return output;
    }

    public static String reverseString2(String str) {
        // reverse the words order in a string
        String[] words = str.split(" ");
        String output = "";

        for (int i = words.length - 1; i >= 0; i--) {
            output += words[i] + " ";
        }
        System.out.println(output);
        return output;
    }

    public static String reverseString3(String str) {
        // reverse the words order in a string and reverse the characters in each word
        String[] words = str.split(" ");
        String output = "";

        for (int i = words.length - 1; i >= 0; i--) {
            output += reverseWord(words[i]) + " ";
        }
        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {
        isPalindrome("bab");
        reverseString1("A black horse ran");
        reverseString2("A black horse ran");
        reverseString3("A black horse ran");

    }
}
