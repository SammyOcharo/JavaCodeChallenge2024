public class ShapeInhertance {

    //Write a Java program to create a class called Shape with a method called getArea().
    // Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle

    public static class Shape{

        public double getArea(){

            return 0.0;
        }
    }


    public static class Rectangle extends Shape{
        private double Length;
        private double Width;

        public Rectangle(double Length, double Width){
            this.Length = Length;
            this.Width = Width;
        }

        @Override
        public double getArea() {
            return Length*Width;
        }
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.0, 5.0);
        double shape = rectangle.getArea();
        System.out.println(shape);
    }
}
