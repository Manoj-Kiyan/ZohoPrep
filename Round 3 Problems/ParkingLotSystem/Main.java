
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ParkingLot lot = new ParkingLot();

        // Add Slots (for demo)
        //lot.addSlot(new Slot(1, VehicleType.BIKE));
        //lot.addSlot(new Slot(2, VehicleType.CAR));

        while (true) {
            System.out.println("\n1. Park\n2. Unpark\n3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle type (BIKE/CAR): ");
                    String typeInput = sc.nextLine().toUpperCase();
                    VehicleType vt;
                    try {
                        vt = VehicleType.valueOf(typeInput);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid vehicle type");
                        break;
                    }

                    System.out.print("Enter number plate: ");
                    String numberPlate = sc.nextLine();
                    Vehicle v;

                    if (vt == VehicleType.BIKE) v = new Bike(numberPlate);
                    else if (vt == VehicleType.CAR) v = new Car(numberPlate);
                    else {
                        System.out.println("Not supported yet");
                        break;
                    }

                    try {
                        Ticket t = lot.park(v);
                        System.out.println(vt + " parked with ticket ID: " + t.getTicketId());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter ticket ID to unpark: ");
                    int ticketId = sc.nextInt();
                    try {
                        double fee = lot.unpark(ticketId);
                        System.out.println("Unparked. Fee: Rs." + fee);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
    // --- Concrete Vehicle Types ---
        class Bike extends Vehicle {
            public Bike(String numberPlate) {
                super(numberPlate);
            }

            public VehicleType getType() {
                return VehicleType.BIKE;
            }
        }

        class Car extends Vehicle {
            public Car(String numberPlate) {
                super(numberPlate);
            }

            public VehicleType getType() {
                return VehicleType.CAR;
            }
        }

