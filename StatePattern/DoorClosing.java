package StatePattern;

public class DoorClosing extends DoorState {
    public DoorClosing(Door2 door) {
        super(door);
    }

    @Override
    public void complete() {
        door.setState(door.CLOSED);
    }

    @Override
    public void click() {
        door.setState(door.OPENING);
    }
}
