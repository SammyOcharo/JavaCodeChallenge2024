public class VehicleParent {
    //Write a Java program to create a class called Vehicle with a method called drive().
    // Create a subclass called Car that overrides the drive() method to print "Repairing a car".

    public static class Vehicle{

        public void drive(){
            System.out.println("Driving...");
        }
    }

    public static class Car extends Vehicle{

        @Override
        public void drive() {
            System.out.println("Repairing a car");
        }
    }

    public static  void main(String[] args){

        Vehicle vehicle = new Vehicle();
        vehicle.drive();

        Car car = new Car();
        car.drive();
    }

}
