import java.util.Scanner;

public class HighestDigit {

    //Create a function that takes a number as an argument and returns the highest digit in that number.
    //
    //Examples
    //highestDigit(4666) ➞ 6
    //
    //highestDigit(544) ➞ 5
    //
    //highestDigit(379) ➞ 9
    //
    //highestDigit(2) ➞ 2
    //
    //highestDigit(377401) ➞ 7

    public static int LargerDigitFunc(int number){

        int largestDigit=0;

        while(number > 0){
           int remainder = number%10;

           if (remainder > largestDigit){
               largestDigit = remainder;
           }

           number = number/10;
        }
        return  largestDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int number = scanner.nextInt();

        System.out.println(LargerDigitFunc(number));
    }
}
