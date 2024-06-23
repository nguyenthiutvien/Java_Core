package ss3_java_overview;

import java.util.Scanner;
//Đề bài: Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của một học sinh. Tính điểm trung bình của học sinh đó.

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter math score: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Enter weight of the math subject: ");
        double mathWeight = scanner.nextDouble();

        System.out.print("Enter physics score: ");
        double physicsScore = scanner.nextDouble();
        System.out.print("Enter weight of the  physics subject: ");
        double physicsWeight = scanner.nextDouble();
        System.out.print("Enter chemistry score: ");
        double chemistryScore = scanner.nextDouble();
        System.out.print("Enter weight of the chemistry subject: ");
        double chemistryWeight = scanner.nextDouble();

        double averageScore = (mathScore * mathWeight + physicsScore * physicsWeight + chemistryScore * chemistryWeight) / (mathWeight + physicsWeight + chemistryWeight);

        System.out.println("Average score is: " + averageScore);
    }
}
