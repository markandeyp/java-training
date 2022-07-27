package oops.inheritance;

public class Animal {
    protected String name;
    protected String favouriteFood;
    protected String movement;
    protected String sound;

    protected String something = "Something";

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.printf("I am %s and I %s\n", name, sound);
    }

    public void move() {
        System.out.printf("I %s\n", movement);
    }

    public void eat() {
        System.out.printf("I enjoy eating %s\n", favouriteFood);
    }

    public void print() {
        System.out.println(something);
    }
}
