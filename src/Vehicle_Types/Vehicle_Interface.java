package Vehicle_Types;

public interface Vehicle_Interface {
    public Vehicle_Interface VehicleDetails(int NoOfPassengers,int kms, String... name);
    public int CostCalculator(double Distance);
    public int CostPerPerson();
    public String getMake();
    public void setMake(String make);
    public int getWheels();
    public void setWheels(int wheels);
    public int getNoOfPassengers();
    public void setNoOfPassengers(int noOfPassengers);
    public void PassengerList();
    public String toString();
}
