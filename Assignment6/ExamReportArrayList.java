package Assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamReportArrayList {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Student> studentList = new ArrayList<>();

    private void displayReport() {
        System.out.println(String.format("%s",
                "-----------------------------------------------------------------------------------"));
        System.out.println(String.format("%6s %6s %6s %6s %6s %4s %6s %6s %6s %6s %6s %6s ", "NAMES", "|", "MATHS", "|",
                "SCIENCE", "|",
                "ENGLISH", "|", "TOTAL", "|", "%", "|"));
        System.out.println(String.format("%s",
                "-----------------------------------------------------------------------------------"));

        for (Student student : studentList) {
            // System.out.print(String.format("%6s %6s ", student, "|"));

            System.out.printf("%6s %6s %6s %6s %6s %5s %6s %7s %6s %6s %6s %6s ", student.getName(), "|",
                    student.getScoreInMaths(), "|", student.getScoreInScience(), "|", student.getScoreInEnglish(), "|",
                    student.getTotalScore(), "|", student.getPercentage(), "|");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------");
        }

    }

    private void search() {

        System.out.println();
        System.out.println("How do you want to search");

        System.out.println("1. Search by name");
        System.out.println("2. Search by percentage");
        System.out.println("3. Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the name of student: ");

                Object name = scanner.next();

                List<Student> filteredStudent = studentList.stream()
                        .filter(student -> student.getName().equals(name)).toList();

                System.out.println();
                System.out.println(String.format("%s",
                        "-----------------------------------------------------------------------------------"));
                System.out.println(
                        String.format("%6s %6s %6s %6s %6s %4s %6s %6s %6s %6s %6s %6s ", "NAMES", "|", "MATHS",
                                "|",
                                "SCIENCE", "|",
                                "ENGLISH", "|", "TOTAL", "|", "%", "|"));
                System.out.println(String.format("%s",
                        "-----------------------------------------------------------------------------------"));

                for (Student student : filteredStudent) {

                    System.out.printf("%6s %6s %6s %6s %6s %5s %6s %7s %6s %6s %6s %6s ", student.getName(), "|",
                            student.getScoreInMaths(), "|", student.getScoreInScience(), "|",
                            student.getScoreInEnglish(), "|",
                            student.getTotalScore(), "|", student.getPercentage(), "|");
                    System.out.println();
                    System.out.println(
                            "-----------------------------------------------------------------------------------");
                }

                break;

            case 2:
                System.out.print("Enter percentage of student: ");

                int percentage = scanner.nextInt();

                List<Student> filteredStudentPercentage = studentList.stream()
                        .filter(student -> student.getPercentage() >= (percentage)).toList();

                System.out.println();
                System.out.println(String.format("%s",
                        "-----------------------------------------------------------------------------------"));
                System.out.println(
                        String.format("%6s %6s %6s %6s %6s %4s %6s %6s %6s %6s %6s %6s ", "NAMES", "|", "MATHS",
                                "|",
                                "SCIENCE", "|",
                                "ENGLISH", "|", "TOTAL", "|", "%", "|"));
                System.out.println(String.format("%s",
                        "-----------------------------------------------------------------------------------"));

                for (Student student : filteredStudentPercentage) {

                    System.out.printf("%6s %6s %6s %6s %6s %5s %6s %7s %6s %6s %6s %6s ", student.getName(), "|",
                            student.getScoreInMaths(), "|", student.getScoreInScience(), "|",
                            student.getScoreInEnglish(), "|",
                            student.getTotalScore(), "|", student.getPercentage(), "|");
                    System.out.println();
                    System.out.println(
                            "-----------------------------------------------------------------------------------");

                }

                break;

            case 3:
                System.exit(0);

            default:
                System.out.println("SELECT A CORRECT CHOICE    !!!  TRY AGAIN ");
                break;

        }

    }

    void run() {

        System.out.print("Enter the number of Sudents: ");
        int totalStudents = scanner.nextInt();

        for (int i = 0; i < totalStudents; i++) {
            Student studentMember = new Student();
            System.out.print("Enter name: ");
            studentMember.setName(scanner.next());
            System.out.print("Marks in Maths: ");
            studentMember.setScoreInMaths(scanner.nextInt());
            System.out.print("Marks in Science: ");
            studentMember.setScoreInScience(scanner.nextInt());
            System.out.print("Marks in English: ");
            studentMember.setScoreInEnglish(scanner.nextInt());
            System.out.println();

            studentList.add(studentMember);

        }

        displayReport();

        while (true) {
            search();
        }
    }

}