package Lab_03;

public class Step08SimpleCipher {

    public static String encrypt(String text, int shift) {
        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isWhitespace(letter)) {
                encrypted += " ";
            } else {
                encrypted += (char) (letter + shift);
            }
        }
        return encrypted;
    }

    public static String decrypt(String text, int shift) {
        String decrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isWhitespace(letter)) {
                decrypted += " ";
            } else {
                decrypted += (char) (letter - shift);
            }
        }
        return decrypted;
    }

    public static void guessShift(String encryptedText){
        System.out.println(encryptedText);
        String decryptedText="";
        for (int shift=-100;shift<100;shift++){
            decryptedText = decrypt(encryptedText,shift);
            if(isInEnglish(decryptedText)==true){
                System.out.println("The shift value is: "+ shift);
                System.out.println("The decrypted text is: " + decryptedText);
            }

        }
    }
    public static boolean isInEnglish(String str) {
        for (char ch : str.toCharArray()) {
            if (ch!=' ' && !Character.isLetter(ch)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String plainText = "This is my secret message";
        System.out.println("plainText: " + plainText);
        String encryptedText = encrypt(plainText, 3);
        System.out.println("Encrypted: " + encryptedText);
        guessShift(encryptedText);
        String decryptedText = decrypt(encryptedText, 3);
        System.out.println("Decrypted: " + decryptedText);

    }
}
