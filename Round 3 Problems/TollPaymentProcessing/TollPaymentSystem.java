//package TollPaymentProcessing;

import java.util.*;

public class TollPaymentSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Toll> tollPoints=new ArrayList<>();

        tollPoints.add(new Toll(0,Map.of("Bike",20,"Car",50,"Truck",100)));
        tollPoints.add(new Toll(1,Map.of("Bike",25,"Car",60,"Truck",130)));
        tollPoints.add(new Toll(2,Map.of("Bike",30,"Car",70,"Truck",150)));

        Highway highway=new Highway(tollPoints);

        while (true) {
            System.out.println("\nToll Payment Processing : ");
            System.out.println("1. Process Journey");
            System.out.println("2. Display Toll Details");
            System.out.println("3. Display Vehicle Details");
            System.out.println("4. Exit");
            System.out.println("5.Exit");
            System.out.println("Enter Your Choice : ");
            int choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                   System.out.println("Enter Your Vehicle Number : ");
                   String vehicleNumber=sc.nextLine();
                   System.out.println("Enter the Vehicle Type : ");
                   String vehicleType=sc.nextLine();
                   System.out.println("Are u VIP ? (true/false) : ");
                   boolean isVIP=sc.nextBoolean();
                   System.out.println("Enter Your Start Point : ");
                   int start=sc.nextInt();
                   System.out.println("Enter Your End Point : ");
                   int end=sc.nextInt();

                   int regularToll=highway.calculateRegulaToll(start,end,vehicleType,isVIP);
                   System.out.println("Total Toll Paid : " + regularToll);
                   
                   List<Integer> tollRoute=new ArrayList<>();
                   for (int i = start; i <= end; i++) {
                        tollRoute.add(i);
                   }
                   
                   highway.processJourney(vehicleNumber,vehicleType,isVIP,start,end,tollRoute);
                   break;

                case 2:
                   highway.displayTollDetails();
                   break;

                case 3:
                   highway.displayVehicleDetails();
                   break;
                case 4:
                   System.out.println("Enter Start and End  Point : ");
                   start=sc.nextInt();
                   end=sc.nextInt();
                   if(start > end){
                    int temp=start;
                    start=end;
                    end=temp;
                   }
                   List<Integer> tollCircularRoute=highway.findCircularRoute(start, end);
                   System.out.println("Shortest Path : "+tollCircularRoute);
                   System.out.println("Enter Vehicle Type(Bike/Car/Truck) :");
                   sc.nextLine();
                   vehicleType=sc.nextLine();
                   System.out.println("Are u VIP : ");
                   isVIP=sc.nextBoolean();
                   int totalCircularCost=highway.calculateRegularToll(tollCircularRoute,vehicleType, isVIP);
                   System.out.println("Toll Total Cost For Circular Route : "+totalCircularCost);
                   break;
                case 5:
                   System.out.println("Exiting. . .");
                   break;
                default:
                   System.out.println("Invalid Choice !");
                    
            }

            
        }
        
    }
}
