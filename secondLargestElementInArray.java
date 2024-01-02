import java.util.Arrays;

public class secondLargestElementInArray {
    //Write a program to find the second-largest number in an array in Java.

    public static int secondLargestElement(int[] arr){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i <= arr.length-1; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
    public static void main(String[] args) {
        int[] numbers = {73,75, 56,32, 65, 52};

        System.out.println(secondLargestElement(numbers));

    }
}
