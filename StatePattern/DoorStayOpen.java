package StatePattern;

public class DoorStayOpen extends DoorState {
    public DoorStayOpen(Door2 door) {
        super(door);
    }

    @Override
    public void click() {
        door.setState(door.CLOSING);
    }
}