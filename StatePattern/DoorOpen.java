package StatePattern;

public class DoorOpen extends DoorState {
    public DoorOpen(Door2 door) {
        super(door);
    }

    @Override
    public void click() {
        door.setState(door.STAYOPEN);
    }

    @Override
    public void timeout() {
        door.setState(door.CLOSING);
    }
}
