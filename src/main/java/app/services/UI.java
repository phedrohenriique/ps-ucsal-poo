package app.services;

import java.util.Scanner;

import app.models.Car;
import app.models.Motorcycle;
import app.models.Vehicle;

// class to present text interface UI
// each part of the UI has a session
// each session defined an implementation from the user in text terminal interface

public class UI {

    private VehicleService vehicleService;
    private Scanner scanner = new Scanner(System.in);

    public UI(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void frontendUI() {

        System.out.println("SYSTEM IS READY");

        System.out.println("CHOOSE OPTIONS");

        while (true) {

            System.out.println("""

                    1 - ADD VEHICLE
                    2 - UPDATE VEHICLE
                    3 - DELETE VEHICLE
                    4 - LIST VEHICLE LIST BY ID
                    5 - GET VEHICLE BY ID
                    6 - EXIT

                    """);

            Integer option = this.scanner.nextInt();

            if (option == 1) {
                addVehicleSession();
                continue;

            }

            if (option == 2) {
                updateVehicleSession();
                continue;
            }

            if (option == 3) {
                deleteVehicleSession();
                continue;
            }

            if (option == 4) {
                showVehicleListByIdSession();
                continue;
            }

            if (option == 5) {
                showVehicleById();
            }

            if (option == 6) {
                break;
            }

        }

        this.scanner.close();

    }

    public void addVehicleSession() {

        System.out.println("ADD VEHICLE SESSION \n");
        System.out.println("ADD VEHICLE ID");
        Integer id = this.scanner.nextInt();
        System.out.println("ADD VEHICLE BRAND");
        String brand = this.scanner.next();
        System.out.println("ADD VEHICLE ENGINE TYPE");
        String engineType = this.scanner.next();
        System.out.println("ADD VEHICLE ENGINE POWER");
        Integer enginePower = this.scanner.nextInt();

        System.out.println("CHOOSE: CAR - 1 OR MOTORCYCLE - 2");

        Integer vehicleOption = this.scanner.nextInt();

        if (vehicleOption == 1) {

            Car newVehicle = new Car(id, brand, engineType, enginePower);
            vehicleService.addVehicle(newVehicle);

        }

        if (vehicleOption == 2) {
            Motorcycle newVehicle = new Motorcycle(id, brand, engineType, enginePower);
            vehicleService.addVehicle(newVehicle);
        }

        System.out.println("NEW VEHICLE ADDED");

    }

    public void updateVehicleSession() {

        System.out.println("UPDATE VEHICLE SESSION \n");
        System.out.println("CHOOSE VEHICLE ID TO UPDATE");
        Integer id = this.scanner.nextInt();
        Vehicle vehicle = vehicleService.getVehicleById(id);
        if (vehicle == null) {
            System.out.println("VEHICLE ID NOT FOUND");
            return;
        }

        System.out.println("CHOOSE BRAND VALUE:");
        String brand = this.scanner.next();
        vehicle.setBrand(brand);

        System.out.println("CHOOSE ENGINE TYPE VALUE:");
        String engineType = scanner.next();
        vehicle.setEngineType(engineType);

        System.out.println("ENGINE POWER VALUE:");
        Integer enginePower = scanner.nextInt();
        vehicle.setEnginePower(enginePower);

        vehicleService.updateVehicle(id, vehicle);

        System.out.println("VEHICLE UPDATED");

    }

    public void deleteVehicleSession() {

        System.out.println("DELETE VEHICLE SESSION \n");
        System.out.println("CHOOSE VEHICLE ID TO DELETE");

        Integer id = this.scanner.nextInt();
        Vehicle vehicle = vehicleService.getVehicleById(id);
        if (vehicle == null) {
            System.out.println("VEHICLE ID NOT FOUND");
            return;
        }

        vehicleService.removeVehicle(id);
        System.out.println("VEHICLE REMOVED");

    }

    public void showVehicleListByIdSession() {

        vehicleService.showVehicleListOrderById();

    }

    public void showVehicleById() {

        System.out.println("SHOW VEHICLE SESSION \n");
        System.out.println("CHOOSE VEHICLE ID TO SHOW");

        Integer id = this.scanner.nextInt();
        Vehicle vehicle = vehicleService.getVehicleById(id);
        if (vehicle == null) {
            System.out.println("VEHICLE ID NOT FOUND");
            return;
        }

        System.out.println(vehicle);

    }

}
