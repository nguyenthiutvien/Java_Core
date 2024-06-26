package ss4_condition;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter number b: ");
        int b = scanner.nextInt();

        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }

}
