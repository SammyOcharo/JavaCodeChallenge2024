import java.util.Arrays;
import java.util.Scanner;

public class PerfectSquarePatch {
    //Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
    //
    //Examples
    //squarePatch(3) ➞ [
    //  [3, 3, 3],
    //  [3, 3, 3],
    //  [3, 3, 3]
    //]
    //
    //squarePatch(5) ➞ [
    //  [5, 5, 5, 5, 5],
    //  [5, 5, 5, 5, 5],
    //  [5, 5, 5, 5, 5],
    //  [5, 5, 5, 5, 5],
    //  [5, 5, 5, 5, 5]
    //]

    public static int[][] perfectSquareFunc(int a){

        int[][] matrix = new int[a][a];

        for(int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix.length; j++){
                matrix[i][j] = a;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of the matrix: ");
        int Digit = scanner.nextInt();

        int[] [] matrix = perfectSquareFunc(Digit);

       for (int i=0; i< matrix.length; i++){
           System.out.println(Arrays.toString(matrix[i]));
       }
    }
}
