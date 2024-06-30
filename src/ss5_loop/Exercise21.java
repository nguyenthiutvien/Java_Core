package ss5_loop;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.print("Nhập số nguyên a: ");
            a = scanner.nextInt();
            if (a < 0) {
                System.out.println("Số không hợp lệ");
            }
        }
        while (a < 0);

//        a. Có phải là số đối xứng? Ví dụ: 121, 12021, …

        String str = Integer.toString(a);

        boolean isSymmetry = true;

        for (int i = 0; i < (str.length() / 2); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isSymmetry = false;
                break;
            }
        }
        if (isSymmetry) {
            System.out.println(a + " là số đối xứng");
        } else {
            System.out.println(a + " không là số đối xứng");
        }

//        b. Có phải là số nguyên tố? Ví dụ: 2, 3, 5, 7, 11, 13, …

        boolean isPrime = true;

        if (a < 2) {
            isPrime = false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(a + " là số nguyên tố");
        } else {
            System.out.println(a + " không là số nguyên tố");
        }

//        c. Các chữ số có tăng dần không? Ví dụ: 2345, 367, 59, 123, …

        boolean isIncrease = true;

        for (int i = 0; i < (str.length() - 1); i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) {
                isIncrease = false;
                break;
            }
        }
        if (isIncrease && str.length() != 1) {
            System.out.println(a + " là số tăng dần");
        } else {
            System.out.println(a + " không là số tăng dần");
        }

    }
}
