public class Booking {
    int bookingID, customerID, pickupTime, dropTime, amount; // Fixed variable names
    char from, to; // Fixed variable names

    public Booking(int bookingID, int customerID, int pickupTime, int dropTime, int amount, char from, char to) {
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.amount = amount;
        this.from = from;
        this.to = to;
    }
}
