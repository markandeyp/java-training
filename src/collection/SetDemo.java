package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student(1, "John"));
        students.add(new Student(2, "Robert"));
        students.add(new Student(3, "Julia"));
        students.add(new Student(4, "Earl"));
        students.add(new Student(1, "John"));

        Student std = new Student(1, "John");
        Student std2 = new Student(1, "Earl");

        System.out.printf("%s - %s\n", std.hashCode(), std2.hashCode());

        for (Student student : students) {
            System.out.printf("%s - %s\n", student.getId(), student.getName());
        }
    }
}
