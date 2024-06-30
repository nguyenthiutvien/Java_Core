package ss3_java_overview;

import java.util.Scanner;
// Đề bài: Nhập năm sinh của một người. Tính tuổi người đó.

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year of your birth: ");
        int yearOfBirth = scanner.nextInt();
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - yearOfBirth;
        System.out.println("Your old: " + age);
        System.out.println("Your age is: " +  age);

    }
}
