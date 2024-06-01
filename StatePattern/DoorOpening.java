package StatePattern;

public class DoorOpening extends DoorState {
    public DoorOpening(Door2 door) {
        super(door);
    }

    @Override
    public void complete() {
        door.setState(door.OPEN);
    }

    @Override
    public void click() {
        door.setState(door.CLOSING);
    }
}
