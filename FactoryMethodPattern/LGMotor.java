package FactoryMethodPattern;

public class LGMotor extends Motor {
    protected void moveMotor(Direction direction) {
        System.out.println("move LG FactoryMethodPattern.Motor " + direction);
    }
}
