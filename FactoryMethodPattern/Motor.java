package FactoryMethodPattern;

public abstract class Motor {
    private MotorStatus motorStatus;
    public Motor() {
        motorStatus = MotorStatus.STOPPED;
    }
    public MotorStatus getMotorStatus() {
        return motorStatus;
    }
    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    protected abstract void moveMotor(Direction direction);

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING)
            return;
        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    public void stop() {
        setMotorStatus(MotorStatus.STOPPED);
    }
}
