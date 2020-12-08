package Vehicle_Types;

import java.util.Arrays;

public class Auto implements Vehicle_Interface {
    private String make = String.valueOf(EnumVehicles.Auto);
    private int wheels = 3;
    private int noOfPassengers;
    private double cost = 19.7;
    private String[] names;
    private int kms;

    public Vehicle_Interface VehicleDetails(int NoOfPassengers, int kms, String... name) {
        this.noOfPassengers = NoOfPassengers;
        this.names = name;
        this.kms = kms;
        return this;
    }

    @Override
    public int CostCalculator(double Distance) {
        return (int) (Distance * cost);
    }

    @Override
    public int CostPerPerson() {
        return (CostCalculator(kms)/this.noOfPassengers);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    @Override
    public void PassengerList() {
        for (String passenger:this.names) {
            System.out.println(passenger);
        }
    }

    @Override
    public String toString() {
        return "Auto - " +
                "make='" + make + '\'' +
                ", wheels=" + wheels +
                ", noOfPassengers=" + noOfPassengers +
                ", cost per KM=" + cost +
                "Rs, names=" + Arrays.toString(names) + ", Distance=" + this.kms + ", Cost=" + (this.kms*this.cost)+
                "Rs, Cost per Person=" + CostPerPerson() + "Rs";
    }
}
