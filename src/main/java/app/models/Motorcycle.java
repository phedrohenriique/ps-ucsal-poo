package app.models;

public class Motorcycle extends Vehicle {

    public Motorcycle(Integer id, String brand, Engine engine){
        super(id, brand, engine);
    }

    @Override 
    public String toString(){
        return "Motorcycle(id="+getId()+", brand="+getBrand()+", engine="+getEngine()+")";
    }

}
