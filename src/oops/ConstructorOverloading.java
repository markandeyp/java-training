package oops;

import java.util.Scanner;

public class ConstructorOverloading {
    private String name;

    public ConstructorOverloading(String name) {
        this.name = name;
    }

    public ConstructorOverloading(String fName, String lName) {
        this.name = String.format("%s %s", fName, lName);
    }

    void print() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        ConstructorOverloading demo = new ConstructorOverloading("Hello World");
        demo.print();

        ConstructorOverloading demo2 = new ConstructorOverloading("Hello", "World");
        demo2.print();
    }
}
