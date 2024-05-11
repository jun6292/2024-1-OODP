package ObserverPattern;

public class DigitalObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("ObserverPattern.DigitalObserver: " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
