import java.util.Arrays;

public class WarOfNUmbers {

    //There's a great war between the even and odd numbers.
    // Many numbers already lost their lives in this war, and it's your task to end this.
    // You have to determine which group sums larger: the evens, or the odds. The larger group wins.
    //
    //Create a function that takes an array of integers, sums the even and odd numbers separately,
    // then returns the difference between the sum of the even and odd numbers.
    //
    //Examples
    //warOfNumbers([2, 8, 7, 5]) ➞ 2
    //// 2 + 8 = 10
    //// 7 + 5 = 12
    //// 12 is larger than 10
    //// So we return 12 - 10 = 2
    //
    //warOfNumbers([12, 90, 75]) ➞ 27
    //
    //warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168

    public static int ArrayOfIntergers(int[] PostiveIntegers){

        int even = 0;
        int odd = 0;

        for(int i=0; i< PostiveIntegers.length; i++){
            if(PostiveIntegers[i] % 2 == 0){
                even += PostiveIntegers[i];
            }else {
                odd += PostiveIntegers[i];
            }
        }

        if(odd > even){
            int remainder = odd-even;
            return  remainder;
        }else {
            int remainder = even-odd;
            return remainder;
        }

    }

    public static void main(String[] args) {
        int[] array1 = {2, 8, 7, 5};
        int[] array2 = {12, 90, 75};
        int[] array3 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        int[] array4 = {1256, 9023, 7235};

        System.out.println((ArrayOfIntergers(array1)));
        System.out.println((ArrayOfIntergers(array2)));
        System.out.println((ArrayOfIntergers(array3)));
        System.out.println((ArrayOfIntergers(array4)));
    }
}
