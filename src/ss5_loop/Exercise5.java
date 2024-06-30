package ss5_loop;

import java.util.Scanner;
//In dãy số 2, 4, 6, 8, 10 … 2n (n là số nhập vào từ bàn phím) (*)
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");

        int n = scanner.nextInt();

        for (int i = 2; i <= 2*n; i+=2){
            System.out.print(i + " ");
        }
    }
}
