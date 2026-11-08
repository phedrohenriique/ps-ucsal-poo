package app.services;

import java.util.Scanner;

// A interface com o usuário deve ser textual, apresentando menus com opções como: incluir,
// alterar, excluir, listar e sair.

public class UI {

    private VehicleService vehicleService;

    public UI(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void frontendUI() {

        System.out.println("SYSTEM IS READY");

        System.out.println("CHOOSE OPTIONS");

        Scanner sc1 = new Scanner(System.in);

        while (true) {

            System.out.println("""

                    1 - ADD VEHICLE
                    2 - UPDATE VEHICLE
                    3 - DELETE VEHICLE
                    4 - LIST VEHICLES BY ID
                    5 - EXIT

                    """);

            Integer option = sc1.nextInt();
            

            if (option == 4) {
                voidListVehiclesById();
            }

            if (option == 5) {
                break;
            }

        }

        sc1.close();

    }

    public void addVehicle() {

    }

    public void updateVehicle() {

    }

    public void deleteVehicle() {

    }

    public void voidListVehiclesById() {

        vehicleService.showVehicleListOrderById();

    }

}
