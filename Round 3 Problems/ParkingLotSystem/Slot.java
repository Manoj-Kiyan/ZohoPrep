public class Slot {
    private int slotId;
    private boolean isOccupied;
    private VehicleType supportedType;

    public Slot(int id, VehicleType type) {
        this.slotId = id;
        this.supportedType = type;
        this.isOccupied = false; // default
    }

    // ✅ Getter for Slot ID
    public int getSlotId() {
        return slotId;
    }

    // ✅ Getter and Setter for Occupied
    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    // ✅ Getter for Supported Vehicle Type
    public VehicleType getSupportedType() {
        return supportedType;
    }
}
