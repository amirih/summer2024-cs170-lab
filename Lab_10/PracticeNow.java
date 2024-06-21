package Lab_10;

public class PracticeNow {
    int evaluateExpression(String e) {

        if (!e.matches("\\d+[\\-+*/^%&]\\d+")) {
            System.out.println("Warning: The input format is not valid.");
            return 0;
        }

        String operator = e.replaceAll("\\d+", "");
        String[] numbers = e.split("[-+*/^%&]");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Warning: Division by zero.");
                    return 0;
                }
            case "^":
                return (int) Math.pow(num1, num2);
            case "%":
                return num1 % num2;
            case "&":
                return num1 & num2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        PracticeNow practiceNow = new PracticeNow();
        System.out.println(practiceNow.evaluateExpression("33&33")); // Outputs: 4
        // System.out.println(practiceNow.evaluateExpression("10*5")); // Outputs: 50
        // System.out.println(practiceNow.evaluateExpression("10a5")); // Outputs:
        // Warning: The input format is not valid.
        // // 0
        // System.out.println(practiceNow.evaluateExpression("10/0")); // Outputs:
        // Warning: Division by zero. 0
    }
}