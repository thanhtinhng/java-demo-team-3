package org.example.java_core.Practice.Practice3;

import org.example.java_core.Practice.Practice3.Model.VehicleList;
import org.example.java_core.Practice.Practice3.Model.Vehicles;

public class TestPr3 {
    public static void main(String[] args) {
        VehicleList vehicleList = new VehicleList();
        vehicleList.addDemoList(null);

//        vehicleList.addVehicleFromInput();

        vehicleList.printVehiclesList();

        System.out.print("\n");

        System.out.println(vehicleList.findVehicleByNumber("E5678"));
        System.out.println(vehicleList.findVehicleByNumber("99999"));

        System.out.print("\n");

        for (Vehicles vehicles : vehicleList.findVehicleByCMND("123456789012")) {
            System.out.println(vehicles);
        }
        System.out.print("\n");

        System.out.println(vehicleList.findVehicleByCMND("999999999999"));

        System.out.print("\n");

        vehicleList.removeVehicleByManuf("Honda");
        vehicleList.removeVehicleByManuf("ABC");

        System.out.print("\n");

        vehicleList.printVehiclesList();

        System.out.println("\n");

        System.out.println(vehicleList.findMaxManufacturer());

        System.out.println("\n");

        vehicleList.sortByDescending();

        System.out.println("\n");

        vehicleList.countVehiclesByType();
    }
}
