package Lab_04;

public class Step05MethodsReturns {
    public static String getMyNameString(String name) {
        String nameString = "My name is: " + name;
        return nameString;
    }

    public static String getMyGradeString(String grade) {
        String gradeString = "My grade is: " + grade;
        return gradeString;
    }

    public static String getMyInformation(String name, String grade) {
        String nameString = getMyNameString(name);
        String gradeString = getMyGradeString(grade);
        return nameString + "\n" + gradeString;
    }

    public static void main(String[] args) {

        String myInformation = getMyInformation("Student 1", "A");
        System.out.println(myInformation);

    }
}
