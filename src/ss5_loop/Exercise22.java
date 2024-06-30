package ss5_loop;

import java.util.Scanner;

//Nhập vào 2 số nguyên dương a & b với điều kiện là b > a. Hãy thực hiện đếm và tính tổng trong đoạn[a, b] có bao nhiêu số đối xứng, chính phương, nguyên tố
public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int symmetryNumber = 0, symmetrySum = 0, squareNumber = 0, squareSum = 0, primeNumber = 0, primeSum = 0;
        int a;
        do {
            System.out.print("Nhập số nguyên a: ");
            a = scanner.nextInt();
            if (a < 0) {
                System.out.println("Số không hợp lệ");
            }
        }
        while (a < 0);

        int b;
        do {
            System.out.print("Nhập số nguyên b (b > a): ");
            b = scanner.nextInt();
            if (b < 0) {
                System.out.println("Số không hợp lệ");
            }
        }
        while (b < 0 || b < a);
        for (int i = a; i <= b; i++) {
            String str = Integer.toString(i);
            boolean isSymmetry = true;

            for (int j = 0; j < (str.length() / 2); j++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    isSymmetry = false;
                    break;
                }
            }
            if (isSymmetry) {
                symmetryNumber++;
                symmetrySum += i;
            }

//            Kiem tra so chinh phuong
            if (Math.sqrt(i) % 1 == 0) {
                squareNumber++;
                squareSum += i;
            }

//            So nguyen to

            boolean isPrime = true;

            if (i < 2) {
                isPrime = false;
            }
            for (int n = 2; n < Math.sqrt(i); n++) {
                if (i % n == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeSum += i;
                primeNumber++;
            }

        }
        System.out.printf("Số lượng số đối xứng trong đoạn từ [%d;%d] là: %d ", a, b, symmetryNumber);
        System.out.println();
        System.out.printf("Tổng các số đối xứng trong đoạn từ  [%d;%d] là: %d ", a, b, symmetrySum);
        System.out.println();
        System.out.printf("Số lượng số chính phương trong đoạn từ [%d;%d] là: %d ", a, b, squareNumber);
        System.out.println();
        System.out.printf("Tổng các số chính phương trong đoạn từ  [%d;%d] là: %d ", a, b, squareNumber);
        System.out.println();
        System.out.printf("Số lượng số nguyên tố trong đoạn từ [%d;%d] là: %d ", a, b, primeNumber);
        System.out.println();
        System.out.printf("Tổng các số nguyên tố trong đoạn từ  [%d;%d] là: %d ", a, b, primeSum);
    }
}
