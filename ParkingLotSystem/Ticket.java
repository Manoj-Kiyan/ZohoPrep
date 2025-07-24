import java.time.LocalDateTime;

public class Ticket {
    private int ticketId;
    private Vehicle vehicle;
    private Slot slot;
    private LocalDateTime inTime;

    public Ticket(int id, Vehicle v, Slot s) {
        this.ticketId = id;
        this.vehicle = v;
        this.slot = s;
        this.inTime = LocalDateTime.now(); // entry time
    }

    // ✅ Getters
    public int getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Slot getSlot() {
        return slot;
    }

    public LocalDateTime getInTime() {
        return inTime;
    }
}
