package oops;

import oops.inheritance.Animal;
import oops.inheritance.Cat;
import oops.inheritance.Dog;
import oops.inheritance.Snail;

public class Runner {
    public static void main(String[] args) {
        Animal sox = new Cat("Sox");
        Animal rocky = new Dog("Rocky");
        Animal turbo = new Snail("Turbo");

        sox.eat();
        sox.move();
        sox.speak();
        sox.print();

        rocky.eat();
        rocky.move();
        rocky.speak();
        rocky.print();

        turbo.eat();
        turbo.move();
        turbo.speak();
        turbo.print();

        Animal animal = new Animal("Animal");
        animal.print();
    }
}
