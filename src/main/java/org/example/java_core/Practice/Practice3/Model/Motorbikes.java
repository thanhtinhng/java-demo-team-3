package org.example.java_core.Practice.Practice3.Model;

public class Motorbikes extends Vehicles {
    private float capacity;

    Motorbikes(String number, String manufacturer, int yearOfManufacture, String color, VehicleOwners vehicleOwners,  float capacity) {
        super(number, manufacturer, yearOfManufacture, color, vehicleOwners);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike {" + "number=" + number + ", manufacturer=" + manufacturer + ", color=" + color + ", vehicleOwners=" + vehicleOwners + ", capacity=" + capacity + '}';
    }
}
