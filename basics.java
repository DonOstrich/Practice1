import java.awt.*;
import java.util.*;

public class basics {
    public static void main(String[] args) {
        driver();
    }

    /*
    *   driver() will instansiate all required methods and variables.
    *   i.e. get the program to run and give the expected outcome of this program.
     */
    public static void driver() {
        Scanner input = new Scanner(System.in);
        System.out.println("Let us see if your word is a Palindrome");
        System.out.println("Please enter a word with only letters in it: ");
        String word = input.next();
        char[] revWord  = reverseArr(word);
        boolean palind = isPalindrome(revWord, word);
        print(palind);
    }

    public static boolean isPalindrome(char arr[], String word){
        boolean check = false;
        for (int i = 0; i <  word.length(); i++) {
            if (arr[i] == word.charAt(i)) {
                check = true;
            }
            else if(arr[i] != word.charAt(i)){
                check = false;
            }
            else{
                check = false;
            }
        }
        return check;
    }

    public static char[] reverseArr(String word){
        char[] lettersOfWord = new char[word.length()];
        lettersOfWord = word.toCharArray();
        char[] reversedWord = new char[lettersOfWord.length];
        int k = 0;
        for (int i = lettersOfWord.length-1; i >= 0; i--){
            reversedWord[k] = lettersOfWord[i];
            k++;
        }
        return reversedWord;
    }

    public static void print(boolean p){
        if(p == true){
            System.out.println("Your word is a Palindrome");
        }
        else{
            System.out.println("Your word is not a Palindrome");
        }
    }



}
