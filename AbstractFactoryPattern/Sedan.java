package AbstractFactoryPattern;

public class Sedan implements Vehicle {
    private EnergyType energyType;

    public Sedan(EnergyType energyType) {
        this.energyType = energyType;
    }

    @Override
    public void fillUp() {
        System.out.println("your " + energyType.toString().toLowerCase() + " sedan is fueling or charging...");
    }

    @Override
    public void greetDriver() {
        System.out.println("Greeting from your " + energyType.toString().toLowerCase() + " sedan");
    }

    @Override
    public void drive() {
        System.out.println("Driving a " + energyType.toString().toLowerCase() + " sedan");
    }

    @Override
    public String toString() {
        return "EnergyType=" + energyType + ", CarBodyType=SEDAN";
    }
}
