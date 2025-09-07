public class Passenger{
    private String name;
    private String  bookingId;
    private int age;
    private String gender;
    private int seatBooked;


    public Passenger(String name,String  bookingId,int age,String gender,int seatBooked){
        this.name=name;
        this.bookingId=bookingId;
        this.age=age;
        this.gender=gender;
        this.seatBooked=seatBooked;
    }

    @Override
    public String toString(){
        return "Passenger{"
        +"bookingID : "+bookingId
        +" Name : "+name
        +" Age : "+age
        +" Gender :"+gender
        +" SeatsBooked : "+seatBooked +"}";
    }

    public int getSeatBooked(){
        return seatBooked;
    }
}