package students;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamReport {
    private ArrayList<Student> examData = new ArrayList<Student>();
    private final Scanner scanner = new Scanner(System.in);
    private Student highestScorer;
    private Student lowestScorer;

    /*
     * function to display the report
     * */
    private void displayReport() {
        System.out.println("Name | Maths | Science | English | Total | Percentage");

        for (Student student : examData) {
            System.out.println(student+"      ");
        }

        System.out.println("Highest Scorer\nName: "+ highestScorer.getName() + " Percentage: "+highestScorer.getPercentage());

        System.out.println("Lowest Scorer\nName: "+lowestScorer.getName()+ " Percentage: "+lowestScorer.getPercentage());
    }

    /*
     * function to run the exam report logic
     * */
    public void run() {
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;
        System.out.println("Enter no of student :");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
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

            examData.add(i, student);

        }

        displayReport();
    }
}
