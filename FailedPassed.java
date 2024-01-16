import java.util.Scanner;

public class FailedPassed {
    //You FAILEDPASSED the Exam
    //NOTE FROM TRANSLATOR:
    //This code is a direct translation from the Python version of this challenge to a Java version.
    // However, because of the differences between the languages and how they function, the Java code is much harder to understand
    //
    //For example, the short, easy to read statment in Python int(userScore[:-1]) becomes Integer.parseInt(userScore.substring(0,userScore.length()) in Java.
    //
    //END TRANSLATOR'S NOTE
    //Here is a trainwreck of a photo:
    //
    //You FAILEDPASSED the Exam Required mark is 85% Your score 85%
    //
    //The challenge is to fix all the bugs in this incredibly messy code, which the code in the image might've actually looked like (probably not)!
    // The code given will output the same middle two lines as in the image shown above.
    //
    //First parameter is the user's score.
    //Second parameter is the required score.
    //Examples
    //grade_percentage("85%", "85%") ➞ "You PASSED the Exam"
    //
    //grade_percentage("99%", "85%") ➞ "You PASSED the Exam"
    //
    //grade_percentage("65%", "90%") ➞ "You FAILED the Exam"

    public static String calculatePassedFailed(String passmark, String realMarks){

        int passmarkSet = Integer.parseInt(passmark.substring(0, passmark.length()-1));
        int realMark = Integer.parseInt(realMarks.substring(0, passmark.length()-1));

        if(realMark >= passmarkSet){
            return "You PASSED the Exam";
        } else {
           return  "You FAILED the Exam";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Input the passmark of the exam: ");

        String passmark = scanner.nextLine();

        System.out.print(" Input the real mark scored in the exam: ");

        String realMarks = scanner.nextLine();

        System.out.println(calculatePassedFailed(passmark, realMarks));

    }
}
