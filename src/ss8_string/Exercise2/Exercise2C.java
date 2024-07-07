package ss8_string.Exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise2C {
    public static void main(String[] args) {
        String date = "02/28/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println("The result is: " + localDate);
    }
}
