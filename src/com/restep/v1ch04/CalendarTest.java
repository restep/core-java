package com.restep.v1ch04;

import java.text.DateFormatSymbols;
import java.util.Calendar;

/**
 * @author restep
 * @date 2019/2/26
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int today = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);

        calendar.set(Calendar.DAY_OF_MONTH, 1);

        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        int firstDayOfWeek = calendar.getFirstDayOfWeek();

        int index = 0;
        while (weekday != firstDayOfWeek) {
            index++;

            calendar.add(Calendar.DAY_OF_MONTH, -1);
            weekday = calendar.get(Calendar.DAY_OF_WEEK);
        }

        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s", weekdayNames[weekday]);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            weekday = calendar.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);
        System.out.println();

        for (int i = 0; i <= index; i++) {
            System.out.print("    ");
        }

        calendar.set(Calendar.DAY_OF_MONTH, 1);

        do {
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);

            if (day == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            calendar.add(Calendar.DAY_OF_MONTH, 1);
            weekday = calendar.get(Calendar.DAY_OF_WEEK);

            if (weekday == firstDayOfWeek) {
                System.out.println();
            }
        } while (calendar.get(Calendar.MONTH) == month);

        if (weekday != firstDayOfWeek) {
            System.out.println();
        }
    }
}
