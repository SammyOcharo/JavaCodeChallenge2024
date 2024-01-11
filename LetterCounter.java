public class LetterCounter {
    //Create a function that counts the number of times a particular letter shows up in the word search.
    //Examples
    //letterCounter([
    //  ["D", "E", "Y", "H", "A", "D"],
    //  ["C", "B", "Z", "Y", "J", "K"],
    //  ["D", "B", "C", "A", "M", "N"],
    //  ["F", "G", "G", "R", "S", "R"],
    //  ["V", "X", "H", "A", "S", "S"]
    //], "D") ➞ 3
    //
    //// "D" shows up 3 times: twice in the first row, once in the third row.
    //
    //letterCounter([
    //  ["D", "E", "Y", "H", "A", "D"],
    //  ["C", "B", "Z", "Y", "J", "K"],
    //  ["D", "B", "C", "A", "M", "N"],
    //  ["F", "G", "G", "R", "S", "R"],
    //  ["V", "X", "H", "A", "S", "S"]
    //], "H") ➞ 2

    public static int CountCharacter(char[][] maxtrix, char Letter){
        int count = 0;

        for(int i=0; i< maxtrix.length; i++){
            System.out.println(maxtrix[i]);
           for(int j = 0; j< maxtrix.length; j++){
               if(maxtrix[i][j] == Letter){
                   count += 1;
               }
           }
        }

        return 0;
    }

    public static void main(String[] args) {

        char[][] matrix1 = {
                {'D', 'E', 'Y', 'H', 'A', 'D'},
                {'C', 'B', 'Z', 'Y', 'J', 'K'},
                {'D', 'B', 'C', 'A', 'M', 'N'},
                {'F', 'G', 'G', 'R', 'S', 'R'},
                {'V', 'X', 'H', 'A', 'S', 'S'}
        };

        int letter = CountCharacter(matrix1, 'D');

        System.out.println(letter);
    }
}
