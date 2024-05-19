package FactoryMethodPattern;

public class MotorFactory {
    public static Motor createMotor(MotorVendor vendorID) {
        Motor motor;
        switch (vendorID) {
            case LG:
                motor = new LGMotor();
                break;
            case HYUNDAI:
                motor = new HyundaiMotor();
                break;
            default:
                throw new IllegalArgumentException("Vendor not supported.");
        }
        return motor;
    }
}
