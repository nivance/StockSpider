package org.whatever.stockspider.util;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateUtil {
    public static long DAY_MILLIS = 24 * 60 * 60 * 1000;

    /**
     * 获取上周日时间
     *
     * @param current
     * @return
     */
    public static Date lastWeekEndTime(Long current) {
        return new Date(current - dayOfWeek(new Date(current)) * DAY_MILLIS);
    }

    public static int dayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        return dayOfWeek == 0 ? 7 : dayOfWeek;
    }

    public static int dayOfWeek(String date) {
        DateTime dateTime = DateTime.parse(date);
        return dayOfWeek(dateTime.toDate());
    }

    public static int weekOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public static String formatDate(Long millis) {
        DateTime dateTime = new DateTime(millis);
        return dateTime.toString("yyyy-MM-dd");
    }

    public static String formatDate(Long millis, DateTimeFormatter formatter) {
        DateTime dateTime = new DateTime(millis);
        return dateTime.toString(formatter);
    }

    /* yyyy-MM-dd HH:mm:ss **/
    public static DateTimeFormatter FORMAT_1 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
    public static DateTimeFormatter FORMAT_2 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS");
    public static DateTimeFormatter FORMAT_3 = DateTimeFormat.forPattern("yyyy-MM-dd");
    public static DateTimeFormatter FORMAT_4 = DateTimeFormat.forPattern("yyyyMMdd");

    public static DateTime formatDate(String dateStr, DateTimeFormatter formatter) {
        if (StringUtils.isNotBlank(dateStr)) {
            return DateTime.parse(dateStr, formatter);
        }
        return null;
    }

    /**
     * format: yyyy-MM-dd
     *
     * @return
     */
    public static String getYesterDay() {
        return formatDate(System.currentTimeMillis() - DAY_MILLIS);
    }

    public static String today() {
        return formatDate(System.currentTimeMillis());
    }

    public static Date getYstrDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis() - DAY_MILLIS);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.SECOND);
        calendar.clear(Calendar.MILLISECOND);
        return calendar.getTime();
    }

    public static Date cutTail(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.SECOND);
        calendar.clear(Calendar.MILLISECOND);
        return calendar.getTime();
    }

    /**
     * 获取年份
     *
     * @param date(yyyy-MM-dd)
     * @return
     */
    public static Integer getYear(String date) {
        if (StringUtils.isNotBlank(date)) {
            String[] ts = StringUtils.split(date, "-");
            return Integer.valueOf(ts[0]);
        }
        return 0;
    }

    /**
     * 获取月份(yyyy-MM)
     *
     * @param date(yyyy-MM-dd)
     * @return
     */
    public static String getMonth(String date) {
        if (StringUtils.isNotBlank(date)) {
            return StringUtils.left(date, 7);
        }
        return null;
    }

    /**
     * 获取日期(dd)
     *
     * @param date(yyyy-MM-dd)
     * @return
     */
    public static String getDay(String date) {
        if (StringUtils.isNotBlank(date)) {
            return StringUtils.right(date, 2);
        }
        return null;
    }

    /**
     * 将日期yyyy-MM转换成可以比较的整形
     *
     * @param date
     * @return
     */
    public static int transComp(String date) {
        if (StringUtils.isNotBlank(date)) {
            String[] ds = StringUtils.split(date, "-");
            return NumberUtils.toInt(ds[0]) + NumberUtils.toInt(ds[1]);
        }
        return 0;
    }

    /**
     * 现在开始的往后的第gap个月(算当月)的开始时间
     *
     * @param millis 日期
     * @param gap
     * @return
     */
    public static Date lastXMonth(Long millis, int gap) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        //		calendar.add(Calendar.MONTH, (gap > 0) ? -gap + 1 : gap);
        calendar.add(Calendar.MONTH, -gap);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.SECOND);
        calendar.clear(Calendar.MILLISECOND);
        return calendar.getTime();
    }


    /**
     * 计算两个日期相差天数
     *
     * @param date1
     * @param date2
     * @return
     */
    public static long diffDays(Date date1, Date date2) {
        return (date1.getTime() - date2.getTime()) / DAY_MILLIS;
    }

    public static boolean isSameDay(long day1Millis, long day2Millis) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(day1Millis);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTimeInMillis(day2Millis);

        boolean isSameYear = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
        boolean isSameMonth = isSameYear && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
        boolean isSameDate = isSameMonth && cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
        return isSameDate;
    }

    public static Date nextYear(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(date.getTime());
        c.add(Calendar.YEAR, 1);
        return c.getTime();
    }
}
