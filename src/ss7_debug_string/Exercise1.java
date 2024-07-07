package ss7_debug_string;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        String str = "Hello World";
        //        a. Lấy ra chữ World
        String str1 = str.substring(6);

        //        b. Thay o thành f
        String str2 = str.replace('o', 'f');

//        c. Đếm xem có bao nhiêu chữ l
        int count = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println(count);

//        d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
        int str3 = str.indexOf("l");
        int str4 = str.lastIndexOf("l");
        System.out.println("Vi tri l dau tien la: " + str3);
        System.out.println("Vi tri l cuoi cung la: " + str4);

        //        e. Xóa hết space giữa chừng, đầu tiên và cuối cùng
        String str5 = str.replace(" ", "");
        System.out.println(str5);

//        f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
        String str6 = str.trim();
        System.out.println(str6);

//            g. Đảo chuỗi thành dlroW olleH
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString += str.charAt(i);

        }
        System.out.println(newString);

//        h. Cho chuỗi "SQC". Hãy tạo thành chuỗi “SQC Hello World”
        String str7 = "SQC ".concat(str);
        System.out.println(str7);
//        i. Đổi toàn bộ kí tự của S sang chữ Hoa
        System.out.println(str.toUpperCase());
//        k. Đổi toàn bộ kí tự của S sang chữ thường
        System.out.println(str.toLowerCase());
//        l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        String str8 = str.substring(a, b);
        System.out.println(str8);

    }


}
