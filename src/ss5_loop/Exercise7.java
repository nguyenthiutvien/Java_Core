package ss5_loop;

import java.util.Scanner;

//In dãy số 1, 2, 3, 5, 8, 13, …n (n là số nhập vào từ bàn phím) (*).
public class Exercise7 {
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

        if (n <= 0) {
            System.out.print("So khong hop le");
        } else {
            int a = 1, b = 1;
            for (int i = 2; i <= n; i++) {
                System.out.print(b + "\t");
                int next = a + b;
                a = b;
                b = next;
            }
        }


    }
}
