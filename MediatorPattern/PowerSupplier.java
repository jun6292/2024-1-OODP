package MediatorPattern;

public class PowerSupplier extends Component {
    private boolean powerOn = false;

    public boolean isPowerOn() {
        return powerOn;
    }

    public void turnOn() {
        powerOn = true;
        System.out.println("Power supply is ON.");
    }

    public void turnOff() {
        powerOn = false;
        System.out.println("Power supply is OFF.");
    }
}
