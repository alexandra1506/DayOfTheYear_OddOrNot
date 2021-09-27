package com.javarush.task.task08.task0827;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.ParseException;

/*
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Date dateF = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        try {
            dateF = formatter.parse(date);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        String dayNumber = new SimpleDateFormat("D").format(dateF);
        int day = Integer.parseInt(dayNumber);
        return (day % 2 == 0)? false:  true;
    }
}
