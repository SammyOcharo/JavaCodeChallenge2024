import java.util.Arrays;

public class ArrayOfMultiples {
    //Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.
    //
    //Examples
    //arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
    //
    //arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
    //
    //arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]

    public static int[] funcIntArray(int num, int length){

        int[] resultArray = new int[length];

        for(int i=0; i< length; i++){

            resultArray[i] = num * (i+1);
        }

        return resultArray;
    }

    public static void main(String[] args) {


        int[]array1 =  funcIntArray(7,5);
        System.out.println(Arrays.toString(array1));
        int[]array2 =  funcIntArray(12,10);
        System.out.println(Arrays.toString(array2));
        int[]array3 =  funcIntArray(17,6);
        System.out.println(Arrays.toString(array3));

        System.out.println();
    }
}
