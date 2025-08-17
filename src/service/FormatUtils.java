package service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatUtils {


    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DecimalFormat MONEY_FORMATTER = new DecimalFormat("#,##0.00");

    public static String formatDate(LocalDate date) {
        return date.format(DATE_FORMATTER);
    }

    public static String formatMoney(BigDecimal value) {
        return MONEY_FORMATTER.format(value);
    }
}
