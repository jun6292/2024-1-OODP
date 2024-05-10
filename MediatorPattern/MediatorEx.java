package MediatorPattern;

public class MediatorEx {
    public static void main(String[] args) {
        Button button = new Button();
        Fan fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();
        Mediator mediator = new Mediator(button, fan, powerSupplier);

        // 버튼을 누르면 중재자가 알림을 받고 다른 객체에 동작을 전달
        button.press(); // 전원이 켜지고 팬이 작동
        button.press(); // 전원이 꺼지고 팬이 정지
    }
}
