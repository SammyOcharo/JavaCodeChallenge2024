public class Animalinheritance {
    //Write a Java program to create a class called Animal with a method named move().
    // Create a subclass called Cheetah that overrides the move() method to run.

    public static class Cheetah extends Animal{

        @Override
        public void move() {
            System.out.println("The Cheetah is running..");
        }
    }

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.move();

        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
