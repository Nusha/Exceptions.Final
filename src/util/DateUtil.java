package util;

// DateUtil.java


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static LocalDate parseDate(String dateString) {
        return LocalDate.parse(dateString, formatter);
    }

    public static DateTimeFormatter getDateTimeFormatter() {
        return formatter;
    }
}
