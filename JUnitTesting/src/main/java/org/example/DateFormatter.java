package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public String formatDate(String inputdate){
        DateTimeFormatter inpformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter oupformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputdate,inpformat);
        return date.format(oupformat);
    }
}
