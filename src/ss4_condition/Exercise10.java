package ss4_condition;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int x = scanner.nextInt();

        double square = Math.sqrt(x);

        if (square % 1 ==0 ){
            System.out.println(x + "là số chính phương");
        } else {
            System.out.println(x + "không phải là số chính phương");
        }
    }
}
