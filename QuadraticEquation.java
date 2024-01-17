import java.util.Arrays;
import java.util.Scanner;

public class QuadraticEquation {
    //Quadratic Equation
    //Create a function to find only the root value of x in any quadratic equation ax^2 + bx + c.
    // The function will take three arguments:
    //a as the coefficient of x^2
    //b as the coefficient of x
    //c as the constant term
    //Examples
    //quadraticEquation(1, 2, -3) ➞ 1
    //
    //quadraticEquation(2, -7, 3) ➞ 3

    public static double[] QuadraticFuc(double a, double b, double c){

        double discremenant = b * b - 4 * a * c;
        double denominator = 2*a;

       double firstRoot =  (-b + Math.sqrt(discremenant))/denominator;

       double secondRoot = (-b - Math.sqrt(discremenant))/denominator;

       double[] roots = {firstRoot, secondRoot};

       return roots;
    }

    public static void main(String[] args) {
        System.out.println("Input the a, b and c coeffiecients");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double[] roots = QuadraticFuc(a, b, c);

        System.out.println(Arrays.toString(roots));
    }
}
