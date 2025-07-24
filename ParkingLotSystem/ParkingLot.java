import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ParkingLot {
    private List<Slot> slots = new ArrayList<>();
    private Map<Integer, Ticket> activeTickets = new HashMap<>();
    private FeeCalculator calculator = new SimpleFeeCalculator();
    private int ticketCounter = 0;

    public void addSlot(Slot slot) { slots.add(slot); }

    public Ticket park(Vehicle vehicle) throws Exception {
        for (Slot s : slots) {
            if (!s.isOccupied() && s.getSupportedType() == vehicle.getType()) {
                s.setOccupied(true);
                Ticket t = new Ticket(++ticketCounter, vehicle, s);
                activeTickets.put(ticketCounter, t);
                return t;
            }
        }
        throw new Exception("No available slots");
    }

    public double unpark(int ticketId) throws Exception {
        Ticket t = activeTickets.get(ticketId);
        if (t == null) throw new Exception("Invalid ticket");
        LocalDateTime outTime = LocalDateTime.now();
        double fee = calculator.calculate(t.getInTime(), outTime);
        t.getSlot().setOccupied(false);
        activeTickets.remove(ticketId);
        return fee;
    }
}
