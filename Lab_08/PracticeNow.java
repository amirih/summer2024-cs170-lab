package Lab_08;

import java.util.Random;

public class PracticeNow {
    // print
    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

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
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    public static void reverseRow(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
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
