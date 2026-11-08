package app.models;

// Car class that inherits from Vehicles

public class Car extends Vehicle {

    public Car(Integer id, String brand, String engineType, Integer enginePower) {
        super(id, brand, engineType, enginePower);
    }

    @Override
    public String toString() {
        return "Car(id=" + getId() + ", brand=" + getBrand() + ", engine=" + getEngine() + ")";
    }

}
