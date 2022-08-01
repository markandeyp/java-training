package oops.inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.favouriteFood = "Meat";
        this.sound = "Mew";
        this.movement = "Jump";
        this.something = "something cat";
    }

    public void speak() {
        super.speak();
        System.out.println("I am a cat");
    }
}
