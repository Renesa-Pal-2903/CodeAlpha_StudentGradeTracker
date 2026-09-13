import java.util.LinkedHashMap;

public class Student {

    private String name;
    private int rollNumber;
    private LinkedHashMap<String, Double> marks;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new LinkedHashMap<>();
    }

    public void addMark(String subject, double mark) {
        marks.put(subject, mark);
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public LinkedHashMap<String, Double> getMarks() {
        return marks;
    }

    public double calculateAverage() {

        if (marks.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (double mark : marks.values()) {
            total += mark;
        }

        return total / marks.size();
    }

    public double getHighestScore() {

        if (marks.isEmpty()) {
            return 0;
        }

        double highest = 0;

        for (double mark : marks.values()) {
            if (mark > highest) {
                highest = mark;
            }
        }

        return highest;
    }

    public double getLowestScore() {

        if (marks.isEmpty()) {
            return 0;
        }

        double lowest = Double.MAX_VALUE;

        for (double mark : marks.values()) {
            if (mark < lowest) {
                lowest = mark;
            }
        }

        return lowest;
    }

    public String calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B+";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else if (average >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public String getResult() {

        if (marks.isEmpty()) {
            return "NO RESULT";
        }

        for (double mark : marks.values()) {

            if (mark < 40) {
                return "FAIL";
            }
        }

        return "PASS";
    }
}