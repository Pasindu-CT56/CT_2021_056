package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();
        System.out.print("Enter the replacement word: ");
        String newWord = scanner.next();
        String replaced = sentence.replaceAll(oldWord, newWord);
        System.out.println("Modified sentence: " + replaced);

    }
}