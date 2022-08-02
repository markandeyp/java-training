


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
        System.out.println("Enter no of student :");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            Student student = new Student();
            System.out.print("Enter name: ");
            student.setName(scanner.next());
            System.out.print("Enter 3 subjects marks maths science english: ");
            student.setScoreInMaths(scanner.nextInt());
            student.setScoreInScience(scanner.nextInt());
            student.setScoreInEnglish(scanner.nextInt());
            if (student.getTotalScore() < minScore) {
                minScore = student.getTotalScore();
                lowestScorer = student;
            }
            if (student.getTotalScore() > maxScore) {
                maxScore = student.getTotalScore();
                highestScorer = student;
            }

            examData.add(i, student);

        }

        displayReport();
    }
}



