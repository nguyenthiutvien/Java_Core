package ss5_loop;

import java.util.Scanner;
//Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím
public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập số nguyên n: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Số không hợp lệ");
            }
        }
        while (n < 0);
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;

        }
        System.out.println("Tổng là: " + sum);
        System.out.println("Tích là: " + product);
    }
}
