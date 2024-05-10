package MediatorPattern;

public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public Mediator(Button button, Fan fan, PowerSupplier powerSupplier) {
        this.button = button;
        this.fan = fan;
        this.powerSupplier = powerSupplier;

        // 각 구성 요소에 중재자 설정
        this.button.setMediator(this);
        this.fan.setMediator(this);
        this.powerSupplier.setMediator(this);
    }

    public void notify(Component sender, String event) {
        if (sender == button && "button_pressed".equals(event)) {
            if (powerSupplier.isPowerOn()) {
                System.out.println("Powering off and stopping fan.");
                powerSupplier.turnOff();
                fan.turnOff();
            } else {
                System.out.println("Powering on and starting fan.");
                powerSupplier.turnOn();
                fan.turnOn();
            }
        }
    }
}
