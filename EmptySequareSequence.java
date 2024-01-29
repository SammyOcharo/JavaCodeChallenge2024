import java.util.Scanner;

public class EmptySequareSequence {
    //Create a function that takes a number step (which equals HALF the width of a square) and returns the amount of empty squares.
    // The image shows the squares with step 1, 2 and 3.
    // The return value is the number of cells not on a diagonal,
    // which is 0 for the first square, 8 for the second, and 24 for the third.
    //
    //Examples
    //emptySq(1) ➞ 0
    //
    //emptySq(3) ➞ 24
    //
    //emptySq(10) ➞ 360

    public static int CountShadedSquares(int a){
        if(a <= 1){
            return 0;
        }
        try {

            double step = a/2.0;

            if (a % 2 == 0){
                double AllShadedSquares = (2 * step)*2;
                int notShadedSquares = (int)((a*a) - AllShadedSquares);
                return notShadedSquares;
            } else {
                double AllShadedSquares = ((2 * step)*2)-1;
                int notShadedSquares = (int)((a*a) - AllShadedSquares);
                return notShadedSquares;
            }





        }catch (NullPointerException e){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the width of the square: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(CountShadedSquares(a));
    }
}
