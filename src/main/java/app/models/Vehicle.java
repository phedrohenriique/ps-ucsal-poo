package app.models;

public class Vehicle {

    private Integer id;
    private String brand;
    private Engine engine;

    public Vehicle(
            Integer id,
            String brand,
            Engine engine) {
        this.id = id;
        this.brand = brand;
        this.engine = engine;
    }
}

class Engine {

    private String type;
    private Integer power;

    Engine(
            String type,
            Integer power) {
        this.type = type;
        this.power = power;
    }
}
