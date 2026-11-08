package app.models;

public class Car extends Vehicle {

    public Car(Integer id, String brand, Engine engine) {
        super(id, brand, engine);
    }


    @Override 
    public String toString(){
        return "Car(id="+getId()+", brand="+getBrand()+", engine="+getEngine()+")";
    }

    
}
