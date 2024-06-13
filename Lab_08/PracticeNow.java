package Lab_08;

import java.util.Random;

public class PracticeNow {
    // print
    public static void print(int[][] matrix) {

    }

    // initialize
    public static void initialize(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = random.nextInt(100);
    }

    // transpose
    public static void transpose(int[][] matrix) {

    }

    public static void reverseRow(int[][] matrix) {

    }

    // rotate right
    public static void rotate(int[][] matrix) {
        print(matrix);
        transpose(matrix);
        reverseRow(matrix);
        print(matrix);
    }

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        // print(matrix);
        initialize(matrix);
        // print(matrix);
        transpose(matrix);
        // print(matrix);
        rotate(matrix);
        // print(matrix);

    }

}
