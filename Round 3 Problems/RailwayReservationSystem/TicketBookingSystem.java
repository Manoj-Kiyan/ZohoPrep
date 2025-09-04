package RailwayReservationSystem;

import java.util.*;
public class TicketBookingSystem {
    public static void main(String[] args) {
        Booking ticketBooking=new Booking();
        Scanner sc=new Scanner(System.in);


        while (true) { 
            System.out.println("\n RAILWAY TICKET BOOKING SYSTEM ");
            System.out.println("1.Book Ticket");
            System.out.println("2.Cancel Ticket");
            System.out.println("3.View Confirm Tickets");
            System.out.println("4.View Available Ticket");
            System.out.println("5.View RAC Tickets");
            System.out.println("6.View Waiting Tickets");
            System.out.println("7.Exit");
            System.out.println("Enter Your Choice : ");
            int Choice=sc.nextInt();
            sc.nextLine();

            switch (Choice) {
                case 1:
                    System.out.println("Enter Name : ");
                    String name=sc.nextLine();
                    System.out.println("Enter Age : ");
                    int age=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Gender (Male/Female) : ");
                    String gender=sc.nextLine();
                    System.out.println("Enter Berth Preference(L/U/M) : ");
                    String berthPreference=sc.nextLine();
                    ticketBooking.bookTicket(name, age, gender, berthPreference);
                    break;

                 case 2:
                    System.out.println("Enter Ticker ID to Cancel: ");
                    String ticketID=sc.nextLine();
                    ticketBooking.cancelTicket(ticketID); 
                    break;
                 case 3:
                    ticketBooking.printBookedTicket();
                    break;
                 case 4:
                    ticketBooking.printAvailableTicket();
                    break;
                 case 5:
                    ticketBooking.viewRacTicket();
                    break;
                 case 6:
                    ticketBooking.viewWaitTicket();
                    break;
                 case 7:
                    System.out.println("Exiting. . . ");
                    break;
                default:
                    System.out.println("Invalid Choice,Try Again !. . .");
            }
        }
    }
}
