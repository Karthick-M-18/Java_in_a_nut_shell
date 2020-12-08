package Vehicle_Types;

public class Truck implements Vehicle_Interface {
    private String make = String.valueOf(EnumVehicles.Truck);
    private int wheels = 16;
    private int noOfPassengers;
    private double cost = 40.7;
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
        return CostCalculator(kms);
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
        return "Truck - " +
                "make='" + make + '\'' +
                ", wheels=" + wheels +
                ", noOfPassengers=" + noOfPassengers +
                ", cost per KM=" + cost + "Rs, Distance=" + this.kms + ", Cost=" + (this.kms*this.cost) + "Rs";
    }
}
