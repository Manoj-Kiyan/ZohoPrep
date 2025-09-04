package RailwayReservationSystem;

public class Passanger {
    String name;
    int age;
    String gender;
    String berthPreference;
    String allotedBerth;
    String ticketID;
   


    public Passanger(String name,int age,String gender,String berthPreference,String allotedBerth,String ticketID){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.berthPreference=berthPreference;
        this.allotedBerth=allotedBerth;
        this.ticketID=ticketID;
    }
    @Override
    public String toString(){
       return "TicketID: " + ticketID +
       ", Name: " + name +
       ", Age: " + age +
       ", Gender: " + gender +
       ", Berth: " + allotedBerth;

    }

}
