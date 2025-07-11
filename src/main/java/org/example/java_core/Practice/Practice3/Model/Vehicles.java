package org.example.java_core.Practice.Practice3.Model;

public class Vehicles {
    protected String number;
    protected String manufacturer;
    protected int yearOfManufacture;
    protected String color;
    protected VehicleOwners vehicleOwners;

    Vehicles(String number, String manufacturer, int yearOfManufacture,  String color, VehicleOwners vehicleOwners) {
        if (!Validator.isValidNumber(number)) {
            throw new IllegalArgumentException("Số xe phải có đúng 5 ký tự!");
        }
        if (!Validator.isValidManufacturer(manufacturer)) {
            throw new IllegalArgumentException("Hãng sản xuất chỉ bao gồm: Honda, Yamaha, Toyota, Suzuki");
        }
        if (!Validator.isValidYear(yearOfManufacture)) {
            throw new IllegalArgumentException("Năm sản xuất phải ≤ năm hiện tại và > 2000");
        }
        this.number = number;
        this.color = color;
        this.vehicleOwners = vehicleOwners;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getNumber() {
        return number;
    }

    public String getCMND() {
        return vehicleOwners.getCMND();
    }

    @Override
    public String toString() {
        return "Vehicle {" + "number=" + number + ", manufacturer=" + manufacturer + ", color=" + color + ", vehicleOwners=" + vehicleOwners + "}";
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
