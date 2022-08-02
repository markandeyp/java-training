package AssigmentDay;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamReport {
    ArrayList<Students> list=new ArrayList<Students>();
    Students highestScorer,lowestScorer;
    private final Scanner scan=new Scanner(System.in);
    public void display(){
        System.out.println("________________________________________________________________");
        System.out.println("| SNO | NAME | MATHS | SCIENCE | ENGLISH | TOTAL | PERCENTAGE |");
        System.out.println("________________________________________________________________");
        for(Students student:list){
            System.out.println(student);
            System.out.println("________________________________________________________________");
        }
        System.out.printf("Highest Scorer :\nName:%s,Percentage:%s\n",highestScorer.getName(),highestScorer.getPercentage());
        System.out.printf("Lowest Scorer :\nName:%s,Percentage:%s\n",lowestScorer.getName(),lowestScorer.getPercentage());
    }
    public void run(){
        System.out.println("Enter no of student details you want to store :");
        int noOfStudents = scan.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        System.out.println("Enter student details :");
        for (int i = 0; i < noOfStudents; i++) {
            Students temp = new Students();
             temp.setSno(i+1);
            System.out.println("name:");
           temp.setName(scan.next());
            System.out.println("maths");
            temp.setScoreInMaths(scan.nextInt());
            System.out.println("science");
            temp.setScoreInScience(scan.nextInt());
            System.out.println("english");
            temp.setScoreInEnglish(scan.nextInt());
            if (temp.getTotal()>max) {
                max =temp.getTotal();
                highestScorer=temp;
            }
            if (temp.getTotal() < min) {
                min = temp.getTotal();
                lowestScorer = temp;
            }
            list.add(temp);
        }
    }
}
