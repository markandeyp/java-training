package oops.inheritance;

public class ElectricCar extends Car {
    public ElectricCar() {
        setFuel("Electricity");
    }

    public void drive() {
        System.out.printf("I run on %s\n", getFuel());
    }

    public void brake(){
        super.brake();
        System.out.println("I brake by cutting power to motors");
    }
}
