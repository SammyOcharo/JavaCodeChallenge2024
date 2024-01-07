public abstract class Vehicle {
    //Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
    // Each subclass should have properties such as make, model, year, and fuel type.
    // Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

    private String make;
    private String model;
    private String year;
    private String fuelType;

    private double fuelEffiency;

    public Vehicle(String make, String model, String year, String fuelType, double fuelEffiency){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEffiency = fuelEffiency;
    }

    public double getFuelEffiency() {
        return fuelEffiency;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled();

    public abstract double getMaxSpeed();
}
