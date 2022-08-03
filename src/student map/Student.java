package students;

import java.util.Objects;
import java.util.Set;

public class Student {
    private final int MAX_MARKS = 150;
    private String name;
    private int scoreInMaths;
    private int scoreInScience;
    private int scoreInEnglish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScoreInMaths() {
        return scoreInMaths;
    }

    public void setScoreInMaths(int scoreInMaths) {
        this.scoreInMaths = scoreInMaths;
    }

    public int getScoreInScience() {
        return scoreInScience;
    }

    public void setScoreInScience(int scoreInScience) {
        this.scoreInScience = scoreInScience;
    }

    public int getScoreInEnglish() {
        return scoreInEnglish;
    }

    public void setScoreInEnglish(int scoreInEnglish) {
        this.scoreInEnglish = scoreInEnglish;
    }

    public int getTotalScore() {
        return scoreInMaths + scoreInScience + scoreInEnglish;
    }

    public double getPercentage() {
        return getTotalScore() * 100 / MAX_MARKS;
    }

    public String toString() {
        return String.format("%s\t%s\t\t%s\t\t%s\t\t%s\t\t%s", getName(), getScoreInMaths(), getScoreInScience(), getScoreInEnglish(), getTotalScore(), getPercentage());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            Student students = (Student) obj;
            return getName().equals(students.getName());
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}