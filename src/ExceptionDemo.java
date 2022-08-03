public class ExceptionDemo {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name.length());
            System.out.println(10 / 0);
        } catch (NullPointerException ex) {
            System.out.println("Null pointer exception happened");
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception happened");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Thanks for using exceptions");
        }

        try {
            Voter john = new Voter("John", 20);
            Voter olivia = new Voter("Olivia", 17);
            System.out.println(john);
            System.out.println(olivia);
        } catch (NotAnAdultException ex) {
            ex.printStackTrace();
        }
    }
}

class Voter {
    private String name;
    private int age;

    public Voter(String name, int age) throws NotAnAdultException {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NotAnAdultException {
        if (age < 18) {
            throw new NotAnAdultException(String.format("You are only %s. You can't vote. Try in next %s years", age, 18 - age));
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Hello %s. You can vote.", getName());
    }
}

class NotAnAdultException extends Exception {
    public NotAnAdultException(String message) {
        super(message);
    }
}