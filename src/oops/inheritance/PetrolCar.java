package oops.inheritance;

public class PetrolCar extends Car {
    public PetrolCar() {
        setFuel("Petrol");
    }

    public void drive() {
        System.out.printf("I am burning %s and that's how I roll\n", getFuel());
    }
}
