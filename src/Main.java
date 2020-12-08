import Vehicle_Types.Vehicle_Interface;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Tyrion Transports.. \n");
        ArrayList< Vehicle_Interface > total = new ArrayList<>();
        Boolean a = true;
        int kms = 150;


        try{
            while (a) {
                System.out.println("please enter the number of passengers onboarding\n");
                var number = Integer.parseInt(Scan.scan());
                if (number <= 60 && number >= 0){
                    ArrayList<String> name_first = new ArrayList<>();
                    for (int i = 0; i < number; i++){
                        String nom = Scan.scan();
                        if (nom.length() != 0){
                        name_first.add(nom);}
                        else{
                            break;
                            }}
                        String[] ar_name=name_first.toArray(new String[name_first.size()]);
                        total.add(inputs(number,name_first.size(),ar_name));}
                else{System.out.println("Sorry! No Space, try again with lesser number of passengers");}}}



        catch (NumberFormatException e){
            a = false;
            System.out.println("End of loop");}


        //Print the values

        outputs(total);

        //Clear the History
        if (total.size() != 0){
        total.removeAll(total);
        System.out.println("History Cleared");

        //print the values

        outputs(total);
    }

    }
    private static Vehicle_Interface inputs(int number,int pass_number, String... names){

        var new_vehicle = Switching.switching(number);
        return new_vehicle.VehicleDetails(pass_number, 150, names);
    }
    private static void outputs(ArrayList total){
        if (total.size()== 0){
            System.out.println("No History");
        }
        else{
        for (Object single:total) {
            System.out.println(single);
        }}
    }}

