package ss4_condition;

import java.util.Scanner;

//Viết chương trình tính lương của nhân viên dựa theo thâm niên công tác (TNCT) như sau:
//
//Lương = hệ số * lương căn bản, trong đó lương căn bản là 650000 $.
//
//• Nếu TNCT < 12 tháng: hệ số = 1.92
//
//• Nếu 12 <= TNCT < 36 tháng: hệ số = 2.34
//
//• Nếu 36 <= TNCT < 60 tháng: hệ số = 3
//
//• Nếu TNCT >= 60 tháng: hệ số = 4.5
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tháng thâm niên công tác: ");
        int workingSeniority = scanner.nextInt();

        double basicSalary = 650000;
        double coefficientsSalary;
        if (workingSeniority < 12) {
            coefficientsSalary = 1.92;
        } else if (workingSeniority < 36) {
            coefficientsSalary = 2.34;
        } else if (workingSeniority < 60) {
            coefficientsSalary = 3.0;
        } else {
            coefficientsSalary = 4.5;
        }

        double salary = basicSalary * coefficientsSalary;

        System.out.println("Lương của nhân viên: $" + salary);
    }
}
