package app.models;

// Motorcycle class that inherits from Vehicles

public class Motorcycle extends Vehicle {

    public Motorcycle(Integer id, String brand, String engineType, Integer enginePower){
        super(id, brand, engineType, enginePower);
    }

    @Override 
    public String toString(){
        return "Motorcycle(id="+getId()+", brand="+getBrand()+", engine="+getEngine()+")";
    }

}
