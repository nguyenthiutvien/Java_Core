package ss5_loop;

import java.util.Scanner;
// In dãy số 1, 3, 7, 15, 31, …n (n là số nhập vào từ bàn phím)
public class Exercise8 {
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
        int a = 1;

        while (a < n) {
            System.out.print(a + " ");
            a = a * 2 + 1;
        }
    }
}
