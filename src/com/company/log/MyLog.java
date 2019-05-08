package com.company.log;

import org.joda.time.DateTime;

import java.util.Locale;

public class MyLog {
    private static String log = "";
    private static int i = 1;

    public static void addAction(String s)
    {
        log += i++ +". <" + s +"> " + returnCurrentDate() + "\n";
    }

    public static String getLog() {
        return log;
    }

    public static String returnCurrentDate(){
        DateTime d = new DateTime();
        return  d.dayOfMonth().getAsText() + " "
                + d.monthOfYear().getAsText(Locale.ENGLISH)+ " "
                + d.year().getAsText()+ " "
                + d.hourOfDay().getAsText() + ":"
                + d.minuteOfHour().getAsText() + ":"
                + d.secondOfMinute().getAsText();
    }

    @Override
    public String toString(){
        return log;
    }
}
