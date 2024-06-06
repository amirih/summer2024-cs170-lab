package Lab_07;

public class PracticeNow {

    public static void main(String[] args) {
        /* -------- PART 1: Array Initialization -------- */
        /*
         * 1a. For each of the data types below, create an array
         * of length 4 but do not initialize any values (e.g. int[] nums = new int[4];)
         * data types: int, double, boolean, String, Turtle
         */

        /*
         * 1b. For each array you created, try to print out the first element. What
         * is the result?
         */

        /* -------- PART 2: Common Array Errors -------- */
        /*
         * 2. Create (declare and initialize) an array that contains 4 Strings.
         * What is the result of printing the elements at the following indices?
         * indices: 0, 3, 4
         */

        /* 3. Look at the following code. */
        // int[] numbers = new int[4];
        // numbers[0] = 1;
        // numbers[1] = 'A';
        // numbers[2] = 1.0;
        // numbers[3] = "hi";

        /*
         * 3a. Before uncommenting and running the code, which line(s) do you think
         * may cause an error? Why?
         */

        /*
         * 3b. Now, uncomment and run the code. Were you right? What explanation can
         * you give for this behavior?
         * Note: make sure you comment out any code from #2 that caused an error
         */

        /* 4. Look at the following code. */
        // String[] say_hello = {"hi", "hello", "greetings", "good morning"};
        // System.out.println(say_hello[0]);
        // System.out.println(say_hello[3]);
        // System.out.println(say_hello);

        /*
         * 4a. Before uncommenting and running the code, what do you think will be
         * printed from this code?
         */

        /*
         * 4b. What is actually printed? What explanation can you give for this
         * behavior?
         * Note: make sure you comment out any code from #3 that caused an error
         */

        /* 4c. What is the correct way to print the contents of an array? */

        /* -------- PART 3: Arrays as Parameters -------- */
        /*
         * 5. Look at the following code, and the code for the method foo defined
         * below.
         */
        // double[] my_array = {1.5, 3.14, 2.22, 7.0};
        // double my_double = 4.4;
        // double my_other_double = 6.3;
        // my_other_double = foo(my_array, my_double, my_other_double);
        // System.out.println(my_array[0]);
        // System.out.println(my_double);
        // System.out.println(my_other_double);

        /*
         * 5a. Before uncommenting and running the code, what three values do you
         * think will be printed in the main method?
         */

        /*
         * 5b. Now, uncomment and run the code. Were you right? What explanation can
         * you give for this behavior?
         */

        /* -------- PART 4: Programming with Arrays (Extra Practice) -------- */
        /*
         * 6. Write a method called removeDuplicates that takes in an array of
         * integers,
         * removes any duplicates from the array, and returns an array without
         * duplicates
         * (each integer is unique). In the main method, print both the original array
         * and
         * the array with no duplicates.
         * Example: removeDuplicates({1,2,2,3,4,5,5,6,7}) -> 1,2,3,4,5,6,7
         */

        /*
         * 7. Write a method called printCommonElements that takes in two arrays of
         * Strings and
         * prints from the method a list of elements the two arrays have in common.
         * Bonus: ensure there is no repetition in the answer.
         * Example: printCommonElements({"SQL", "Java", "PHP", "C#", "C++", "SQL"},
         * {"SQL", "Java", "Oracle", "DB2", "Java"}) -> SQL, Java
         */

    }

    public static double foo(double[] m, double x, double y) {
        m[0] += 1;
        x += 1;
        y += 1;
        return y;
    }

}