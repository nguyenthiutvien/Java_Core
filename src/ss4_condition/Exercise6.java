package ss4_condition;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình là: " + x);
            }
        } else {
            double delta = b * b - (4 * a * c);
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có một nghiệm: " + -b / (2 * a));
            } else {
                double x1 = (-b - Math.sqrt(delta) / 2 * a);
                double x2 = (-b + Math.sqrt(delta) / 2 * a);
                System.out.println("Nghiệm x1 là: " + x1);
                System.out.println("Nghiệm x2 là: " + x2);
            }
        }
    }
}
