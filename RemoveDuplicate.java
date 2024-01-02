import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    // Write a program to remove duplicate elements from an array in Java.

    public static int[] duplicateArray (int[] duplicateArray){
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for(int element: duplicateArray){
            uniqueNumbers.add(element);
        }

        int [] newArray = new int[uniqueNumbers.size()];
        int index = 0;

        for(int element: uniqueNumbers){
            newArray[index++] = element;
        }

        return newArray;
    }

    public static  void main (String[] args){

        int[] numbers = {73,73, 56,32,32, 65, 52};

        System.out.println(Arrays.toString(duplicateArray(numbers)));


    }
}
