package ss5_loop;
//Tìm và in lên màn hình tất cả các số nguyên trong phạm vi từ 10 đến 99 sao cho tích của 2 chữ số bằng 2 lần tổng của 2 chữ số đó. Ví dụ: Số 44
public class Exercise23 {
    public static void main(String[] args) {

        for (int i = 10; i <= 99; i++) {
            int tensDigit = i / 10;
            int unitDigit = i % 10;

            if ((tensDigit * unitDigit) == 2 * (tensDigit + unitDigit)) {
                System.out.println(i);
            }
        }

    }
}
