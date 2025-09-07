
import java.util.*;
//package TollPaymentProcessing;

class Toll {
    int tollId;
    Map<String,Integer> chargesPerVehicle;
    List<vehiclePayment> vehiclePassed;
    int totalRevenue;

    public Toll(int tollId,Map<String,Integer> chargesPerVehicle){
        this.tollId=tollId;
        this.chargesPerVehicle=chargesPerVehicle;
        this.vehiclePassed=new ArrayList<>();
        this.totalRevenue=0;
    }

    public int calculateToll(String vehicleType,boolean isVIP){
        int charge=chargesPerVehicle.getOrDefault(vehicleType, 0);
        if(isVIP){
            charge=charge-(charge/5);
        }
        return charge;
    }

    public void recordVehicle(Vehicle vehicle,int charge){
        vehiclePassed.add(new vehiclePayment(vehicle.vehicleNumber,charge));
        totalRevenue+=charge;
    }

    public void displayDetails(){
        System.out.println("Toll ID : "+tollId);
        System.out.println("Vehicle Passed :");
        for(vehiclePayment vp:vehiclePassed){
            System.out.println("Vehicle : "+vp.vehicleNumber+" Paid : "+vp.amountPaid );
        }
        System.out.println("Total Revenue : "+totalRevenue);
    }
}
