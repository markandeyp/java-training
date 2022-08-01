package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add("Ramesh");
        list.add(1);

        ArrayList<String> names = new ArrayList<>();
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Mukesh");

        names.set(0, "Rajesh");
        for (String name : names) {
            System.out.println(name);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Julia");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.printf("%s - %s\n", student.getKey(), student.getValue());
        }

        for (Integer key : students.keySet()) {
            System.out.printf("%s - %s\n", key, students.get(key));
        }
    }
}
