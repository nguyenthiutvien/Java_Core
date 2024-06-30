package ss5_loop;

import java.util.Scanner;
//In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n (n là số nhập vào từ bàn phím)
public class Exercise6 {
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
        int count = 0;
        int distance = 1;

        for (int i = 2; i <= n; i += 2) {
            if (count == distance) {
                System.out.print(-i + " ");
                count = 0;
                distance++;
            } else {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
