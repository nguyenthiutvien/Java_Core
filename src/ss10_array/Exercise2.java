package ss10_array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap n: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("So khong hop le (n > 0");
            }

        } while (n <= 0);

        int[] arr = new int[n];
        inputArray(arr);
        outputArray(arr);
        changePrimeTo0(arr);
        System.out.println("Mang sau khi thay doi so nguyen to thanh 0: " + Arrays.toString(arr));
        arr = insert0toArray(arr);
        System.out.println("mang sua khi truyen so 0 vao sau so nguyen to: " + Arrays.toString(arr));
        System.out.print("Nhap k muon xoa");
        int k = scanner.nextInt();
        arr = deleteElement(arr, k);
        System.out.println("Mang sau khi xoa: " + Arrays.toString(arr));
    }

    static void changePrimeTo0(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr[i] = 0;
            }
        }
    }

    static int[] insert0toArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr = insert(arr, i + 1, 0);
                i++;
            }
        }
        return arr;
    }

    static int[] insert(int[] arr, int i, int a) {
        int[] newArray = new int[arr.length + 1];

        for (int j = 0; j < i; j++) {
            newArray[i] = arr[i];
        }

        newArray[i] = a;
        for (int g = i; i < arr.length; g++) {
            newArray[g + 1] = arr[i];
        }
        return newArray;
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int[] deleteElement(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                arr = delete(arr, i);
                i--;
            }
        }
        return arr;
    }

    static int[] delete(int[] arr, int i) {
        int[] newArray = new int[arr.length - 1];

        for (int j = 0; j < i; j++) {
            newArray[i] = arr[i];
        }
        for (int g = i; g < arr.length; g++) {
            newArray[g] = arr[g + 1];
        }
        return newArray;
    }

    public static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " cua mang: ");
            arr[i] = scanner.nextInt();
        }
    }

    //    b. Xuất mảng
    public static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
