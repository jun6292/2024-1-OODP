package FactoryMethodPattern;

public class HyundaiMotor extends Motor {
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyundai FactoryMethodPattern.Motor " + direction);
    }
}
