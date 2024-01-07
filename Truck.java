public class Truck extends Vehicle{
    private double cargoCapacity;


    public Truck(String make, String model, String year, String fuelType, double cargoCapacity, double fuelEffiency){
        super(make, model, year, fuelType, fuelEffiency);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        return cargoCapacity * super.getFuelEffiency();
    }

    @Override
    public double calculateDistanceTraveled() {
        return cargoCapacity *super.getFuelEffiency();
    }

    @Override
    public double getMaxSpeed() {
        return cargoCapacity*super.getFuelEffiency();
    }

    public static void main(String[] args) {
        Truck truck = new Truck("Isuzu", "A1", "2022", "V8", 1000.00, 100.00);
        System.out.println(truck.calculateFuelEfficiency());
    }
}
