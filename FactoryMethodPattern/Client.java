package FactoryMethodPattern;

public class Client {
    public static void main(String[] args) {
        MotorFactory motorFactory = new MotorFactory();

        ElevatorController elevatorController1 = new ElevatorController(1, motorFactory.createMotor(MotorVendor.LG));
        elevatorController1.gotoFloor(5);
        elevatorController1.gotoFloor(3);

        ElevatorController elevatorController2 = new ElevatorController(2, motorFactory.createMotor(MotorVendor.HYUNDAI));
        elevatorController2.gotoFloor(4);
        elevatorController2.gotoFloor(6);
    }
}
