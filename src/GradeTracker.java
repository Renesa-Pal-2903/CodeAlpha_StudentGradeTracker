import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students;

    public GradeTracker() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student findStudent(int rollNumber) {

        for (Student student : students) {

            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }

        return null;
    }

    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo students have been added yet.");
            return;
        }

        System.out.println("\n============================================================");
        System.out.println("                    STUDENT SUMMARY");
        System.out.println("============================================================");

        System.out.printf(
            "%-10s %-18s %-12s %-10s %-10s%n",
            "Roll No.", "Name", "Average", "Grade", "Result"
        );

        System.out.println("------------------------------------------------------------");

        for (Student student : students) {

            System.out.printf(
                "%-10d %-18s %-12.2f %-10s %-10s%n",
                student.getRollNumber(),
                student.getName(),
                student.calculateAverage(),
                student.calculateGrade(),
                student.getResult()
            );
        }

        System.out.println("============================================================");
    }

    public void displayStudentReport(int rollNumber) {

        Student student = findStudent(rollNumber);

        if (student == null) {
            System.out.println("\nStudent not found.");
            return;
        }

        System.out.println("\n========================================");
        System.out.println("           STUDENT GRADE REPORT");
        System.out.println("========================================");

        System.out.println("Name        : " + student.getName());
        System.out.println("Roll Number : " + student.getRollNumber());

        System.out.println("\n------------- MARKS -------------------");

        for (String subject : student.getMarks().keySet()) {

            System.out.printf(
                "%-12s : %.2f%n",
                subject,
                student.getMarks().get(subject)
            );
        }

        System.out.println("----------------------------------------");

        System.out.printf(
            "Average     : %.2f%n",
            student.calculateAverage()
        );

        System.out.printf(
            "Highest     : %.2f%n",
            student.getHighestScore()
        );

        System.out.printf(
            "Lowest      : %.2f%n",
            student.getLowestScore()
        );

        System.out.println(
            "Grade       : " + student.calculateGrade()
        );

        System.out.println(
            "Result      : " + student.getResult()
        );

        System.out.println("========================================");
    }

    public void displayAverage(int rollNumber) {

        Student student = findStudent(rollNumber);

        if (student == null) {
            System.out.println("\nStudent not found.");
            return;
        }

        System.out.printf(
            "\nAverage score of %s: %.2f%n",
            student.getName(),
            student.calculateAverage()
        );
    }

    public void displayHighestScore(int rollNumber) {

        Student student = findStudent(rollNumber);

        if (student == null) {
            System.out.println("\nStudent not found.");
            return;
        }

        System.out.printf(
            "\nHighest score of %s: %.2f%n",
            student.getName(),
            student.getHighestScore()
        );
    }

    public void displayLowestScore(int rollNumber) {

        Student student = findStudent(rollNumber);

        if (student == null) {
            System.out.println("\nStudent not found.");
            return;
        }

        System.out.printf(
            "\nLowest score of %s: %.2f%n",
            student.getName(),
            student.getLowestScore()
        );
    }

    public void displayTopStudent() {

        if (students.isEmpty()) {
            System.out.println("\nNo students have been added yet.");
            return;
        }

        Student topStudent = students.get(0);

        for (Student student : students) {

            if (student.calculateAverage() > topStudent.calculateAverage()) {
                topStudent = student;
            }
        }

        System.out.println("\n========================================");
        System.out.println("       TOP PERFORMING STUDENT");
        System.out.println("========================================");

        System.out.println("Name        : " + topStudent.getName());
        System.out.println("Roll Number : " + topStudent.getRollNumber());

        System.out.printf(
            "Average     : %.2f%n",
            topStudent.calculateAverage()
        );

        System.out.println(
            "Grade       : " + topStudent.calculateGrade()
        );

        System.out.println(
            "Result      : " + topStudent.getResult()
        );

        System.out.println("========================================");
    }
}