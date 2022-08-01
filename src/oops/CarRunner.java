package oops;

import oops.inheritance.Car;
import oops.inheritance.ElectricCar;
import oops.inheritance.PetrolCar;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new PetrolCar();
        Car eCar = new ElectricCar();

        car.drive();
        car.brake();

        eCar.drive();
        eCar.brake();
    }
}
