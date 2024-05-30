package Lab_03;

public class Step04TypeConversion {
    public static void main(String[] args) {
        // Type conversion (casting) - may result in loss of data or precision
        int intValueA = 1000000000;
        int intTemp = 0;
        long longValueA = 1000000000000000000L;
        long longTemp = 0L;
        double doubleValueA = 1000001000010000001000000100000010000001000000100000000100000000100000000100000010000.0000000000005000000050000000000000000050000000005;
        double doubleTemp = 0.0;
        float floatValueA = 10000100000001000000001000000010000000.9000000005000050000000000000005000000000000005000000000000000000000000000000000000050000000005f;
        float floatTemp = 0.0f;
        String stringValueA = "10";
        String stringTemp = "";

        // implicit conversion
        // int to long
        longTemp = intValueA;
        System.out.println("int to long: " + intValueA + " -> " + longTemp);

        // int to double
        doubleTemp = intValueA;
        System.out.println("int to double: " + intValueA + " -> " + doubleTemp);

        // int to float
        floatTemp = intValueA;
        System.out.println("int to float: " + intValueA + " -> " + floatTemp);

        // int to string
        stringTemp = Integer.toString(intValueA);
        System.out.println("int to string: " + intValueA + " -> " + stringTemp);

        // explicit conversion
        // long to int
        intTemp = (int) longValueA;
        System.out.println("long to int: " + longValueA + " -> " + intTemp);

        // long to double
        doubleTemp = longValueA;
        System.out.println("long to double: " + longValueA + " -> " + doubleTemp);

        // long to float
        floatTemp = longValueA;

        // long to string
        stringTemp = Long.toString(longValueA);
        System.out.println("long to string: " + longValueA + " -> " + stringTemp);

        // double to int
        intTemp = (int) doubleValueA;
        System.out.println("double to int: " + doubleValueA + " -> " + intTemp);

        // double to long
        longTemp = (long) doubleValueA;
        System.out.println("double to long: " + doubleValueA + " -> " + longTemp);

        // double to float
        floatTemp = (float) doubleValueA;
        System.out.println("double to float: " + doubleValueA + " -> " + floatTemp);

        // double to string
        stringTemp = Double.toString(doubleValueA);
        System.out.println("double to string: " + doubleValueA + " -> " + stringTemp);

        // float to int
        intTemp = (int) floatValueA;
        System.out.println("float to int: " + floatValueA + " -> " + intTemp);

        // float to long
        longTemp = (long) floatValueA;
        System.out.println("float to long: " + floatValueA + " -> " + longTemp);

        // float to double
        doubleTemp = floatValueA;
        System.out.println("float to double: " + floatValueA + " -> " + doubleTemp);

        // float to string
        stringTemp = Float.toString(floatValueA);
        System.out.println("float to string: " + floatValueA + " -> " + stringTemp);

        // string to int
        intTemp = Integer.parseInt(stringValueA);
        System.out.println("string to int: " + stringValueA + " -> " + intTemp);

        // string to long
        longTemp = Long.parseLong(stringValueA);
        System.out.println("string to long: " + stringValueA + " -> " + longTemp);

        // string to double
        doubleTemp = Double.parseDouble(stringValueA);
        System.out.println("string to double: " + stringValueA + " -> " + doubleTemp);

        // string to float
        floatTemp = Float.parseFloat(stringValueA);

        // string to string
        stringTemp = stringValueA;
        System.out.println("string to string: " + stringValueA + " -> " + stringTemp);

        // explicit conversion with loss of data

        int a =5;
        int b=8;
        double c=9.0;
        String d ="Hello";
        System.out.println(a+b+c+d);
        System.out.println(a+d+b+c);
        System.out.println(a+d+b*c);
        System.out.println(a+d+(b+c));


    }
}
