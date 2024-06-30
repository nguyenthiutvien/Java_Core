package ss5_loop;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.print("Nhập chiều dài cạnh hình tam giac: ");
            a = scanner.nextInt();
            if (a < 0) {
                System.out.println("Chiều dài không hợp lệ");
            }
        }
        while (a < 0);

        System.out.println("Hình a");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hình b");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hình c");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Hình d");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=  i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a - i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hình e");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                if (j ==1  || j == a - i + 1 || i ==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình f");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i -1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("Hình g");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (a- i) * 2 + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
