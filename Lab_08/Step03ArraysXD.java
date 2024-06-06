package Lab_08;

public class Step03ArraysXD {

    public static void main(String[] args) {

        // Array of arrays (2D array)
        int[][] matrix = new int[3][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i + j;
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.err.println("Length of matrix array: " + matrix.length);
        System.err.println("Length of matrix[0] array: " + matrix[0].length);

        // Array of 3D arrays
        System.err.println("\nArray of 3D arrays");
        int[][][] cube = new int[3][4][5];

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[0].length; j++) {
                for (int k = 0; k < cube[0][0].length; k++) {
                    cube[i][j][k] = i + j + k;
                }
            }
        }

        for (int[][] face : cube) {
            for (int[] row : face) {
                for (int column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
