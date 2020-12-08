package Vehicle_Types;

public class Vehicle {
    private String make;
    private int wheels;
    private int noOfPassengers;

    public void VehicleDetails(String Make, int Wheels, int NoOfPassengers) {
        this.make = Make;
        this.wheels = Wheels;
        this.noOfPassengers = NoOfPassengers;
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

    public void BookingDetails() {
        System.out.println("Booked");
    }
}
