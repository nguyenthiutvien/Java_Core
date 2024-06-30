package ss5_loop;

import java.util.Scanner;
//In dãy số 2, 4, -6, 8, 10, -12 … n (bằng ít nhất 2 cách khác nhau) (n là số nhập vào từ bàn phím)
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập số nguyên n: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Số không hợp lệ");
            }
        }
        while (n < 0);
        int count = 0;
        for ( int i = 2; i <= n; i+=2 ){
            count++;
            if (count == 3){
                System.out.print(-i+ " ");
                count = 0;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
