import java.util.*;
public class Flight{
    private String filghtName;
    private int availableSeats;
    private int ticketPrice;
    private Map<String,Passenger> bookings;
    private int bookingCounter;

    public Flight(String flightName){
        this.filghtName=flightName;
        this.availableSeats=50;
        this.ticketPrice=5000;
        this.bookings=new HashMap<>();
        this.bookingCounter=0;
    }

    public String bookTickets(String passengerName,int age,String gender,int seats){
        if(seats <= availableSeats){
            bookingCounter++;
            String bookingId="T"+bookingCounter;
            Passenger passenger=new Passenger(passengerName, bookingId, age, gender, seats);
            bookings.put(bookingId, passenger);
            availableSeats -=seats;
            ticketPrice +=200*seats;
            return bookingId;
        }else{
            System.out.println("Not Enough Seats are Available Now ...");
            return null;
        }
    }
    public boolean cancelBooking(String bookingId){
        Passenger passenger=bookings.get(bookingId);
        if(passenger!=null){
            int seats=passenger.getSeatBooked();
            availableSeats+=seats;
            ticketPrice -=200*seats;
            bookings.remove(bookingId);
            System.out.println("Succesfully Booking Canceled. . . Refund issued for "+ seats +" seats ");
            return true;
        }else{
            System.out.println("Cancellation Failed,Id Not Found. . .");
            return false;
        }

    }
    public void displayDetails(){
        System.out.println("Flight : "+filghtName);
        System.out.println("AvailableSeats : "+availableSeats);
        System.out.println("Current Ticket Price : "+ ticketPrice);

    }
    public void printDetails(){
        System.out.println("Flight : "+filghtName);
        System.out.println("AvailableSeats : "+availableSeats);
        System.out.println("Current Ticket Price : "+ ticketPrice);
        System.out.println("Passenger : ");
        for (Passenger passenger : bookings.values()) {
            System.out.println(passenger);
        }

    }

    
}