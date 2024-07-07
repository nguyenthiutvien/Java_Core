package ss8_string.Exercise2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2B {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("The result is: "+ formattedDate);
    }
}
