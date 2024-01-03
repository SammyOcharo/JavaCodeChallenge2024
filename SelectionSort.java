import java.util.Arrays;

public class SelectionSort {
    //Algorithm for Selection sorting. Time complexity is O(n^2)
    //Enhanced as compared to Bubble sort
    //Iterate to find the smallest value
    //Swipe the first value with the smallest value
    //The inner loop runs to find the smallest value then replaces it with the first value
    //The outer loop moves to the next loop and the same is repeated.

    public static int[] SelectionSorting(int[] unsortedArray){

        int temp;

        for(int i=0; i<unsortedArray.length-1; i++){

            for(int j=i+1; j<unsortedArray.length; j++){
                if(unsortedArray[i] > unsortedArray[j]){
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }
        return unsortedArray;
    }

    public static void main(String[] args){

        int[] numberList = {73,75, 56,32, 65, 52};

        System.out.println(Arrays.toString(SelectionSorting(numberList)));
    }
}
