package Lab_08;

public class Step03ArrayXDDeclaration {

    public static void main(String[] args) {
        int[][] firstArrayOfInt2D = new int[4][5];
        int secondArrayOfInt2D[][] = new int[4][5];
        int[] thirdArrayOfInt2D[] = new int[4][5];
        int[][] fourthArrayOfInt2D = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 } }; // 4x5

        int[][][] arrayOfInt3D = new int[4][5][6];

        int[] secondArrayOfInt3D[][] = new int[4][5][6];
        int[] thirdArrayOfInt3D[][] = new int[4][5][6];
        int[][][] fourthArrayOfInt3D = { { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } }, { { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 } } }; // 2x2x5

        System.out.println("firstArrayOfInt2D[0][0] = " + firstArrayOfInt2D[0][0]);
        System.out.println("secondArrayOfInt2D[0][0] = " + secondArrayOfInt2D[0][0]);
        System.out.println("thirdArrayOfInt2D[0][0] = " + thirdArrayOfInt2D[0][0]);
        System.out.println("fourthArrayOfInt2D[0][0] = " + fourthArrayOfInt2D[0][0]);
        System.out.println("fourthArrayOfInt2D[3][4] = " + fourthArrayOfInt2D[3][4]);

        System.out.println("arrayOfInt3D[0][0][0] = " + arrayOfInt3D[0][0][0]);
        System.out.println("secondArrayOfInt3D[0][0][0] = " + secondArrayOfInt3D[0][0][0]);
        System.out.println("thirdArrayOfInt3D[0][0][0] = " + thirdArrayOfInt3D[0][0][0]);
        System.out.println("fourthArrayOfInt3D[0][0][0] = " + fourthArrayOfInt3D[0][0][0]);
        System.out.println("fourthArrayOfInt3D[1][1][4] = " + fourthArrayOfInt3D[1][1][4]);

    }

}
