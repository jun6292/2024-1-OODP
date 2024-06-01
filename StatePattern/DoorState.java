package StatePattern;

public abstract class DoorState {
    protected Door2 door;
    public DoorState(Door2 door) {
        this.door = door;
    }
    public abstract void click();
    public void complete() {}
    public String status() {
        String s = getClass().getName();
        return s.substring(s.lastIndexOf('.') + 1);
    }
    public void timeout() {}
}
