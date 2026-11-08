package app.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import app.models.Vehicle;

public class VehicleService {

    private List<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void removeVehicle(Integer id) {

        for (int i = 0; i < vehicleList.size(); i++) {

            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.remove(i);
                return;
            }
        }
    }

    public void updateVehicle(Integer id, Vehicle updatedVehicle) {

        for (int i = 0; i < vehicleList.size(); i++) {

            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.set(i, updatedVehicle);
                return;
            }
        }
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public Integer getVehicleListSize(){
        return vehicleList.size();
    }

    public void showVehicleList() {
        for (Vehicle obj : this.vehicleList) {
            System.out.println(obj);
        }
    }

    public void showVehicleListOrderById() {
        List<Vehicle> listOrderById = getVehicleList();
        listOrderById.sort(
                Comparator.comparing(Vehicle::getId)
        );

        for (Vehicle obj : listOrderById) {
            System.out.println(obj);
        }

    }

}
