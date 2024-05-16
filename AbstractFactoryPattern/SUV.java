package AbstractFactoryPattern;

public class SUV implements Vehicle {
    private EnergyType energyType;

    public SUV(EnergyType energyType) {
        this.energyType = energyType;
    }

    @Override
    public void fillUp() {
        System.out.println("your " + energyType.toString().toLowerCase() + " SUV is fueling or charging...");
    }

    @Override
    public void greetDriver() {
        System.out.println("Greeting from your " + energyType.toString().toLowerCase() + " SUV");
    }

    @Override
    public void drive() {
        System.out.println("Driving a " + energyType.toString().toLowerCase() + " SUV");
    }

    @Override
    public String toString() {
        return "EnergyType=" + energyType + ", CarBodyType=SUV";
    }
}
