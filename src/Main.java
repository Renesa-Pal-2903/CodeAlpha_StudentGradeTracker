import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeTracker tracker = new GradeTracker();

        while (true) {

            System.out.println("\n==========================================");
            System.out.println("          STUDENT GRADE TRACKER");
            System.out.println("==========================================");

            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Calculate Average");
            System.out.println("4. Find Highest Score");
            System.out.println("5. Find Lowest Score");
            System.out.println("6. Display Student Report");
            System.out.println("7. Find Top Performing Student");
            System.out.println("8. Exit");

            System.out.print("\nEnter your choice: ");

            if (!sc.hasNextInt()) {

                System.out.println(
                    "\nInvalid input! Please enter a number."
                );

                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n===== ADD STUDENT =====");

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine().trim();

                    if (name.isEmpty()) {
                        System.out.println(
                            "Student name cannot be empty."
                        );
                        break;
                    }

                    System.out.print("Enter roll number: ");

                    if (!sc.hasNextInt()) {
                        System.out.println(
                            "Invalid roll number!"
                        );
                        sc.nextLine();
                        break;
                    }

                    int rollNumber = sc.nextInt();
                    sc.nextLine();

                    if (rollNumber <= 0) {
                        System.out.println(
                            "Roll number must be positive."
                        );
                        break;
                    }

                    if (tracker.findStudent(rollNumber) != null) {

                        System.out.println(
                            "A student with this roll number already exists."
                        );

                        break;
                    }

                    Student student = new Student(name, rollNumber);

                    System.out.print("Enter number of subjects: ");

                    if (!sc.hasNextInt()) {

                        System.out.println(
                            "Invalid number of subjects!"
                        );

                        sc.nextLine();
                        break;
                    }

                    int numberOfSubjects = sc.nextInt();
                    sc.nextLine();

                    if (numberOfSubjects <= 0) {

                        System.out.println(
                            "Number of subjects must be greater than 0."
                        );

                        break;
                    }

                    for (int i = 1; i <= numberOfSubjects; i++) {

                        System.out.print(
                            "Enter subject " + i + " name: "
                        );

                        String subject = sc.nextLine().trim();

                        if (subject.isEmpty()) {

                            System.out.println(
                                "Subject name cannot be empty."
                            );

                            i--;
                            continue;
                        }

                        double mark;

                        while (true) {

                            System.out.print(
                                "Enter marks for " + subject + " (0-100): "
                            );

                            if (!sc.hasNextDouble()) {

                                System.out.println(
                                    "Invalid marks! Please enter a number."
                                );

                                sc.nextLine();
                                continue;
                            }

                            mark = sc.nextDouble();
                            sc.nextLine();

                            if (mark >= 0 && mark <= 100) {
                                break;
                            }

                            System.out.println(
                                "Invalid marks! Please enter a value between 0 and 100."
                            );
                        }

                        student.addMark(subject, mark);
                    }

                    tracker.addStudent(student);

                    System.out.println(
                        "\nStudent added successfully!"
                    );

                    break;

                case 2:

                    tracker.displayAllStudents();

                    break;

                case 3:

                    System.out.println(
                        "\n===== CALCULATE AVERAGE ====="
                    );

                    System.out.print("Enter roll number: ");

                    if (!sc.hasNextInt()) {
                        System.out.println(
                            "Invalid roll number!"
                        );
                        sc.nextLine();
                        break;
                    }

                    int averageRoll = sc.nextInt();
                    sc.nextLine();

                    tracker.displayAverage(averageRoll);

                    break;

                case 4:

                    System.out.println(
                        "\n===== FIND HIGHEST SCORE ====="
                    );

                    System.out.print("Enter roll number: ");

                    if (!sc.hasNextInt()) {
                        System.out.println(
                            "Invalid roll number!"
                        );
                        sc.nextLine();
                        break;
                    }

                    int highestRoll = sc.nextInt();
                    sc.nextLine();

                    tracker.displayHighestScore(highestRoll);

                    break;

                case 5:

                    System.out.println(
                        "\n===== FIND LOWEST SCORE ====="
                    );

                    System.out.print("Enter roll number: ");

                    if (!sc.hasNextInt()) {
                        System.out.println(
                            "Invalid roll number!"
                        );
                        sc.nextLine();
                        break;
                    }

                    int lowestRoll = sc.nextInt();
                    sc.nextLine();

                    tracker.displayLowestScore(lowestRoll);

                    break;

                case 6:

                    System.out.println(
                        "\n===== STUDENT REPORT ====="
                    );

                    System.out.print("Enter roll number: ");

                    if (!sc.hasNextInt()) {
                        System.out.println(
                            "Invalid roll number!"
                        );
                        sc.nextLine();
                        break;
                    }

                    int reportRoll = sc.nextInt();
                    sc.nextLine();

                    tracker.displayStudentReport(reportRoll);

                    break;

                case 7:

                    tracker.displayTopStudent();

                    break;

                case 8:

                    System.out.println(
                        "\nThank you for using Student Grade Tracker!"
                    );

                    sc.close();

                    return;

                default:

                    System.out.println(
                        "\nInvalid choice! Please enter a number from 1 to 8."
                    );
            }
        }
    }
}