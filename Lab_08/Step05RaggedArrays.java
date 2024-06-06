package Lab_08;

public class Step05RaggedArrays {
    public static void main(String[] args) {
        int[][] raggedArray = new int[4][];
        raggedArray[0] = new int[3];
        raggedArray[1] = new int[2];
        raggedArray[2] = new int[4];
        raggedArray[3] = new int[1];

        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                raggedArray[i][j] = i + j;
            }
        }

        // print raggedArray
        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.println("raggedArray[" + i + "][" + j + "]= " + raggedArray[i][j]);
            }
        }

        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
