package app.models;

// Vehicle class that uses Engine class with getters and setters

public class Vehicle {

    private Integer id;
    private String brand;
    private Engine engine;

    public Vehicle(
            Integer id,
            String brand,
            String engineType,
            Integer enginePower) {
        this.id = id;
        this.brand = brand;
        this.engine = new Engine(engineType, enginePower);
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setBrand(String value) {
        this.brand = value;
    }

    public void setEngineType(String value) {
        this.engine.setType(value);
    }

    public void setEnginePower(Integer value) {
        this.engine.setPower(value);
    }

    public void setEngine(String engineType, Integer enginePower) {
        this.engine = new Engine(engineType, enginePower);

    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vechile(id=" + this.id + ", brand=" + this.brand + ", engine=" + this.engine + ")";
    }
}

class Engine {

    private String engineType;
    private Integer enginePower;

    Engine(
            String type,
            Integer power) {
        this.engineType = type;
        this.enginePower = power;
    }

    public Integer getPower() {
        return enginePower;
    }

    public String getType() {
        return engineType;
    }

    public void setPower(Integer value) {
        this.enginePower = value;
    }

    public void setType(String value) {
        this.engineType = value;
    }

    @Override
    public String toString() {
        return "type=" + this.engineType + ", power=" + this.enginePower;
    }
}
