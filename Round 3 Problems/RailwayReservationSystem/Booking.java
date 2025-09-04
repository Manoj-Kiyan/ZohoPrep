package RailwayReservationSystem;

import java.util.*;

public class Booking {
    private  final List<String> availableBerth=new ArrayList<>(Arrays.asList("L","U","M"));
    private final List<Passanger> confirmPassanger=new ArrayList<>();
    private final Queue<Passanger> racQueue=new LinkedList<>();
    private final Queue<Passanger> waitingQueue=new LinkedList<>(); 
    private final int RAC_CAPACITY = 1;
    private final int WAIT_CAPACITY = 1;

    private int ticketCounter=1;

    public void bookTicket(String name,int age,String gender,String berthPreference){
        String ticketId="T"+ticketCounter++;
        Passanger passanger;

        if(!availableBerth.isEmpty()){
            String allotedBerth=allocateBerth(age,gender,berthPreference);
            passanger=new Passanger(name, age, gender, berthPreference, allotedBerth, ticketId);
            confirmPassanger.add(passanger);
            availableBerth.remove(allotedBerth);
            System.out.println("Ticket Confirmed ✅ : " + passanger);
        }else if(racQueue.size() < 1){
            passanger=new Passanger(name, age, gender, berthPreference, "RAC", ticketId);
            racQueue.offer(passanger);
            System.out.println("Ticket in RAC : " + passanger);
        }else if(waitingQueue.size() < 1){
            passanger=new Passanger(name, age, gender, berthPreference, "Waiting", ticketId);
            waitingQueue.offer(passanger);
            System.out.println("Ticket in Waiting : " + passanger);
        }else{
            System.out.println("Sorry!,No tickets available for now . . .");
        }
    }

    public String allocateBerth(int age,String gender,String preference){
        if(age > 60 || gender.equalsIgnoreCase("Female") && availableBerth.contains("L")){
            return "L";
        }else if(availableBerth.contains(preference)){
            return preference;
        }else{
            return availableBerth.get(0);
        }
    }

    public void cancelTicket(String ticketID){
        Optional <Passanger> passangerOpt=confirmPassanger.stream().filter(P ->P.ticketID.equals(ticketID)).findFirst();
        if(passangerOpt.isPresent()){
            Passanger passanger=passangerOpt.get();
            confirmPassanger.remove(passanger);
            availableBerth.add(passanger.allotedBerth);

            if(!racQueue.isEmpty()){
                Passanger racPassanger=racQueue.poll();
                String allocatedBerth=allocateBerth(racPassanger.age,racPassanger.gender,racPassanger.berthPreference);
                racPassanger.allotedBerth=allocatedBerth;
                availableBerth.remove(allocatedBerth);
                System.out.println("RAC ticket moved to Confirmed : "+racPassanger);
            }if(!waitingQueue.isEmpty()){
                Passanger waitQ=waitingQueue.poll();
                racQueue.offer(waitQ);
                waitQ.allotedBerth="RAC";
                System.out.println("WaitingList ticket moved to RAC : "+waitQ);
            }
            System.out.println("Ticket Cancelled Succesgully : " + ticketID);
        }else{
            System.out.println("No Ticket Found at Ceratain Ticket ID");
        }
    }

    public void printBookedTicket(){
        if(confirmPassanger.isEmpty()){
            System.out.println("No Ticket at Confirmation");
        }else{
            System.out.println("CONFIRM TICKETS");
            for (Passanger passanger: confirmPassanger) {
                System.out.println(passanger);                
            }
        }
    }

    public void printAvailableTicket(){
        

        System.out.println("Available Berths : " + availableBerth.size());
        System.out.println("Available RAC Tickets " +(RAC_CAPACITY-racQueue.size()));
        System.out.println("Available Waiting Tickets " +(WAIT_CAPACITY-waitingQueue.size()));
    }

    public void viewRacTicket(){
        if(!racQueue.isEmpty()){
            System.out.println("RAC TICKETS");
            for (Passanger passanger :racQueue) {
                System.out.println(passanger);     
            }
        }else{
            System.out.println("No RAC Ticket Available . . .");
        }
    }

     public void viewWaitTicket(){
        if(!waitingQueue.isEmpty()){
            System.out.println("WAITING TICKETS");
            for (Passanger passanger :waitingQueue) {
                System.out.println(passanger);     
            }
        }else{
            System.out.println("No Waiting Ticket Available . . .");
        }
    }
}
