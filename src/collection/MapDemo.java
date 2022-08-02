package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
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
