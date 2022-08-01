package Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamReportList {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Student> studentList = new ArrayList<>();
    private Student highestScorer;
    private Student lowestScorer;

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
        System.out.println();
        System.out.printf("Highest Scorer\n--------------\nName:%s Percentage:%s\n", highestScorer.getName(),
                highestScorer.getPercentage());

        System.out.println();
        System.out.printf("Lowest Scorer\n--------------\nName:%s Percentage:%s\n", lowestScorer.getName(),
                lowestScorer.getPercentage());

    }

    void run() {

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

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

            if (studentMember.getTotalScore() > maxScore) {
                maxScore = studentMember.getTotalScore();
                highestScorer = studentMember;

            }

            if (studentMember.getTotalScore() < minScore) {
                minScore = studentMember.getTotalScore();
                lowestScorer = studentMember;

            }

            studentList.add(studentMember);

        }

        displayReport();

    }
}
