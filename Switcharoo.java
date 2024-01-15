import java.util.Scanner;

public class Switcharoo {

    //Create a function that takes a string and returns a new string with its first and last characters swapped, except under two conditions:
    //
    //If the length of the string is less than two, return "Incompatible.".
    //If the first and last characters are the same, return "Two's a pair.".
    //Examples
    //flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"
    //
    //flipEndChars("ada") ➞ "Two's a pair."
    //
    //flipEndChars("Ada") ➞ "adA"
    //
    //flipEndChars("z") ➞ "Incompatible."
    
    private static String wordSwitch(String word){

        String newWord;
        
        if(word.length()< 2){
            return "Incompatible";
        } else if (word.charAt(0) == (word.charAt(word.length()-1))) {
            return "Two's a pair.";
        } else {
            char beginning = word.charAt(0);
            char end = word.charAt(word.length()-1);
            newWord = end + word.substring(1, word.length()-1) + beginning;

            return  newWord;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word: ");
        String word = scanner.nextLine();

        System.out.println(wordSwitch(word));

        scanner.close();
    }
}
