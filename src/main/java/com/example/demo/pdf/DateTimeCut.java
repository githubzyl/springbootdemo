package com.example.demo.pdf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeCut {
    public static Date getYearMonthDay(Date date, Integer yearOffset,
            Integer monthOffset, Integer dayOffset) {
        Calendar c = Calendar.getInstance();
        if (date != null)
            c.setTime(date);
        if (yearOffset != null)
            c.add(Calendar.YEAR, yearOffset);
        if (monthOffset != null) {
            c.add(Calendar.MONTH, monthOffset + 1);
        }
        if (dayOffset != null)
            c.add(Calendar.DAY_OF_MONTH, dayOffset);
        return c.getTime();
    }

    /**
     * 获取6个月前的时间
     * @return 
     * @create: 2015年12月21日 下午2:56:33 lyuanx
     * @history:
     */
    @Deprecated
    public static Date getSixMonthAge() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -6);
        return c.getTime();
    }

    /**
     * 获取  最原始开始时间  3年
     * @param curDate
     * @param inputEndDate
     * @return
     * @throws ParseException
     */
    public static Date cut36MonthBefore(Date curDate, Date inputEndDate)
            throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(curDate);
        int days = cal.get(Calendar.DAY_OF_MONTH);// 当月第几天
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int newYear = year - 3;
        String newDate = "";
        if (days == 29 && month == 2) {
            newDate = newYear + "-" + month + "-28 00:00:00";
        } else {
            newDate = sdf.format(curDate).replace(year + "", newYear + "")
                    + " 00:00:00";
        }
        Date threeYearAgo = sdf.parse(newDate);
        Date inputDate = sdf.parse(sdf.format(inputEndDate) + " 00:00:00");
        if (inputDate.getTime() - threeYearAgo.getTime() < 0)
            return threeYearAgo;
        else
            return inputDate;
    }

    public static Date Cut37MonthBefore(Date curDate, Date inputEndDate)
            throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.setTime(curDate);
        int days = cal.get(Calendar.DAY_OF_MONTH);// 当月第几天
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int newYear = year - 3;
        month -= 1;
        if (month < 1) {
            month = 12;
            newYear = year - 4;
        }
        String newDate = "";
        if (days == 29 && month == 2) {
            newDate = newYear + "-" + month + "-28 00:00:00";
        } else {
            newDate = sdf.format(curDate).replace(year + "", newYear + "");
        }
        Date threeYearAgo = sdf.parse(newDate);
        if (inputEndDate.getTime() - threeYearAgo.getTime() < 0)
            return threeYearAgo;
        else
            return inputEndDate;
    }

}
