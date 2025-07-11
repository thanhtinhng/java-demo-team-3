package org.example.java_core.Practice.Practice3;

import org.example.java_core.Practice.Practice3.Model.VehicleList;

public class TestPr3 {
    public static void main(String[] args) {
        VehicleList vehicleList = new VehicleList();
        vehicleList.addDemoList(null);

//        vehicleList.addVehicleFromInput();

        vehicleList.printVehiclesList();

        vehicleList.findVehicleByNumber("E5678");
        vehicleList.findVehicleByNumber("99999");

        vehicleList.findVehicleByCMND("123456789012");
        vehicleList.findVehicleByCMND("999999999999");

        vehicleList.removeVehicleByManuf("Honda");
        vehicleList.removeVehicleByManuf("ABC");

        vehicleList.printVehiclesList();

    }
}
