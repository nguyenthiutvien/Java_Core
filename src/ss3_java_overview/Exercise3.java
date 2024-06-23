package ss3_java_overview;

import java.util.Scanner;
// Đề bài: Nhập tên sản phẩm, số lượng và đơn giá. Tính tiền và thuế giá trị gia tăng phải trả, biết:
//a. tiền = số lượng * đơn giá
//b. thuế giá trị gia tăng = 10%

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        double totalPrice = quantity * price;
        double valueAddedTax = totalPrice * 0.1;

        System.out.println("Name of product is: " + productName);
        System.out.println("Total price is: " + totalPrice);
        System.out.println("Value Added Tax (VAT) is: " + valueAddedTax);

    }
}
