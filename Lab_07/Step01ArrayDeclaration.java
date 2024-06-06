package Lab_07;

public class Step01ArrayDeclaration {

    public static void main(String[] args) {
        int[] firstArrayOfInt = new int[4];
        int secondArrayOfInt[] = new int[4];
        int thirdArrayOfInt[] = { 1, 2, 3, 4 };
        int[] fourthArrayOfInt = { 1, 2, 3, 4 };
        int[] fifthArrayOfInt = new int[] { 1, 2, 3, 4 };
        int[] sixthArrayOfInt;
        sixthArrayOfInt = new int[4];

        System.out.println("firstArrayOfInt: " + firstArrayOfInt);
        // length is a property of the array object
        System.out.println("firstArrayOfInt.length: " + firstArrayOfInt.length);

        System.out.println("firstArrayOfInt.equals(secondArrayOfInt): " + firstArrayOfInt.equals(secondArrayOfInt));
        System.out.println("firstArrayOfInt.equals(thirdArrayOfInt): " + firstArrayOfInt.equals(thirdArrayOfInt));
        System.out.println("firstArrayOfInt.equals(fourthArrayOfInt): " + firstArrayOfInt.equals(fourthArrayOfInt));
        System.out.println("firstArrayOfInt.equals(fifthArrayOfInt): " + firstArrayOfInt.equals(fifthArrayOfInt));
        System.out.println("firstArrayOfInt.equals(sixthArrayOfInt): " + firstArrayOfInt.equals(sixthArrayOfInt));

        System.out.println("First element of firstArrayOfInt: " + firstArrayOfInt[0]);
        System.out.println("First element of secondArrayOfInt: " + secondArrayOfInt[0]);
        System.out.println("First element of thirdArrayOfInt: " + thirdArrayOfInt[0]);
        System.out.println("First element of fourthArrayOfInt: " + fourthArrayOfInt[0]);
        System.out.println("First element of fifthArrayOfInt: " + fifthArrayOfInt[0]);
        System.out.println("First element of sixthArrayOfInt: " + sixthArrayOfInt[0]);

    }

}
