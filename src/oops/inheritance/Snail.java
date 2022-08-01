package oops.inheritance;

public class Snail extends Animal {
    public Snail(String name) {
        super(name);
        this.favouriteFood = "Vegetables";
        this.sound = "Elvish";
        this.movement = "Crawl";
        this.something = "something snail";
    }

    public void move() {
        super.move();
        System.out.printf("I am %s and I am super fast\n", name);
    }
}
