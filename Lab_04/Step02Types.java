package Lab_04;

public class Step02Types {

    public static void main(String[] args) {
        // Reference Data Types
        String name = "Student 1";
        System.out.println("String: " + name);

        // Array
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(
                "Array: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4]);

        // Object
        Student student = new Student("Student 1", "A");
        System.out.println("Object: " + student.getName() + ", " + student.getGrade());

    }

}

class Student {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}
