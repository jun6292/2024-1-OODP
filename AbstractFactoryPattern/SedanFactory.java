package AbstractFactoryPattern;

public class SedanFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle(EnergyType energyType) {
        return new Sedan(energyType);
    }
}
