package ss7_debug_string;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi thu nhat: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhap chuoi thu hai: ");
        String str2 = scanner.nextLine();

        int number = str1.compareTo(str2);
        System.out.println(number);

        if (number == 0 ){
            System.out.println("Hai chuoi bang nhau");
        } else if (number < 0){
            System.out.println("Chuoi thu nhat be hon chuoi thu hai");
        } else {
            System.out.println("Chuoi thu nhat lon hon chuoi thu hai");
        }
    }
}
