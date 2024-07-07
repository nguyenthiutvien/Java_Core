package ss6_method;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + USCLN(a,b));

    }
    static int USCLN(int a, int b){
        int min = Math.min(a,b);
        int max = Math.min(a,b);
        if (max % min == 0){
            return  min;
        }
        for ( int i = min/2; i >= 1; i--){
            if (a % i ==0 && b % i ==0){
                return  i;
            }
        }
        return  1;
    }
}
