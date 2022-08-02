package Testmarks;

import java.util.Scanner;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Set<Student> res;
        final Scanner scanner = new Scanner(System.in);
//        ExamReport app = new ExamReport();
        ExamData app = new ExamData();
        app.run();
        char loop;
        do {
            System.out.println("Enter your choice(1 for search by name & 2 for search by percentage)");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the name");
                    res= app.searchByName(scanner.next());
                    for (Student stud : res) {
                        System.out.println(stud);
                    }
                    break;
                case 2:
                    System.out.println("enter percentage");
                    res= app.searchByPercentage(scanner.nextFloat());
                    for (Student stud : res) {
                        System.out.println(stud);
                    }
                    break;

            }
            System.out.println("Do you want to continue ? (Y/N) OR (y/n)");
            loop=scanner.next().charAt(0);
        }
        while(loop=='y'||loop=='y');
    }
}

