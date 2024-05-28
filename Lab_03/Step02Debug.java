package Lab_03;

class Step02Debug {

    public static double getInterest(double balance, double rate) {
        double interest = balance * rate;
        interest = Math.round(interest * 100.0) / 100.0;
        return interest;
    }

    public static void main(String[] args) {
        // We show the use of debugger here:
        // 1. Set a breakpoint at the line where you want to start debugging
        // 2. Run the program in debug mode
        // 3. Use the debugger to step through the code
        // 4. Observe the values of variables at each step

        double balance1 = 1000;
        double rate = 0.1;
        double interest = getInterest(balance1, rate);
        balance1 += interest;
        System.out.println("The balance after one year is " + balance1);

        double balance2 = 2000;
        interest = getInterest(balance2, rate);
        balance2 += interest;
        System.out.println("The balance after one year is " + balance2);

        double balance3 = 3000;
        rate = 0.15; // error here (should be 0.1)
        interest = getInterest(balance3, rate);
        balance3 += interest;
        System.out.println("The balance after one year is " + balance2); // error here (should be balance3)

        double balance4 = 4000;
        interest = getInterest(balance4, rate);
        balance4 -= interest; // error here (should be +=)
        System.out.println("The balance after one year is " + balance4);

    }

}