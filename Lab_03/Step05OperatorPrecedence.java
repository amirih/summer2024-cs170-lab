package Lab_03;

public class Step05OperatorPrecedence {

    public static void main(String[] args) {

        int a = 81;
        int b = 72;
        int c = 63;
        int d = 54;
        int e = 45;
        int f = 36;
        int g = 27;
        int h = 18;

        System.out.println(a + " + " + b + " * " + c + " = " + (a + b * c));
        System.out.println(a + " + " + "(" + b + " * " + c + ") = " + (a + (b * c)));
        System.out.println("(" + a + " + " + b + ") * " + c + " = " + ((a + b) * c));
        System.out.println("-----------------------------");

        System.out.println(a + " + " + b + " / " + c + " - " + d + " = " + (a + b / c - d));
        System.out.println(a + " + " + "(" + b + " / " + c + ") - " + d + " = " + (a + (b / c) - d));
        System.out.println("(" + a + " + " + b + ") / " + c + " - " + d + " = " + ((a + b) / c - d));
        System.out.println("(((" + a + " + " + b + ") / " + c + ") - " + d + ") = " + (((a + b) / c - d)));
        System.out.println("((" + a + " + " + b + ") / " + "(" + c + " - " + d + ")) = " + ((a + b) / (c - d)));
        System.out.println("-----------------------------");

        System.out.println(a + " + " + b + " % " + c + " - " + d + " = " + (a + b % c - d));
        System.out.println(a + " + " + "(" + b + " % " + c + ") - " + d + " = " + (a + (b % c) - d));
        System.out.println("(" + a + " + " + b + ") % " + c + " - " + d + " = " + ((a + b) % c - d));
        System.out.println("(((" + a + " + " + b + ") % " + c + ") - " + d + ") = " + (((a + b) % c - d)));
        System.out.println("((" + a + " + " + b + ") % " + "(" + c + " - " + d + ")) = " + ((a + b) % (c - d)));
        System.out.println("-----------------------------");

        System.out.println(a + " + " + b + " * " + c + " / " + d + " * " + e + " - " + f + " + " + g + " / " + h + " = "
                + (a + b * c / d * e - f + g / h));
        System.out.println(a + " + " + "(" + b + " * " + c + " / " + d + " * " + e + ") - " + f + " + " + g + " / " + h
                + " = " + (a + (b * c / d * e) - f + g / h));
        System.out.println("(" + a + " + " + b + ") * " + c + " / " + d + " * " + e + " - " + f + " + " + g + " / " + h
                + " = " + ((a + b) * c / d * e - f + g / h));
        System.out.println("(((" + a + " + " + b + ") * " + c + " / " + d + " * " + e + ") - " + f + " + " + g + " / "
                + h + ") = " + (((a + b) * c / d * e - f + g / h)));
        System.out.println("((" + a + " + " + b + ") * " + c + " / " + "(" + d + " * " + e + " - " + f + ") + " + g
                + " / " + h + ") = " + ((a + b) * c / (d * e - f) + g / h));

        System.out.println("-------------Play with the code and see the results-------------");

    }

}
