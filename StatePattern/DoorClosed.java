package StatePattern;

public class DoorClosed extends DoorState {
    public DoorClosed(Door2 door) {
        super(door);
    }

    @Override
    public void click() {
        door.setState(door.OPENING);
    }


}
