package Lab_05;

public class Step04ShortCircuitEvaluation {
    public static String getValidString() {
        return "Hello";
    }

    public static String getInvalidString() {
        return null;
    }

    public static boolean isCheckedTrue() {
        return true;
    }

    public static boolean isCheckedFalse() {
        return false;
    }

    public static boolean isNoNeedToCheck() {
        return true;
    }

    public static boolean isCheckNeeded() {
        return true;
    }

    public static void main(String[] args) {

        String invalidString = getInvalidString();
        String validString = getValidString();

        if (isCheckedFalse() && invalidString.equals("Hello")) {
            System.out.println("Short-circuit evaluation: it is true");
        } else {
            System.out.println("Short-circuit evaluation: it is false");
        }

        if (isCheckedTrue() && validString.equals("Hello")) {
            System.out.println("Short-circuit evaluation: it is true");
        } else {
            System.out.println("Short-circuit evaluation: it is false");
        }

        if (isNoNeedToCheck() || invalidString.equals("Hello")) {
            System.out.println("Short-circuit evaluation: it is true");
        } else {
            System.out.println("Short-circuit evaluation: it is false");
        }

        if (isNoNeedToCheck() || validString.equals("Hello")) {
            System.out.println("Short-circuit evaluation: it is true");
        } else {
            System.out.println("Short-circuit evaluation: it is false");
        }

        // this will throw a NullPointerException
        if (isCheckNeeded() && invalidString.equals("Hello")) {
            System.out.println("Short-circuit evaluation: it is true");
        } else {
            System.out.println("Short-circuit evaluation: it is false");
        }

    }

}
