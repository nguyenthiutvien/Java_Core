package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
 */
public class Exercise1 {
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


        for (int i = 1; i < n; i++) {
            System.out.print(i + ",");
        }
        System.out.println(n);
    }
}
