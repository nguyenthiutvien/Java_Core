package ss5_loop;

import java.util.Scanner;

public class Exercise15 {
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

        System.out.println("Hình a");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == 1 || i == 1 || i == a) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình b");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == a || i == 1 || i == a) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình c");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == a || j == 1 || i == a) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
