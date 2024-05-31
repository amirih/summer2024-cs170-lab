package Lab_04;

public class Step04VoidMethods {
    public static void printMyName(String name) {
        System.out.println("My name is: " + name);
    }

    public static void printMyGrade(String grade) {
        System.out.println("My grade is: " + grade);
    }

    public static void printMyInformation(String name, String grade) {
        printMyName(name);
        printMyGrade(grade);
    }

    public static void main(String[] args) {

        printMyInformation("Student 1", "A");

    }
}
