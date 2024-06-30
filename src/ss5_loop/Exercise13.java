package ss5_loop;

import java.util.Scanner;
//Nhập 2 số nguyên dương a và b. Sau đó in ra ước số chung lớn nhất và bội số chung nhỏ nhất của 2 số nguyên dương a và b đó.
public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        do {
            System.out.print("Enter a: ");
            a = scanner.nextInt();
            if (a < 0) {
                System.out.println("Number not valid");
            }
        }
        while (a < 0);

        int b;
        do {
            System.out.print("Enter b: ");
            b = scanner.nextInt();
            if (b < 0) {
                System.out.println("Number not valid");
            }
        }
        while (b < 0);
//        UCLN
        int UCLN = 1;
        for (int i = a; i > 1 ; i--){
            if ( a % i == 0 && b % i == 0){
                UCLN = i;
                break;
            }
        }
        int BCNN;
        for ( int i = a; true; i++){
            if (i % a == 0 && i % b == 0){
                BCNN = i;
                break;
            }
        }
        System.out.println("Ước chung lớn nhất của "+ a + " va "+ b +" la: "+ UCLN);
        System.out.println("Bội chung lớn nhất của "+ a + " va "+ b +" la: "+ BCNN);
    }
}
