package Lab_05;

public abstract class Step06EqualityCheck {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "World";

        System.out.println(str1 + " == " + str2 + " = " + (str1 == str2));
        System.out.println(str1 + " equals " + str2 + " = " + str1.equals(str2));
        System.out.println(str1 + " == " + str3 + " = " + (str1 == str3));
        System.out.println(str1 + " equals " + str3 + " = " + str1.equals(str3));
        System.out.println(str1 + " == " + str4 + " = " + (str1 == str4));
        System.out.println(str1 + " equals " + str4 + " = " + str1.equals(str4));

        double d1 = 10.0000000000000000000000000000000001;
        double d2 = 10.000000000000000004;
        System.out.println(d1 + " == " + d2 + " = " + (d1 == d2));

        float f1 = 10.0004987654321f;
        float f2 = 10.0004987f;

        System.out.println(f1 + " == " + f2 + " = " + (f1 == f2));
        System.out.println("Math.abs(" + f1 + " - " + f2 + ") < 0.000001 = " + (Math.abs(f1 - f2) < 0.000001));

        float f3 = 10.123456789f;
        float f4 = 10.123456f;

        System.out.println(f3 + " == " + f4 + " = " + (f3 == f4));
        System.out.println("Math.abs(" + f3 + " - " + f4 + ") < 0.000001 = " + (Math.abs(f3 - f4) < 0.000001));

    }

}
