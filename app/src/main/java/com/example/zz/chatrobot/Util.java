package com.example.zz.chatrobot;

import android.text.format.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 */
public class Util {

  private static final SimpleDateFormat HOUR_MINUTE_FORMAT = new SimpleDateFormat("HH:mm");

  private static final SimpleDateFormat YEAR_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

  public static String formatDateTime(Calendar calendar) {
    if (DateUtils.isToday(calendar.getTimeInMillis())) {
      return HOUR_MINUTE_FORMAT.format(calendar.getTime());
    }

    return YEAR_FORMAT.format(calendar.getTime());
  }
}
