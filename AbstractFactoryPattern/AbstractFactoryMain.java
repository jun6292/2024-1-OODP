package AbstractFactoryPattern;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Vehicle hybridSedan = VehicleFactory.createInstance(
                CarBodyType.SEDAN, EnergyType.HYBRID
        );
        System.out.println(hybridSedan);
        hybridSedan.fillUp();
        hybridSedan.greetDriver();
        hybridSedan.drive();

        Vehicle gasSUV = VehicleFactory.createInstance(
                CarBodyType.SUV, EnergyType.GAS
        );
        System.out.println(gasSUV);
        gasSUV.fillUp();
        gasSUV.greetDriver();
        gasSUV.drive();

        Vehicle electricSedan = VehicleFactory.createInstance(
                CarBodyType.SEDAN, EnergyType.ELECTRIC
        );
        System.out.println(electricSedan);
        electricSedan.fillUp();
        electricSedan.greetDriver();
        electricSedan.drive();
    }
}
