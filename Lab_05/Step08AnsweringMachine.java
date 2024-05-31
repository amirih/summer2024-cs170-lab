package Lab_05;

public class Step08AnsweringMachine {

    public static boolean shouldAnswerCall(String name) {
        if (name.equals("Boss")) {
            System.out.println("Boss is calling. Connect the call.");
            return true;
        } else if (name.equals("TroubleMaker")) {
            System.out.println("TroubleMaker is calling. Connect the call.");
            return true;
        }
        return false;
    }

    public static boolean shouldAnswerCall(String name, int duration) {
        if (name.equals("Boss")) {
            System.out.println("Boss is calling. Connect the call.");
            return true;
        } else if (!isLongCall(duration)) {
            System.out.println("The call is not long. Connect the call.");
            return true;
        } else if (name.equals("Customer") && duration < 10) {
            System.out.println("Customer is calling and the call is not that long. Connect the call.");
            return true;
        } else if (name.equals("TroubleMaker")) {
            System.out.println("TroubleMaker is calling. Connect the call.");
            return true;
        } else if (name.equals("Customer") && duration >= 10) {
            System.out.println("Customer is calling and the call is long. Message will be left.");
            leaveMessage(name, duration);
        }

        return false;
    }

    public static boolean isLongCall(int duration) {
        if (duration > 5) {
            return true;
        }
        return false;
    }

    public static boolean talkativeCustomer(String name, int duration) {
        if (shouldAnswerCall(name, duration) && isLongCall(duration)) {
            return true;
        }
        return false;
    }

    public static boolean amIInTrouble(String name, int duration) {
        if (talkativeCustomer(name, duration)) {
            return true;
        }
        return false;
    }

    public static int getRandomDuration(int min, int max) {
        int duration = (int) ((Math.random() * (max - min)) + min);
        System.out.println("The duration of the call is: " + duration + " minutes");
        return duration;
    }

    public static void leaveMessage(String name, int duration) {
        if (amIInTrouble(name, duration)) {
            System.out.println("Leave a message to the boss");
        } else {
            System.out.println("Leave a message to the customer");
        }
    }

    public static void main(String[] args) {

        // There are bugs in the code. Can you find them?
        String name = "Boss";

        System.out.println("The answer of the call is: " + shouldAnswerCall(name));

        name = "Customer";
        int duration = getRandomDuration(1, 30);
        System.out.println("The call is long: " + isLongCall(duration));

        System.out.println("Answer customer call: " + shouldAnswerCall(name, duration));

        System.out.println("I am in trouble: " + amIInTrouble(name, duration));

        name = "TroubleMaker";
        System.out.println("I am in trouble: " + amIInTrouble(name, duration));

    }
}
