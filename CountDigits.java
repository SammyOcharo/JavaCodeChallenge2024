import java.util.Scanner;

public class CountDigits {
    //Count the Digits
    //Create a function that will count the number of digits of a number. Conversion of the number to a string is not allowed.
    //Examples
    //digitsCount(4666) ➞ 4
    //
    //digitsCount(544) ➞ 3
    //
    //digitsCount(121317) ➞ 6
    //
    //digitsCount(0) ➞ 1
    //
    //digitsCount(12345) ➞ 5
    //
    //digitsCount(1289396387328L) ➞ 13

    public static int Count(int number){

        int count=0;

        while (number > 0){
            number /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int number = scanner.nextInt();

        System.out.println(Count(number));
    }
}
