package ss4_condition;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Ngày không hợp lệ ");
            return;
        }
        System.out.print("Vui lòng nhập tháng: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ ");
            return;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                System.out.println("Ngày không hợp lệ");
                return;
            }
        }

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                if (day > 29) {
                    System.out.println("Ngày không hợp lệ");
                    return;
                }
            } else {
                if (day > 28) {
                    System.out.println("Ngày không hợp lệ");
                    return;
                }
            }
        }

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        nextDay++;
        boolean leapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        if (nextDay > 31 || (month == 2 && nextDay > (leapYear ? 29 : 28) || ((month == 4) || month == 6) || (month == 9) || month == 11) && (nextDay > 30)) {
            nextDay = 1;
            nextMonth++;
        }
        if (nextMonth > 12){
            nextMonth = 1;
            nextYear++;
        }
        System.out.printf("Ngày kế tiêp: %d/%d/%d", nextDay,nextMonth, nextYear);
        System.out.println();

        int previousDay = day;
        int previousMonth = month;
        int previousYear = year;

        previousDay--;
        if ( previousDay < 1){
            previousMonth--;
            if (previousMonth < 1){
                previousMonth = 12;
                previousYear--;
            }
            if ( previousMonth ==4 || previousMonth == 6 || previousMonth == 9 || previousMonth==1){
                previousDay = 30;
            } else if (previousMonth ==2){
                if (leapYear){
                    previousDay = 29;
                } else {
                    previousDay = 28;
                }
            }else {
                previousDay = 31;
            }
        }

        System.out.printf("Ngày trước đó: %d/%d/%d", previousDay,previousMonth, previousYear);

    }

}
