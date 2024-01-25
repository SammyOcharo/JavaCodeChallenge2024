import java.util.Arrays;

public class BubbleSort {
    //bubble sort algorithm
    public static int[] BubbleSortFunc (int[] unsortedArray){

        int temp = 0;

        for(int i=0; i< unsortedArray.length; i++){
            for(int j=0; j<unsortedArray.length-1; j++){
                if(unsortedArray[j]>unsortedArray[j+1]){
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                }
            }
        }

        return unsortedArray;
    }

    public  static void main(String[] args){

        int[] numberList = {73,75, 56,32, 65, 52, 66};

        System.out.println(Arrays.toString(BubbleSortFunc(numberList)));
    }
}
