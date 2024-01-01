public class min_number {
    public static  void main(String[] args){

        int[] numbers = {73, 56,32, 65, 52};

        int min = numbers[0];

        for(int i=0; i<=numbers.length-1; i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("The maximum number in the list is " + min);
    }
}
