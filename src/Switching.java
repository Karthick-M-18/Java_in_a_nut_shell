import Vehicle_Types.*;

public class Switching {
    public static Vehicle_Interface switching(int number){
        Vehicle_Interface new_vehicle = null;
        switch (number){
            case 0:
                new_vehicle = new Truck();
                break;
            case 1:
                new_vehicle = new Cycle();
                break;
            case 2:
                new_vehicle = new Bike();
                break;
            case 3:
                new_vehicle = new Auto();
                break;
            case 4:
                new_vehicle = new Car();
                break;
            default:
                new_vehicle = new Bus();
                break;
        }
        return new_vehicle;
    }
}
