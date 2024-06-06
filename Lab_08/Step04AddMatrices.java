package Lab_08;

public class Step04AddMatrices {
    public static void main(String[] args) {
        int[][] matixA = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matixB = { { 7, 8, 9 }, { 10, 11, 12 } };

        int[][] result = new int[matixA.length][matixA[0].length];

        for (int i = 0; i < matixA.length; i++) {
            for (int j = 0; j < matixA[i].length; j++) {
                result[i][j] = matixA[i][j] + matixB[i][j];
            }
        }

        for (int[] row : result) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

}
