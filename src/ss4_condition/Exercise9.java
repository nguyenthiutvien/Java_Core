package ss4_condition;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter character from keyboard: ");
        char character = scanner.next().charAt(0);

        if (( character >= 'A' && character <= 'Z') ||  ( character >= 'a' && character <= 'z')){
            if (( character >= 'a') && (character <= 'z')){
                character -= 32;
            } else {
                character += 32;
            }
            System.out.println("Character after change: " + character);
        } else {
            System.out.println("You enter invalid character. Please try again!");
        }
    }
}
