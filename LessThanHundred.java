import java.util.Scanner;

public class LessThanHundred {
    //Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
    //
    //Examples
    //lessThan100(22, 15) ➞ true
    //// 22 + 15 = 37
    //
    //lessThan100(83, 34) ➞ false
    //// 83 + 34 = 117
    //
    //lessThan100(3, 77) ➞ true


    public static boolean isLessHundred(int a, int b){

        if((a+b) < 100){

            return true;
        }

        return  false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int a: ");

        int a = scanner.nextInt();

        System.out.println("Enter int b: ");

        int b = scanner.nextInt();

        System.out.println(isLessHundred(a,b));

    }
}
