# Student Grade Tracker

A Java-based console application developed to manage student records and track academic performance.

## 📌 Project Overview

The Student Grade Tracker is a console-based Java application that allows users to add and manage multiple student records, store subject-wise marks, calculate academic performance, and generate student reports.

The application uses Object-Oriented Programming (OOP) concepts and Java collections to organize and manage student data efficiently.

## ✨ Features

- Add new student records
- Store student name and roll number
- Store subject-wise marks
- Calculate average marks
- Find highest score
- Find lowest score
- Automatically assign grades
- Determine Pass/Fail status
- View all students in a summary table
- Generate a detailed student grade report
- Find the top-performing student
- Input validation for invalid entries
- Prevent duplicate roll numbers
- User-friendly menu-driven console interface

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- LinkedHashMap
- Scanner
- Java Collections Framework

## 📂 Project Structure

```text
StudentGradeTracker
│
├── .gitignore
├── README.md
│
└── src
    ├── Main.java
    ├── Student.java
    └── GradeTracker.java
```

## 🧩 Class Description

### Main.java

Acts as the entry point of the application.

It:

• Displays the main menu
• Takes input from the user
• Creates student objects
• Handles user choices
• Calls appropriate methods from GradeTracker

### Student.java

Represents an individual student.

It stores:

• Student name
• Roll number
• Subject-wise marks

It also performs:

• Average calculation
• Highest score calculation
• Lowest score calculation
• Grade calculation
• Pass/Fail determination

### GradeTracker.java

Manages multiple student records using an ArrayList.

It provides functionality to:

• Add students
• Search students by roll number
• Display all students
• Generate detailed student reports
• Display average, highest and lowest scores
• Find the top-performing student

## 🧠 OOP Concepts Used
### 1. Encapsulation

Student data members are declared as private and accessed through methods such as getters.

### 2. Classes and Objects

The application uses separate classes for students and grade management. Each student is represented as an object of the Student class.

### 3. Abstraction

Complex operations such as calculating averages, grades and results are handled inside methods, keeping the main program easier to manage.

## 📊 Grading System
Average Marks	Grade
90 - 100	     A+
80 - 89	         A
70 - 79	         B+
60 - 69	         B
50 - 59	         C
40 - 49	         D 
Below 40	     F

A student is considered PASS when all subject marks are 40 or above. If any subject mark is below 40, the result is FAIL.

## ▶️ How to Run
### Step 1: Open the project

Open the StudentGradeTracker folder in VS Code.

### Step 2: Open the terminal

Navigate to the src folder:
cd src

### Step 3: Compile the Java files
javac *.java

### Step 4: Run the application
java Main

## 🖥️ Application Menu
```text
==========================================
          STUDENT GRADE TRACKER
==========================================

1. Add Student
2. View All Students
3. Calculate Average
4. Find Highest Score
5. Find Lowest Score
6. Display Student Report
7. Find Top Performing Student
8. Exit
```
## 🎯 Learning Outcomes

Through this project, I gained practical experience in:

• Java programming
• Object-Oriented Programming
• Classes and objects
• Encapsulation
• ArrayList and LinkedHashMap
• Loops and conditional statements
• Input validation
• Data management
• Console-based application development

## 👩‍💻 Author

Renesa Pal

Java Development Intern