//package TollPaymentProcessing;
import java.util.*;
class Vehicle {

    String vehicleNumber;
    String vehicleType;
    boolean isVIP;
    List<Journey> journeys;

    public Vehicle(String vehicleNumber,String vehicleType,boolean isVIP){
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
        this.isVIP=isVIP;
        this.journeys=new ArrayList<>();
    }
    
    public void addJourney(Journey journey){
        journeys.add(journey);
    }

    public void displayDetails(){
        System.out.println("Vehicle Details : "+vehicleNumber);
        System.out.println("Type : "+vehicleType+"VIP : "+isVIP);
        for(Journey journey:journeys){
            System.out.println("Journeys : "+journey.startPoint + "->"+journey.endPoint);
            System.out.println("Tolls Passed : "+journey.tollPassed);
            System.out.println("Amount Paid : "+journey.amountPaid);
        }
        int totalpaid=0;
        for(Journey j:journeys){
            totalpaid +=j.amountPaid;
        }
        System.out.println("Total Amount Paid : "+ totalpaid);
    }
}
