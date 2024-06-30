package ss5_loop;

import java.util.Scanner;
/**
 * In dãy số 2, -4, 6, -8, 10 … n (n là số nhập vào từ bàn phím) (*)
 */
public class Exercise3 {
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

        for (int i = 2; i <= n; i += 2) {
            if (i % 4 == 0) {
                System.out.print(-i + "\t");
            } else {
                System.out.print(i + "\t");
            }
        }
    }
}
