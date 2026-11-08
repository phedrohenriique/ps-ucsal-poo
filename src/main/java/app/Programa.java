package app;

import app.services.UI;
import app.services.VehicleService;
import app.models.Car;
import app.models.Motorcycle;

// $ choco install maven ( for windows users )
// go to scrapper/app-java
// run script with
// $ mvn compile
// $ java -cp target/classes App

// to run directly
// mvn clean compile exec:java
// mvn dependency:tree - check for maven dependencies
// mvn -f scripts/script-pom.xml clean compile exec:java

public class Programa {

    public static void main(String[] args) throws Exception {

        System.out.println("STARTING APP");

        System.out.println("VEHICLE MANAGEMENT SYSTEM");

        // Motorcycles
        Motorcycle vehicle_01 = new Motorcycle(1, "toyota", "VM220", 220);
        Motorcycle vehicle_03 = new Motorcycle(3, "honda", "CB500", 500);
        Motorcycle vehicle_05 = new Motorcycle(5, "yamaha", "MT07", 700);
        Motorcycle vehicle_07 = new Motorcycle(7, "suzuki", "GSX750", 750);
        Motorcycle vehicle_09 = new Motorcycle(9, "kawasaki", "Ninja400", 400);

        // Cars
        Car vehicle_02 = new Car(2, "ford", "BM5500", 550);
        Car vehicle_04 = new Car(7, "chevrolet", "Onix", 1000);
        Car vehicle_06 = new Car(8, "volkswagen", "Golf", 1600);
        Car vehicle_08 = new Car(9, "fiat", "Argo", 1300);
        Car vehicle_10 = new Car(10, "hyundai", "HB20", 1000);

        VehicleService vehicleService = new VehicleService();
        vehicleService.addVehicle(vehicle_01);
        vehicleService.addVehicle(vehicle_02);
        vehicleService.addVehicle(vehicle_03);
        vehicleService.addVehicle(vehicle_04);
        vehicleService.addVehicle(vehicle_05);
        vehicleService.addVehicle(vehicle_06);
        vehicleService.addVehicle(vehicle_07);
        vehicleService.addVehicle(vehicle_08);
        vehicleService.addVehicle(vehicle_09);
        vehicleService.addVehicle(vehicle_10);

        System.out.println("VEHICLES ADDED:"+ vehicleService.getVehicleListSize());

        UI ui = new UI(vehicleService);
        ui.frontendUI();


        try {

        } catch (Exception exception) {

            System.err.println("ERROR : " + exception.getMessage());

        }

    }

}
