package ss8_string.Exercise2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2A {
//        a. Chuyển chuỗi "02/28/2023" sang kiểu java.util.Date.
    public static void main(String[] args) throws ParseException {
        String date = "02/28/2023";

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
        Date dates = dateFormat.parse(date);

        System.out.println("The result is: " + dates);
    }
}
