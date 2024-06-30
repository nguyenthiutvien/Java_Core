package ss5_loop;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.print("Nhập chiều dài cạnh hình vuông: ");
            a = scanner.nextInt();
            if (a < 0) {
                System.out.println("Chiều dài không hợp lệ");
            }
        }
        while (a < 0);
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i == 1 || i == a || j == 1 || j == a) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
