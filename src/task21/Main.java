package task21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

//1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
        String time1 = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru")));
        System.out.println(time1);

//2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String
        String time2 = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern(
                        "d MMMM yyyy, hh:mm:ss a", new Locale("ru")));
        System.out.println(time2);

//3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(
                "yyyy-MM-dd : HH:mm:ss", new Locale("ru"));

        LocalDateTime time3 = LocalDateTime.parse(
                "2023-03-19 : 10:12:24", dtf);
        System.out.println(time3);

//4. Перевести String (пн 20.03.23 г. время: 15:07:28) в формат LocalDateTime по умолчанию:
        dtf = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendText(ChronoField.DAY_OF_WEEK, TextStyle.SHORT) // пн
                .appendLiteral(' ')
                .appendPattern("dd.MM.yy")
                .appendLiteral(" г. время: ")
                .appendPattern("HH:mm:ss")
                .toFormatter(new Locale("ru"));

        LocalDateTime time4 = LocalDateTime.parse(
                "пн 20.03.23 г. время: 15:07:28", dtf);
        System.out.println(time4);

//5. *Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM). На выходе дата должна быть класса String
        String time5 = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern(
                        "EEEE d MMMM yyyy 'время:' hh.mm.ss a",
                        new Locale("ru")));
        System.out.println(time5);
    }
}
