package AbstractFactoryPattern;

public abstract class VehicleFactory {
    public static Vehicle createInstance(CarBodyType bodyType, EnergyType energyType) {
        VehicleFactory factory = null;
        switch (bodyType) {
            case SEDAN:
                factory = new SedanFactory();
                break;
            case SUV:
                factory = new SUVFactory();
                break;
        }
        return factory.createVehicle(energyType);
    }

    protected abstract Vehicle createVehicle(EnergyType energyType);
}
