package Lab_03;
/*
comments about discussion go here
*/

public class PracticeNow {
	public static void main(String[] args) {
		// 1. Encrypt a message with shift = 3
		String decrypted1 = "This is my secret message";
		int shift1 = 3;
		String encrypted1 = encrypt_word(decrypted1, shift1);
		System.out.println("1. Message #1 Encrypted: " + encrypted1);

		// 2. Decrypt a secret message with shift = 4
		String encrypted2 = "Neze tvskveqqmrk mw ws qygl jyr";
		int shift2 = 4;
		String decrypted2 = decrypt_word(encrypted2, shift2);
		System.out.println("2. Message #2 Decrypted: " + decrypted2);

		// 3. Decrypt a secret message with unknown shift
		String encrypted3 = "T ^_`Od NZX[`_P] ^NTPYNP L_ PXZ]d";
		guess_shift(encrypted3);
		int shift3 = 0; // TODO: change this based on your results from guessShift :)
		String decrypted3 = decrypt_word(encrypted3, shift3);
		System.out.println("3. Message #3 Decrypted: " + decrypted3);
	}

	// note: this is a preview of week 7 content! you don't need to fully understand
	// what is happening here, just understand how to use its output :)
	public static String encrypt_word(String text, int shift) {
		String encrypted = "";
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i); // gets the next letter in our String
			if (Character.isWhitespace(letter)) { // if it's a space just add a space
				encrypted += " ";
			} else { // it's a letter
				encrypted += encrypt_letter(letter, shift); // encrypt letter and add it to our encrypted message
			}
		}
		return encrypted;
	}

	public static String decrypt_word(String text, int shift) {
		String decrypted = "";
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i); // gets next letter in our String
			if (Character.isWhitespace(letter)) { // if it's a space just add a space
				decrypted += " ";
			} else { // it's a letter
				decrypted += decrypt_letter(letter, shift); // encrypt letter and add it to our encrypted message
			}
		}
		return decrypted;
	}

	public static String encrypt_letter(char letter, int shift) {
		// TODO: given letter in plaintext, apply shift and return new letter
		return "";
	}

	public static String decrypt_letter(char letter, int shift) {
		// TODO: given encoded letter, apply shift (in reverse) and return plaintext
		// letter
		return "";
	}

	public static void guess_shift(String text) {
		// TODO: write some code that when run would allow a user to easily see which
		// shift value decrypts the message
	}
}
