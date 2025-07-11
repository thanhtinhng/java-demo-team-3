package org.example.java_core.Practice.Practice3.Model;

public class Trucks extends Vehicles {
    private float tonnage;

    Trucks(String number, String manufacturer, int yearOfManufacture, String color, VehicleOwners vehicleOwners,  float tonnage) {
        super(number, manufacturer, yearOfManufacture, color, vehicleOwners);
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck {" + "number=" + number + ", manufacturer=" + manufacturer + ", color=" + color + ", vehicleOwners=" + vehicleOwners + ", tonnage=" + tonnage + '}';
    }
}
