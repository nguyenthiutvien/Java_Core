package ss6_method;

import java.util.Scanner;

//Bài tập chương câu lệnh điều kiện và rẽ nhánh
//    a.    Viết phương thức đổi một ký tự hoa sang ký tự thường.
//    b.    Viết phương thức giải phương trình bậc nhất.
//    c.    Viết phương thức giải phương trình bậc hai.
//    d.    Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên.
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter characters: ");
        char character = scanner.next().charAt(0);

        System.out.println("The character after converting to uppercase is:" + toLowerCase(character));

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("The result of the equation is: ");
        firstDegreeEquation(a, b);

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        System.out.print("The result of the equation is: ");
        secondDegreeEquation(a, b, c);

        System.out.print("Enter d: ");
        double d = scanner.nextDouble();
        System.out.print("Min is: " + minInt(a, b, c, d));
    }
    //    a.    Viết phương thức đổi một ký tự hoa sang ký tự thường.

    public static char toLowerCase(char a) {
        if (a >= 'A' && a <= 'Z') {
            a += 32;
        }
        return a;
    }
    //    b.    Viết phương thức giải phương trình bậc nhất.

    public static void firstDegreeEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Equation with countless solutions");
            } else {
                System.out.println("The equation has no solution");
            }
        } else {
            double x = -b / a;
            System.out.println("The equation has a solution: " + x);
        }
    }
//    c.    Viết phương thức giải phương trình bậc hai.
    public static void secondDegreeEquation(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Equation with countless solutions");
                } else {
                    System.out.println("The equation has no solution");
                }
            } else {
                double x = -c / b;
                System.out.println("The equation has one solution: " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("The equation has no solution");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has one solution: " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two solutions: " + x1 + " and " + x2);
            }
        }

    }
    //    d.    Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên.
    public static double minInt(double a, double b, double c, double d) {
        double min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        return  min;
    }


}
