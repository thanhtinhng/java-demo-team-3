package org.example.java_core.Practice.Practice3.Model;

public class Cars extends Vehicles{
    private int numberOfSeats;
    private String engineType;


    Cars(String number, String manufacturer, int yearOfManufacture, String color, VehicleOwners vehicleOwners, int numberOfSeats, String engineType) {
        super(number, manufacturer, yearOfManufacture, color, vehicleOwners);
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car {" + "number=" + number + ", manufacturer=" + manufacturer + ", color=" + color + ", vehicleOwners=" + vehicleOwners + ", numberOfSeats=" + numberOfSeats + ", engineType=" + engineType + '}';
    }
}
