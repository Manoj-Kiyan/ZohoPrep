//package TollPaymentProcessing;
import java.util.*;
class Highway {

    List<Toll> tollPoints;

    Map<String,Vehicle> vehicleRecord; 
    
    public Highway(List<Toll> tollPoints){
        this.tollPoints=tollPoints;
        this.vehicleRecord=new HashMap<>();
    }
    
    public void processJourney(String vehicleNumber,String vehicleType,boolean isVIP,int start,int end,List<Integer> tollRoute){
        Vehicle vehicle=vehicleRecord.computeIfAbsent(vehicleNumber,vn -> new Vehicle(vehicleNumber, vehicleType, isVIP));
        int totalAmount=0;

        for (Journey j : vehicle.journeys) {
             if (j.startPoint == start && j.endPoint == end && j.tollPassed.equals(tollRoute)) {
                System.out.println("Journey already recorded. No toll charged again.");
                return;
            }
    }

        for (int tollId : tollRoute) {
            Toll toll=tollPoints.get(tollId); 
            int charge=toll.calculateToll(vehicleType, isVIP); 
            toll.recordVehicle(vehicle, charge);
            totalAmount+=charge;
        }

        Journey journey=new Journey(start, end, tollRoute, totalAmount);
        vehicle.addJourney(journey);

        System.out.println("Journey Completed Total toll Paid :"+totalAmount);
    }
    public void displayTollDetails(){
        for(Toll toll:tollPoints){
            toll.displayDetails();
        }
    }

    public void displayVehicleDetails(){
        for(Vehicle vehicle:vehicleRecord.values()){
            vehicle.displayDetails();
        }
    }

    public List<Integer> findCircularRoute(int start,int end){
        List<Integer> forwardRoute=new ArrayList<>();
        List<Integer> backwardRoute=new ArrayList<>();
        int totalTolls=tollPoints.size();

        for (int i = start; i != end;i =(i+1)%totalTolls) {
               forwardRoute.add(i);             
        }
        forwardRoute.add(end);

        for (int i = start; i != end; i=(i-1+totalTolls)%totalTolls){
            backwardRoute.add(i);
        }
        backwardRoute.add(end);

        return forwardRoute.size()<=backwardRoute.size()?forwardRoute:backwardRoute;
    }

    public int calculateRegulaToll(int start, int end, String vehicleType, boolean isVIP) {
        int totalCost=0;
        if(start <= end){
            for (int i = start; i <= end; i++) {
                Toll toll=tollPoints.get(i);
                totalCost+=toll.calculateToll(vehicleType, isVIP);                
            }
        }else{
            for (int i = start; i < tollPoints.size(); i++) {
                Toll toll=tollPoints.get(i);
                totalCost+=toll.calculateToll(vehicleType, isVIP);
            }
            for (int i = 0; i <= end; i++) {
                Toll toll =tollPoints.get(i);
                totalCost+=toll.calculateToll(vehicleType, isVIP);
            }
        }
        return totalCost;
    }

    int calculateRegularToll(List<Integer> tollRoute, String vehicleType, boolean isVIP) {
        int totalCost=0;
        for (int tollId : tollRoute) {
            Toll toll=tollPoints.get(tollId);
            totalCost+=toll.calculateToll(vehicleType, isVIP);
        }
        return totalCost;
    }

}
