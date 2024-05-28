package Lab_03;

class Step03Refactor {

    public static double getInterest(double balance, double rate) {
        double interest = balance * rate;
        interest = Math.round(interest * 100.0) / 100.0;
        return interest;
    }

    public static void main(String[] args) {
        // This is a refactored version of the code in Step02Debug.java
        // write cleaner code to avoid errors
        double[] balances = { 1000, 2000, 3000, 4000 };
        double rate = 0.1;

        for (int i = 0; i < balances.length; i++) {
            balances[i] += getInterest(balances[i], rate);
            System.out.println("The balance after one year is " + balances[i]);
        }

    }

}