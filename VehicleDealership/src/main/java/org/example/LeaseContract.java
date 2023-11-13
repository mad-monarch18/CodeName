package org.example;

public class LeaseContract extends Contract {
    public LeaseContract(String date, String customerName, String email, String vehicleSold, double totalPrice) {
        super(date, customerName, email, vehicleSold, totalPrice);
    }

    public double expectedEndingValue(){
        return getVehicleSold().getPrice() * .50;
    }
    public double leasingFee(){
        return getVehicleSold().getPrice() * .07;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }

    @Override
    public double getTotalPrice() {
        return getMonthlyPayment() * 36 + leasingFee();
    }
}
