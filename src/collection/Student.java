package collection;

import java.util.Objects;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            Student student = (Student) obj;
            return getId() == student.getId();
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
