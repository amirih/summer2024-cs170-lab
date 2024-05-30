package Lab_03;

import java.io.FileNotFoundException;

public class Step01Errors {
    // The following code has errors.

    public static void main(String[] args) throws FileNotFoundException {

        // Error are commented out to prevent the program from crashing
        // To see the error, uncomment the line you want to see the error for
        //// syntax error: missing semicolon
        // System.out.println("Hello, World!")

        //// syntax error: missing closing parenthesis
        // System.out.println("Hello, World!";

        //// syntax error: variable name cannot start with a number
        // int 1stNumber = 10;

        //// syntax error: variable name cannot contain a space
        // int first Number = 10;

        //// syntax error: variable name cannot contain a special character
        // int first#Number = 10;

        //// syntax error: variable name cannot contain a special character
        // UPDATE: $ is allowed in variable names but it is not recommended to avoid
        //// confusion
        // int first$Number = 10;

        //// logic error: the following code will print the result of subtraction
        //// instead of addition
        int x = 10;
        int y = 20;
        System.out.println(x - y + " is the result of " + x + " + " + y);

        //// logic error: compute the average of two numbers
        int a = 10;
        int b = 20;
        System.out.println("The average of " + a + " and " + b + " is " + (a * b) / 2);

        // runtime error: division by zero
        int c = 10;
        int d = 0;
        // System.out.println(c / d);

        // runtime error: array index out of bounds
        int[] arr = new int[5];
        // System.out.println(arr[5]);

        // runtime error: null pointer exception
        String str = null;
        // System.out.println(str.length());

        // runtime error: class cast exception
        Object obj = new Object();
        String strExample = "Hello, World!";
        // String strObj = (String) obj;
        Object objStr = (Object) strExample;
        System.err.println(objStr);

        // runtime error: file not found exception
        // FileReader file = new FileReader("file.txt");

    }
}
