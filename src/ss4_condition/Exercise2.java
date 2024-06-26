package ss4_condition;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        String numberEnglish;
        switch (number) {
            case 1:
                numberEnglish = "One";
                break;
            case 2:
                numberEnglish = "Two";
                break;
            case 3:
                numberEnglish = "Three";
                break;
            case 4:
                numberEnglish = "Four";
                break;
            case 5:
                numberEnglish = "Five";
                break;
            case 6:
                numberEnglish = "Six";
                break;
            case 7:
                numberEnglish = "Seven";
                break;
            case 8:
                numberEnglish = "Eight";
                break;
            case 9:
                numberEnglish = "Nine";
                break;
            case 10:
                numberEnglish = "Ten";
                break;
            default:
                numberEnglish = "Number is invalid";
                break;
        }
        System.out.println("Number " + number + " in English is: " + numberEnglish);
    }
}
