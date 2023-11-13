package org.example;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<String> inventory = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void getAllVehicles(){
        for (String item : inventory){
            System.out.println(item);
        }
    }
    public void getVehiclesByPrice(double minPrice, double maxPrice){
        for (String item : inventory){
            Vehicle vehicle = Vehicle.fromString(item);
            if (vehicle != null && vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                System.out.println(vehicle);
            }
        }
    }
    public void getVehiclesByMakeAndModel(String make, String model) {
        for (String item : inventory) {
            Vehicle vehicle = Vehicle.fromString(item);
            if (vehicle != null && vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                System.out.println(vehicle);
            }
        }
    }
    public void getVehiclesByYear(int minYear, int maxYear) {
        for (String item : inventory) {
            Vehicle vehicle = Vehicle.fromString(item);
            if (vehicle != null && vehicle.getYear() >= minYear && vehicle.getYear() <= maxYear) {
                System.out.println(vehicle);
            }
        }
    }
    public void getVehiclesByColor(String color) {
        for (String item : inventory) {
            Vehicle vehicle = Vehicle.fromString(item);
            if (vehicle != null && vehicle.getColor().equalsIgnoreCase(color)) {
                System.out.println(vehicle);
            }
        }
    }
    public void getVehiclesByType(String type) {
        for (String item : inventory) {
            Vehicle vehicle = Vehicle.fromString(item); // Assuming you have a static method in the Vehicle class to create a Vehicle instance from a string
            if (vehicle != null && vehicle.getVehicleType().equalsIgnoreCase(type)) {
                System.out.println(vehicle);
            }
        }
    }
    public void getVehiclesByMileageRange(int minMileage, int maxMileage) {
        for (String item : inventory) {
            Vehicle vehicle = Vehicle.fromString(item);
            if (vehicle != null && vehicle.getOdometer() >= minMileage && vehicle.getOdometer() <= maxMileage) {
                System.out.println(vehicle);
            }
        }
    }
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle.toString());
    }
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle.toString());
    }
}
