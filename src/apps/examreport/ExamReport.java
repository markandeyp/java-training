package apps.examreport;

import java.util.Scanner;

public class ExamReport {
    private Student[] examData = new Student[5];
    private final Scanner scanner = new Scanner(System.in);
    private Student highestScorer;
    private Student lowestScorer;

    /*
     * function to display the report
     * */
    private void displayReport() {
        System.out.println("Name | Maths | Science | English | Total | Percentage");

        for (Student student : examData) {
            System.out.println(student);
        }

        System.out.printf("Highest Scorer\nName:%s, Percentage:%s\n", highestScorer.getName(), highestScorer.getPercentage());

        System.out.printf("Lowest Scorer\nName:%s, Percentage:%s\n", lowestScorer.getName(), lowestScorer.getPercentage());
    }

    /*
     * function to run the exam report logic
     * */
    public void run() {
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (int i = 0; i < examData.length; i++) {
            Student student = new Student();
            System.out.print("Enter name: ");
            student.setName(scanner.next());
            System.out.print("Enter score in maths: ");
            student.setScoreInMaths(scanner.nextInt());
            System.out.print("Enter score in science: ");
            student.setScoreInScience(scanner.nextInt());
            System.out.print("Enter score in english: ");
            student.setScoreInEnglish(scanner.nextInt());

            if (student.getTotalScore() > maxScore) {
                maxScore = student.getTotalScore();
                highestScorer = student;
            }

            if (student.getTotalScore() < minScore) {
                minScore = student.getTotalScore();
                lowestScorer = student;
            }

            examData[i] = student;
        }

        displayReport();
    }
}
