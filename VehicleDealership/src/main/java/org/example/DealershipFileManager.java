package org.example;
import java.io.*;
import java.util.Scanner;
public class DealershipFileManager {
    public Dealership getDealership() {

        Dealership dealership = null;
        try {
            FileInputStream fis = new FileInputStream("main/resources/Inventory.csv");
            Scanner scanner = new Scanner(fis);

            String dealershipInfo = scanner.nextLine();
            String[] dealershipData = dealershipInfo.split("\\|");
            String name = dealershipData[0];
            String address = dealershipData[1];
            String phone = dealershipData[2];
            dealership = new Dealership(name, address, phone);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] vehicleData = line.split("\\|");
                int vin = Integer.parseInt(vehicleData[0]);
                int year = Integer.parseInt(vehicleData[1]);
                String make = vehicleData[2];
                String model = vehicleData[3];
                String vehicleType = vehicleData[4];
                String color = vehicleData[5];
                int odometer = Integer.parseInt(vehicleData[6]);
                double price = Double.parseDouble(vehicleData[7]);
                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                dealership.addVehicle(vehicle);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return dealership;
    }

}