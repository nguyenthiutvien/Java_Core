package ss10_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;

        do {
            System.out.print("Nhap n: ");
            n = scanner.nextInt();
            if (n <= 0){
                System.out.println("n phai lon hon 0");
            }
        } while (n<=0);

        int[] arr = new int[n];
        inputArray(arr);
        outputArray(arr);
        System.out.println("Dem so doi xung: " + countSymmetry(arr));

        if (checkSymmetry(arr)){
            System.out.println("Mang doi xung");
        } else {
            System.out.println("Mang khong doi xung");
        }
        reverseArray(arr);
        System.out.println("Mang sau khi dao nguoc " + Arrays.toString(arr));
        System.out.println("Mang sau khi duoc sap xep: " + Arrays.toString(arraySpecial(arr)));
    }
    static int countSymmetry (int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length/2; i++){
            if (arr[i] == arr[arr.length -1 - i]){
                count++;
            }
        }
        return count;
    }
    static boolean checkSymmetry (int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            if (arr[i] != arr[arr.length -1 - i]){
                return false;
            }
        }
        return true;
    }
    static void  reverseArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length-1-i] = temp;
        }
    }
    static int[] positiveNumber(int[] arr){
        int count = 0;
        for (int i =0; i <arr.length; i++){
            if (arr[i]>0){
                count++;
            }
        }

        int[] newArray = new int[count];
        int index = 0;
        for (int i =0; i<arr.length; i++){
            if (arr[i] >0){
                newArray[index] = arr[i];
                index++;
            }
        }
        return newArray;
    }

    static int[] negativeNumber(int[] arr){
        int count = 0;
        for (int i =0; i <arr.length; i++){
            if (arr[i]<=0){
                count++;
            }
        }

        int[] newArray = new int[count];
        int index = 0;
        for (int i =0; i<arr.length; i++){
            if (arr[i] <=0){
                newArray[index] = arr[i];
                index++;
            }
        }
        return newArray;
    }

    static void sortUpAscending (int[] arr){
        for (int i =0; i<arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void sortDescending (int[] arr){
        for (int i =0; i<arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
//    Sap xep so duong dung dau giam dan va so am tang dan
    static int[] arraySpecial(int[] arr){
        int[] positiveArray = positiveNumber(arr);
        sortUpAscending(positiveArray);
        int[] negativeArray = negativeNumber(arr);
        sortDescending(negativeArray);
        int[] sum = new int[arr.length];
        for (int i = 0; i< positiveArray.length; i ++){
            sum[i] = positiveArray[i];
        }
        for (int i = 0; i< negativeArray.length; i ++){
            sum[i] = negativeArray[i];
        }
        return sum;

    }

    public static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu " + (i +1 ) + " cua mang: ");
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
