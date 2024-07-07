package ss8_string;

public class Exercise1 {
    public static void main(String[] args) {
//        a
        String str = "Hello world";
// a. Cho chuỗi "Hello World"
//    Lấy ra chữ World bằng cách dùng StringBuffer và StringBuilder.

        StringBuilder stringBuilder = new StringBuilder(str);
        String result1 = stringBuilder.substring(5);
        System.out.println("The result use String Builder: " + result1);

        StringBuffer stringBuffer = new StringBuffer(str);
        String result2 = stringBuffer.substring(5);
        System.out.println("The result use String Buffer: " + result2);
//  b. Cho chuỗi "Hello World"
//    Thay o thành f bằng cách dùng StringBuffer và StringBuilder.

        stringBuilder.replace(4, 6, "f");
        System.out.println("The result use String Buffer: " + stringBuilder);

        stringBuffer.replace(4, 6, "f");
        System.out.println("The result use String Buffer: " + stringBuffer);
    }

    //    c. Cho chuỗi "Hello" và chuỗi “World”
    //    Nối 2 chuỗi này bằng cách dùng String, StringBuffer và StringBuilder
    String str1 = "Hello";
    String str2 = "World";

    String result = str1 + str2;


}
