import java.util.*;
public class FlightReservationSystem{

    Map<String,Flight> flights;

    public FlightReservationSystem(){
        this.flights=new HashMap<>();
        flights.put("indico", new Flight("Indico"));
        flights.put("deccan", new Flight("Deccan"));
    }

    public String bookTicket(String flightName,String passengerName,int age,String gender,int seats){
        Flight flight=flights.get(flightName);
        if(flight!=null){
            return flight.bookTickets(passengerName,age,gender,seats);
        }else{
            System.out.println("Flight Not Found . . .");
        }
        return null;
    }

    public boolean cancelTicket(String flightName,String bookingId){
        Flight flight=flights.get(flightName);
        if(flight!=null){
            return flight.cancelBooking(bookingId);
        }else{
            System.out.println("Flight Not Found . . .");
            return false;
        }
    }

    public void displayFlightDetails(String flightName){
        Flight flight=flights.get(flightName);
        if(flight!=null){
            flight.displayDetails();
        }else{
            System.out.println("Flight Not Found . . .");
        }
    }

    public void PrintFlightDetails(String flightName){
        Flight flight=flights.get(flightName);
        if(flight!=null){
           flight.printDetails();
        }else{
            System.out.println("Flight Not Found . . .");
        }
    }

    
}