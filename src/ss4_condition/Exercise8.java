package ss4_condition;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        int daysInMonth;
        switch (month)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                if (( year % 4 ==0 && year % 100 !=0) || ( year % 400 == 0)){
                    daysInMonth = 29;
                    break;
            } else {
                    daysInMonth = 28;
                    break;
                }
            default:
                daysInMonth = 31;
        }
        System.out.printf("Tháng %d có %d ngày ", month, daysInMonth);
    }
}
