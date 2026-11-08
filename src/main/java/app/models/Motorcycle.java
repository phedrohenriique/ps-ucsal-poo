package app.models;

// Motorcycle class that inherits from Vehicles

public class Motorcycle extends Vehicle {

    private Integer qtdWheel = 2;
    private Integer qtdDoor = 0;

    public Motorcycle(Integer id, String brand, String engineType, Integer enginePower){
        super(id, brand, engineType, enginePower);
    }

    public void showDesign() {
        System.out.print("Car(qtdWheel=" + this.qtdWheel + ", qtdDoor=" + this.qtdDoor + ")");
    }

    @Override 
    public String toString(){
        return "Motorcycle(id="+getId()+", brand="+getBrand()+", engine="+getEngine()+")";
    }

}
