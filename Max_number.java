import java.util.ArrayList;

//1st Jan find max number from the arraylist
public class Max_number {

    public static  void main(String[] args){

        int[] numbers = {23, 56,32, 65, 52};

        int max = 0;

        for(int i=0; i<=numbers.length-1; i++){
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The maximum number in the list is " + max);
    }
}
