package ss3_java_overview;

import java.util.Scanner;
// Đề bài: Viết một chương trình Java để nhập vào hai số nguyên a và b từ người dùng. Sau đó, tính và hiển thị tổng, hiệu, tích và thương của hai số đó.

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter number b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division = (double) a / b;

        System.out.println(" Sum is: " + sum);
        System.out.println(" Subtraction is: " + subtraction);
        System.out.println(" Multiplication is: " + multiplication);
        System.out.println(" Division is: " + division);
    }
}
