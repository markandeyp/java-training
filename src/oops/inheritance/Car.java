package oops.inheritance;

public abstract class Car {
    private int numberOfWheels = 4;

    private String fuel = "Biofuel";

    private int numberOfSeats = 2;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public abstract void drive();

    public void brake(){
        System.out.println("I am braking");
    }
}
