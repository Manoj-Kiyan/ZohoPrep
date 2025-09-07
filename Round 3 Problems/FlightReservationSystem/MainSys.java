
import java.util.Scanner;

public class MainSys{
    public static void main(String[]args){
        FlightReservationSystem frs=new FlightReservationSystem();
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("\nFlight Reservation System");
            System.out.println("1.Book Tickets"); 
            System.out.println("2.Cancel Tickets");
            System.out.println("3.Print Flight Details");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice");
            int choice=sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Flight Name (Indico/Deccan) : ");
                    String flightName = sc.nextLine().trim().toLowerCase();

                    if(frs.flights.containsKey(flightName)){
                        frs.displayFlightDetails(flightName);
                        System.out.println("Enter Passenger Name : ");
                        String passengerName=sc.nextLine();
                        System.out.println("Enter Passenger Age : ");
                        int age=sc.nextInt();
                        System.out.println("Enter Passenger Gender : ");
                        String gender=sc.nextLine();
                        System.out.println("No.of Seats Book : ");
                        int seats=sc.nextInt();
                        String bookingID=frs.bookTicket(flightName, passengerName, age, gender, seats);
                        if(bookingID!=null){
                            System.out.println("Booking Succesfull,Your Booking ID is : "+bookingID);

                        }
                    }   
                    break;
                case 2:
                    System.out.println("Enter Flight Name (Indico/Deccan) : ");
                    flightName=sc.nextLine();
                    System.out.println("Booking ID : ");
                    String bookingId=sc.nextLine();
                    frs.cancelTicket(flightName, bookingId);
                    break;
                case 3:
                    System.out.println("Enter Flight Name (Indico/Deccan) : ");
                    flightName=sc.nextLine();
                    System.out.println("FlightName : "+flightName);
                    frs.PrintFlightDetails(flightName);                    
                    break;
                case 4:
                    System.out.println("Exiting. . .");
                    sc.close(); 
                    break;
            }
              
        }
    }
        
    }
