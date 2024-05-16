package AbstractFactoryPattern;

public class SUVFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle(EnergyType energyType) {
        return new SUV(energyType);
    }
}
