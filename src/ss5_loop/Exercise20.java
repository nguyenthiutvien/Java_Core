package ss5_loop;

import java.util.Scanner;
//Viết chương trình tính S = a! + b! + c! với a, b, c là 3 số nguyên dương nhập từ bàn phím.
public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        do {
            System.out.print("Nhập số nguyên a: ");
            a = scanner.nextInt();
            if (a < 0) {
                System.out.println("Số không hợp lệ");
            }
        }
        while (a < 0);

        int b;
        do {
            System.out.print("Nhập số nguyên b: ");
            b = scanner.nextInt();
            if (b < 0) {
                System.out.println("Số không hợp lệ");
            }
        }
        while (b < 0);

        int c;
        do {
            System.out.print("Nhập số nguyên c: ");
            c = scanner.nextInt();
            if (c < 0) {
                System.out.println("Số không hợp lệ");
            }
        }
        while (c < 0);

        int firstFactorial = 1, secondFactorial = 1, thirdFactorial  = 1;
        int sum = 0;
        for (int i = 1; i <= a; i ++){
            firstFactorial *= i;
        }
        for (int i = 1; i <= b; i ++){
            secondFactorial *= i;
        }
        for (int i = 1; i <= c; i ++){
            thirdFactorial *= i;
        }
        sum = firstFactorial + secondFactorial + thirdFactorial;

        System.out.println("Tổng la: " + sum);
    }
}
