import java.util.Scanner;

public class AddStringNumbers {
    //Create a function that takes two number strings and returns their sum as a string.
    //
    //Examples
    //add("111", "111") ➞ "222"
    //
    //add("10", "80") ➞ "90"
    //
    //add("", "20") ➞ "Invalid Operation"

    public static String StringNumberAddition(String a, String b){
        if(a.isEmpty() || b.isEmpty()){

            return "Invalid Operation";
        }

        try {
            int sum = Integer.parseInt(a) + Integer.parseInt(b);

            String result = Integer.toString(sum);

            return result;
        } catch (NumberFormatException e){
            return "Invalid Operation";
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter the String 1:  ");
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        System.out.print("Enter the String 2:  ");
        String b = scanner.nextLine();

        System.out.println(StringNumberAddition(a,b));
    }

}
