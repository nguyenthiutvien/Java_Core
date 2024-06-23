package ss3_java_overview;

import java.util.Scanner;
//Đề bài: Nhập bán kính của đường tròn. Tính chu vi và diện tích của hình tròn đó.
//Công thức
//Chu vi: C = 2 * π * r
//Diện tích: A = π * r²

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double area = Math.pow(radius, 2) * Math.PI;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Are is: " + area);
        System.out.println("Perimeter is: " + perimeter);
    }
}
