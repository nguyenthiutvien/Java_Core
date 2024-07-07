package ss6_method;

import com.sun.source.tree.BreakTree;

import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        System.out.println("So nguoc dao la:" + reversedNumber(n));
        if (isSymmetricalNumber(n)) {
            System.out.println("Day la so doi xung");
        } else {
            System.out.println("Khong phai la so doi xung");
        }

        if (isSquareNumber(n)) {
            System.out.println("Day la so chinh phuong");
        } else {
            System.out.println("Khong phai la so chinh phuong");
        }

        if (isPrimeNumber(n)) {
            System.out.println("Day la so nguyen to");
        } else {
            System.out.println("Day khong phai la so nguyen to");
        }

        System.out.println("Tong cac so le la: " + sumTotalOddNumber(n));
        System.out.println("Tong cac chu so nguyen to: " + sumPrimeNumber(n));
        System.out.println("Tong cac chu so chinh phuong: " + sumSquareNumber(n));


//        a.    Trả về số đảo của số đó.

    }

    static int reversedNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    //        b.    Có phải là số đối xứng (Trả về True/False)
    static boolean isSymmetricalNumber(int number) {
        return number == reversedNumber(number);
    }

    //    c.    Có phải là số chính phương.
    static boolean isSquareNumber(int number) {
        return Math.sqrt(number) % 1 == 0;
    }

//    d.    Có phải là số nguyên tố.

    static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
//    e.    Tổng các chữ số lẻ.

    static int sumTotalOddNumber(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number = number / 10;
        }
        return sum;
    }

    //    f.    Tổng các chữ số nguyên tố.
    static int sumPrimeNumber(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (isPrimeNumber(digit)) {
                sum += digit;
            }
            number = number / 10;
        }
        return sum;
    }
//    g. Tổng các chữ số chính phương.

    static int sumSquareNumber(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (isSquareNumber(digit)) {
                sum += digit;
            }
            number = number / 10;
        }
        return sum;
    }


}
