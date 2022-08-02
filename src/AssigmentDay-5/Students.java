package AssigmentDay;

public class Students {
    private int sno;
    private String name;
    private int scoreInMaths;
    private int scoreInScience;
    private int scoreInEnglish;

    public int getScoreInMaths() {
        return scoreInMaths;
    }

    public int getScoreInScience() {
        return scoreInScience;
    }

    public void setScoreInScience(int scoreInScience) {
        this.scoreInScience = scoreInScience;
    }

    public void setScoreInMaths(int scoreInMaths) {
        this.scoreInMaths = scoreInMaths;
    }

    public String getName() {
        return name;
    }

    public int getScoreInEnglish() {
        return scoreInEnglish;
    }

    public void setScoreInEnglish(int scoreInEnglish) {
        this.scoreInEnglish = scoreInEnglish;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t\t%s\t\t%s\t\t%s\t\t%s", getName(), getScoreInMaths(), getScoreInScience(), getScoreInEnglish(), getTotal(), getPercentage());
    }

    public void setSno(int sno) {
        this.sno = sno;
    }
    public int getTotal(){return getScoreInMaths()+getScoreInScience()+getScoreInEnglish();}
    public float getPercentage(){return (getTotal()*100)/150;}
}
