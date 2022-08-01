package oops.inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.favouriteFood = "Bone";
        this.sound = "Woof";
        this.movement = "Run";
        this.something = "something dog";
    }

    public void move() {
        System.out.printf("I love to fetch and %s\n", movement);
    }
}
