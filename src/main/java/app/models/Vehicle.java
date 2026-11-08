package app.models;

public class Vehicle {

    private Integer id;
    private String brand;
    private Engine engine;

    public Vehicle(
            Integer id,
            String brand,
            String engineType,
            Integer enginePower
        ) {
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

    @Override 
    public String toString(){
        return "Vechile(id="+this.id+", brand="+this.brand+", engine="+this.engine+")";
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


    @Override 
    public String toString(){
        return "type="+this.type+", power="+this.power;
    }
}
