import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxiBookingSystem {
    static List<Taxi> taxis = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int customerCounter = 1;

    public static void main(String[] args) {
        System.out.print("Enter Number of Taxis: ");
        int numTaxis = sc.nextInt();
        initializeTaxis(numTaxis);

        while (true) {
            System.out.println("\n1. Book Taxi \n2. Display Booking \n3. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bookTaxi();
                    break;
                case 2:
                    displayTaxiDetails();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Entry, Try Again.");
            }
        }
    }

    static void initializeTaxis(int n) {
        for (int i = 1; i <= n; i++) {
            taxis.add(new Taxi(i));
        }
    }

    static void bookTaxi() {
        int customerID = customerCounter++;
        System.out.print("Enter the Pickup Point (A-Z): ");
        char pickup = sc.next().toUpperCase().charAt(0);
        System.out.print("Enter the Drop Point (A-Z): ");
        char drop = sc.next().toUpperCase().charAt(0);
        System.out.print("Pickup Time (in hours): ");
        int pickupTime = sc.nextInt();

        Taxi selectedTaxi = null;
        int minDistance = Integer.MAX_VALUE;

        for (Taxi taxi : taxis) {
            if (taxi.isAvailable(pickupTime)) {
                int distance = Math.abs(taxi.currentPoint - pickup);

                if (distance < minDistance || (distance == minDistance && taxi.totalEarnings < selectedTaxi.totalEarnings)) {
                    selectedTaxi = taxi;
                    minDistance = distance;
                }
            }
        }

        if (selectedTaxi == null) { // Fixed null comparison
            System.out.println("Booking Rejected, No Taxis Available Right Now.");
            return;
        }

        int dropTime = pickupTime + Math.abs(drop - pickup);
        int amount = selectedTaxi.calculateEarnings(pickup, drop);
        int bookingID = selectedTaxi.bookings.size() + 1;

        Booking booking = new Booking(bookingID, customerID, pickupTime, dropTime, amount, pickup, drop);
        selectedTaxi.addBooking(booking);
        System.out.println("Taxi " + selectedTaxi.id + " is allocated.");
    }

    public static void displayTaxiDetails() {
        for (Taxi taxi : taxis) {
            System.out.println("Taxi-" + taxi.id + " Total Earnings: Rs." + taxi.totalEarnings);
            System.out.printf("%-10s %-10s %-5s %-5s %-12s %-9s %-6s%n",
                    "BookingID", "CustomerID", "From", "To", "PickupTime", "DropTime", "Amount");
            for (Booking booking : taxi.bookings) {
                System.out.printf("%-10d %-10d %-5c %-5c %-12d %-9d %-6d%n",
                        booking.bookingID, booking.customerID, booking.from, booking.to,
                        booking.pickupTime, booking.dropTime, booking.amount);
            }
        }
    }
}
