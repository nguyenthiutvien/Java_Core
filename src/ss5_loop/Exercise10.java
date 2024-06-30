package ss5_loop;

import java.util.Scanner;
/**
 *  Viết chương trình tính :
 * S=1+1/2+1/3+....+1/n
 * Số n được nhập từ bàn phím
 */
public class Exercise10 {
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
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Tổng là: " + sum);
    }
}
