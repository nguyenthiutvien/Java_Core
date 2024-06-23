package ss3_java_overview;

import java.util.Scanner;
//Đề bài: Nhập vào số xe của bạn (Gồm tối đa 5 chữ số). Cho biết số xe của bạn được mấy nút?

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your license plate: ");
        String licensePlate = scanner.nextLine();

        if (licensePlate.length() > 5) {
            System.out.println("Invalid input. Please enter up to 5 digits.");
            return;
        }

        int score = 0;
        for (int i = 0; i < licensePlate.length(); i++) {
            char eachDigit = licensePlate.charAt(i);
            score += Integer.parseInt(String.valueOf(eachDigit));
        }

        int numberOfButton = score % 10;

        System.out.println("The number of button is: " + numberOfButton);
    }
}
