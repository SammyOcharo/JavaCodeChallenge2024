public class AnimalInheritance {
    //Java Inheritance: Exercise-1 with Solution
    //Write a Java program to create a class called Animal with a method called makeSound().
    // Create a subclass called Cat that overrides the makeSound() method to bark.

    public static class Animal{

        public void makesound(){
            System.out.println("Make sound");
        }

    }

    public static class Cat extends Animal{

        @Override
        public void makesound() {
            System.out.println("The cat miaows");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makesound();
        Cat cat = new Cat();
        cat.makesound();

    }
}
