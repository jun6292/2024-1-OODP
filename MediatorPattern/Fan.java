package MediatorPattern;

public class Fan extends Component {
    public void turnOn() {
        System.out.println("MediatorPattern.Fan is turning on.");
    }

    public void turnOff() {
        System.out.println("MediatorPattern.Fan is turning off.");
    }
}
