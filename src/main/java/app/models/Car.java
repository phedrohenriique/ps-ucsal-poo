package app.models;

// Car class that inherits from Vehicles

public class Car extends Vehicle {

    private Integer qtdWheel = 4;
    private Integer qtdDoor = 4;

    public Car(Integer id, String brand, String engineType, Integer enginePower) {
        super(id, brand, engineType, enginePower);
    }

    public void showDesign() {
        System.out.print("Car(qtdWheel=" + this.qtdWheel + ", qtdDoor=" + this.qtdDoor + ")");
    }

    @Override
    public String toString() {
        return "Car(id=" + getId() + ", brand=" + getBrand() + ", engine=" + getEngine() + ")";
    }

}
