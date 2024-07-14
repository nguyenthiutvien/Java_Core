package ss9_array;

import java.util.Scanner;

public class Exercise1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;

        do {
            System.out.print("Nhap phan tu cua mang: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("So luong phan tu khong hop le");
            }
        } while (n <= 0);

        int[] arr = new int[n];
        inputArray(arr);
        outputArray(arr);
        if (isAllEven(arr)) {
            System.out.println("Mang toan chan");
        } else {
            System.out.println("Mang khong chua toan chan");
        }

        if (isAllPrime(arr)) {
            System.out.println("Mang toan nguyen to");
        } else {
            System.out.println("Mang khong chua so nguyen to");
        }

        if (isAscending(arr)) {
            System.out.println("Mang tang dan");
        } else {
            System.out.println("Mang khong tang dan");
        }

        System.out.println("So luong phan tu le trong mang: " + countOddNumber(arr));
        System.out.println("Tong phan tu le " + countPositiveOddNumber(arr));
        System.out.println("So luong phan tu chia het cho 4 nhung khong chia het cho 5 la: " + countDivisible(arr));
        System.out.println("Tong cac so nguyen to: " + sumPrime(arr));
        System.out.print("Vi tri dau tien cua so nguyen to k trong mang: ");
        if (firstPrimeIndex(arr) == -1) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println(firstPrimeIndex(arr));
        }
    }

    //    a. Nhập mảng
    public static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu " + i + " cua mang: ");
            arr[i] = scanner.nextInt();
        }
    }

    //    b. Xuất mảng
    public static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Mang: ");
            System.out.print(arr[i] + "\t");
        }
    }

    //    a. Mảng có phải là mảng toàn chẵn?
    public static boolean isAllEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    //    b. Mảng có phải là mảng toàn số nguyên tố?
    public static boolean isAllPrime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(arr[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int countOddNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static int countPositiveOddNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static int countDivisible(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0 && arr[i] % 5 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int sumPrime(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int firstPrimeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int findMinPositive(int[] arr) {
        int minPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPositive && arr[i] < 0) {
                minPositive = arr[i];
            }
        }
        return minPositive;
    }

    public static int findIndex(int[] arr, int k) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]) == k) {
                return Integer.parseInt(str = str + i + " ");
            }
        }
        return -1;
    }

    public static int findMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
