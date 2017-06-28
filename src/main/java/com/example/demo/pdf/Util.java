package com.example.demo.pdf;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.example.demo.utils.BeanUtilEx;

/** 公共工具类.
 * @since: 2014年2月18日 下午1:53:26
 * @history:
 */
public class Util {

    /**
     * @Fields LOGGER : 日志
     */
    private static final Log LOGGER = LogFactory.getLog(Util.class);

    /**
     * 获取日期字符串.
     * @param date 需要转换成字符串的日期类型
     * @return yyyyMMdd 日期字符串格式
     * @history:
     */
    public static String getDateString(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        return df.format(date);
    }

    /**
     * @Fields NUMBERS : 数字字符
     */
    public static final char[] NUMBERS = new char[] { '0', '1', '2', '3', '4',
            '5', '6', '7', '8', '9' };

    /**
     * 生成纯数字的随机验证码.
     * @param count 位数
     * @return 随机验证码
     */
    public static String randomCode(int count) {
        StringBuffer code = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            code.append(NUMBERS[random.nextInt(NUMBERS.length) % NUMBERS.length]);
        }
        return code.toString();
    }

    /**
     * 将日历对象转化为yyyy-MM-dd格式字符串.
     * @param calendar 日历对象
     * @return yyyy-MM-dd格式字符串.
     * @history:
     */
    // public static String calendar2DateString(Calendar calendar) {
    // // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    // // return sdf.format(calendar.getTime());
    // return com.hundsun.internet.iasp.db.core.common.Util
    // .calendar2DateString(calendar);
    // }

    /**
     * 将日历对象转化为"yyyy-MM-dd HH:mm:dd格式字符串.
     * @param calendar 日历对象
     * @return "yyyy-MM-dd HH:mm:dd格式字符串.
     * @history:
     */
    // public static String calendar2DateTimeString(Calendar calendar) {
    // // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
    // // return sdf.format(calendar.getTime());
    // return com.hundsun.internet.iasp.db.core.common.Util
    // .calendar2DateTimeString(calendar);
    // }

    /**
     * 将yyyy-MM-dd格式字符串转化为日历对象.
     * @param dateString yyyy-MM-dd格式字符串
     * @return 日历对象
     * @history:
     */
    public static Calendar dateString2Calendar(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        Date date;
        try {
            date = sdf.parse(dateString);
            calendar.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return calendar;
    }

    /**将yyyy-MM-dd 00:00:00格式字符串转化为日历对象.
     * @param dateString 日期字符串
     * @return Calendar
     * @history:
     */
    public static Calendar string2Calendar(String dateString) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        Date date;
        try {
            date = sdf.parse(dateString);
            calendar.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return calendar;
    }

    /**
     * 将日历对象转化为yyyy-MM-dd格式字符串.
     * @param calendar 日历对象
     * @return yyyy-MM-dd格式字符串.
     * @history:
     */
    public static String calendar2DateString(Calendar calendar) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(calendar.getTime());
    }

    /**将cal转行成格式yyyy-MM-dd 00:00:00.
     * @param calendar Calendar
     * @return Date
     * @throws ParseException ParseException
     * @history:
     */
    public static Date calendar2Date(Calendar calendar) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        return sdf.parse(sdf.format(calendar.getTime()));
    }

    /**将string日期类型转换为Date类型 并格式化成yyyy-MM-dd.
     * @param dateString String类型的时间
     * @return Date
     * @history:
     */
    public static Date string2DateWithOutHHmmss(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = sdf.parse(dateString);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**将string日期类型转换为Date类型 并格式化成yyyy-MM-dd HH:mm:ss.
     * @param dateString String类型的时间
     * @return Date
     * @history:
     */
    public static Date string2DateWithHHmmss(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date date = sdf.parse(dateString);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**将string日期类型转换为Date类型 并格式化成yyyy-MM.
     * @param dateString String类型的时间
     * @return Date
     * @history:
     */
    public static Date string2DateWithMM(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

        try {
            Date date = sdf.parse(dateString);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**将string日期类型格式化成yyyy-MM,返回String.
     * @param dateString String类型的时间
     * @return string
     * @history:
     */
    public static String timeFormatWithMM(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

        try {
            Date date = sdf.parse(dateString);
            return sdf.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**将Date日期类型转换为String类型 并格式化成yyyy-MM-dd HH:mm:ss.
     * @param date Date型日期
     * @return String
     * @throws ParseException
     * @history:
     */
    public static String date2StringWithHHmmss(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = sdf.format(date);
        return dateString;
    }

    /**将Date日期类型转换为String类型 并格式化成yyyy-MM-dd.
     * @param date Date型日期
     * @return String
     * @throws ParseException
     * @history:
     */
    public static String date2StringWithOutHHmmss(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = sdf.format(date);
        return dateString;
    }

    /**将Date类型格式化成yyyy-MM-dd.
     * @param date 格式化的日期
     * @return Date
     * @history:
     */
    public static Date DateFormatWithOutHHmmss(Date date) {
        String time = date2StringWithOutHHmmss(date);
        return string2DateWithOutHHmmss(time);
    }

    /**四舍五入 保留1位小数,.
     * @param num double类型数据
     * @return String
     * @history:
     */
    public static String keepOneDecimal2String(double num) {

        BigDecimal bd = new BigDecimal(String.valueOf(num));
        BigDecimal bd2 = bd.setScale(1, BigDecimal.ROUND_HALF_UP);
        return bd2.toString();
    }

    /**四舍五入  保留2位小数.
     * @param num double类型数据
     * @return String
     * @history:
     */
    public static String keepTwoDecimal2String(double num) {

        BigDecimal bd = new BigDecimal(String.valueOf(num));
        BigDecimal bd2 = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd2.toString();
    }

    /**四舍五入 保留1位小数 返回double类型数据.
     * @param num double类型数据
     * @return double
     * @history:
     */
    public static double keepOneDecimal2Double(double num) {
        BigDecimal bd = new BigDecimal(String.valueOf(num));
        BigDecimal bd2 = bd.setScale(1, BigDecimal.ROUND_HALF_UP);
        return bd2.doubleValue();
    }

    /**四舍五入 保留2位小数 返回double类型数据.
     * @param num double类型数据
     * @return double
     * @history:
     */
    public static double keepTwoDecimal2Double(double num) {
        BigDecimal bd = new BigDecimal(String.valueOf(num));
        BigDecimal bd2 = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd2.doubleValue();
    }

    /**四舍五入 保留1位小数 返回BigDecimal类型数据.
     * @param num double类型数据
     * @return BigDecimal
     * @history:
     */
    public static BigDecimal keepOneDecimal2BigDecimal(double num) {
        BigDecimal bd = new BigDecimal(String.valueOf(num));
        BigDecimal bd2 = bd.setScale(1, BigDecimal.ROUND_HALF_UP);
        return bd2;
    }

    /**四舍五入 保留2位小数 返回BigDecimal类型数据.
     * @param num double类型数据
     * @return BigDecimal
     * @history:
     */
    public static BigDecimal keepTwoDecimal2BigDecimal(double num) {
        BigDecimal bd = new BigDecimal(String.valueOf(num));
        BigDecimal bd2 = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd2;
    }

    /**将double类型转换成BigDecimal.
     * @param num double类型数据
     * @return BigDecimal
     * @history:
     */
    public static BigDecimal double2BigDecimal(double num) {
        BigDecimal bd = new BigDecimal(String.valueOf(num));
        return bd;
    }

    /**
     * @Fields LOWER : 小写
     */
    private static final String LOWER = ".*[a-z].*";

    /**
     * @Fields UPPER : 大写
     */
    private static final String UPPER = ".*[A-Z].*";

    /**
     * @Fields DIGIT : 字数
     */
    private static final String DIGIT = ".*[0-9].*";

    /**
     * @Fields DIGITS : 多数字
     */
    private static final String DIGITS = ".*[0-9].*[0-9].*";

    /**
     * @Fields SPECIAL : 特殊字符
     */
    private static String SPECIAL = ".*[^a-zA-Z0-9].*";

    /**
     * @Fields SAME : 相同
     */
    private static String SAME = "^(.)\\1+$";

    /**计算密码强度.
     * @param password 密码
     * @return int
     * @history:
     */
    public static int calculatePwdLevel(String password) {
        if (password == null) {
            return 0;
        }
        if (password.length() < 6) {
            return 0;
        }
        if (password.matches(SAME)) {
            return 1;
        }
        boolean lower = password.matches(LOWER), upper = (password.substring(0,
            1).toLowerCase() + password.substring(1)).matches(UPPER), digit = password
            .matches(DIGIT), digits = password.matches(DIGITS), special = password
            .matches(SPECIAL);
        if (lower && upper && digit || lower && digits || upper && digits
                || special) {
            return 4;
        }
        if (lower && upper || lower && digit || upper && digit) {
            return 3;
        }
        return 2;
    }

    /**
     * 将yyyy-MM-dd HH:mm:dd格式字符串转化为日历对象.
     * @param dateString yyyy-MM-dd HH:mm:dd格式字符串
     * @return 日历对象
     * @throws ParseException 异常
     * @history:
     */
    public static Calendar dateTimeString2Calendar(String dateString)
            throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(dateString);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /**
     * 将父类中的值填充到之类.
     * @param parent 父类
     * @param child 子类
     * @history:
     */
    public static void putParentBean2ChildBean(Object parent, Object child) {
        // 不需要的自己去掉即可
        if (parent != null && child != null) {
            // 拿到该类
            Class<?> clz = parent.getClass();
            // 获取实体类的所有属性，返回Field数组
            Field[] fields = clz.getDeclaredFields();

            for (Field field : fields) {
                String fieldType = field.getGenericType().toString();
                try {
                    // 拿到该属性的gettet方法
                    Method pm = (Method) parent.getClass().getMethod(
                        "get" + getMethodName(field.getName()));
                    Method cm = null;
                    if (fieldType.equals("int")) {
                        cm = (Method) child.getClass().getMethod(
                            "set" + getMethodName(field.getName()), int.class);
                    } else if (fieldType.equals("float")) {
                        cm = (Method) child.getClass()
                            .getMethod("set" + getMethodName(field.getName()),
                                float.class);
                    } else if (fieldType.equals("double")) {
                        cm = (Method) child.getClass().getMethod(
                            "set" + getMethodName(field.getName()),
                            double.class);
                    } else {
                        cm = (Method) child.getClass().getMethod(
                            "set" + getMethodName(field.getName()),
                            Class.forName(fieldType.substring(
                                fieldType.indexOf(" ") + 1).trim()));
                    }

                    // 调用getter方法获取属性值
                    Object val = (Object) pm.invoke(parent);

                    // 调用setter方法设置值
                    cm.invoke(child, val);
                } catch (Exception ex) {
                    // 不做任何处理
                    continue;
                }
            }
        }
    }

    /**把一个字符串的第一个字母大写、效率是最高的.
     * @param fildeName 传递过来的方法名
     * @return String
     * @throws Exception 抛出的异常
     */
    private static String getMethodName(String fildeName) throws Exception {
        byte[] items = fildeName.getBytes();
        items[0] = (byte) ((char) items[0] - 'a' + 'A');
        return new String(items);
    }

    /**
     * 自动去除BEAN对象中的String类型的前后空格.
     * @param object 对象
     * @history:
     */
    public static void autoTrim(Object object) {
        // 不需要的自己去掉即可
        if (object != null) {
            // 拿到该类
            Class<?> clz = object.getClass();
            // 获取实体类的所有属性，返回Field数组
            Field[] fields = clz.getDeclaredFields();

            for (Field field : fields) {
                String fieldType = field.getGenericType().toString();
                if (fieldType.equals("class java.lang.String")) {
                    try {
                        // 拿到该属性的gettet方法
                        Method pm = (Method) object.getClass().getMethod(
                            "get" + getMethodName(field.getName()));

                        Method cm = (Method) object.getClass().getMethod(
                            "set" + getMethodName(field.getName()),
                            Class.forName(fieldType.substring(
                                fieldType.indexOf(" ") + 1).trim()));

                        // 调用getter方法获取属性值
                        String val = (String) pm.invoke(object);
                        val.trim();
                        // 调用setter方法设置值
                        cm.invoke(object, val);
                    } catch (Exception ex) {
                        // 不做任何处理
                        continue;
                    }
                }
            }
        }
    }

    /**MD5加密.
     * @param s 传过来的参数
     * @return String
     * @history:
     */
    public static String encodeMD5(String s) {
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F' };
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char[] str = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**获取request中对应name的cookie值.
     * @param name cookie的name
     * @param request HttpServletRequest
     * @return String 找不到的时候返回""
     * @history:
     */
    public static String getCookieByName(String name, HttpServletRequest request) {
        String value = "";
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals(name)) {
                    value = cookies[i].getValue();
                }
            }
        }

        return value;
    }

    /**检测字符是否含有特殊字符.
     * @param chars 字符
     * @return boolean
     * @history:
     */
    public static boolean checkSpechars(String chars) {
        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(chars);
        String newChars = m.replaceAll("").trim();
        // 如果新字符长度小于原字符长度，说明含有特殊字符
        if (newChars.length() < chars.length()) {
            return true;
        }
        return false;
    }

    /**
     * 校验机构名称
     * @param chars
     * @return
     */
    public static boolean checkCommanyName(String chars){
    	 String regex = "^([a-zA-Z0-9_\u4e00-\u9fa5]{4,30})$";
         if (StringUtils.isNotEmpty(chars) && chars.matches(regex)) {
             return true;
         }
         return false;
    }
    
    /**
     * 校验昵称
     * @param chars
     * @return
     */
    public static boolean checkUserNikeName(String chars){
   	 String regex = "^([a-zA-Z0-9_\u4e00-\u9fa5]{1,30})$";
        if (StringUtils.isNotEmpty(chars) && chars.matches(regex)) {
            return true;
        }
        return false;
   }
    
    
    public static boolean checkMobileNikeName(String password){
    	String pawVal = "^[\\u4E00-\\u9FA5a-zA-Z0-9_]+$";
		Pattern pattern = Pattern.compile(pawVal);
		Matcher matcher = pattern.matcher(password);
		boolean b = matcher.matches();
		return b;
    }
    
    
    
    /**除去所有空格.
     * @param chars 字符
     * @return String
     * @history:
     */
    public static String replaceBlank(String chars) {
        String regEx = "[ ]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(chars);
        return m.replaceAll("").trim();
    }

    /**
     *破除逆向代理等获取不到正确ip
     * @param request
     * @return
     * @history:
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }


    /**验证码加密.
     * @param code 验证码
     * @return String
     * @history:
     */
    public static String lockCode(String code) {
        return encodeMD5(disguiseCode(code));
    }

    /**动态密码加盐.
     * @param code 动态密码
     * @param userName 用户名
     * @param time 注册时间
     * @return String
     * @history:
     */
    public static String codeAddSolt(String code, String userName, String time) {
        return userName + "_" + time + "_" + code;
    }

    /**验证码加盐.
     * @param code 验证码
     * @return String
     * @history:
     */
    private static String disguiseCode(String code) {
        return "$*&^8^&(-" + code + "&9^_^%@!-)";
    }

    /**异步返回.
     * @param str 字符串
     * @param response 相应
     * @param contentType contentType
     * @history:
     */
    public static void asynAction(String str, HttpServletResponse response,
            String contentType) {
        if (StringUtils.isBlank(contentType)) {
            contentType = "text/html;charset=UTF-8";
        }
        try {
            response.setContentType(contentType);
            PrintWriter out = response.getWriter();
            out.write(str); // 后加
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**用jsonp包装str.
     * @param str str
     * @param callback callback
     * @return jsonp
     * @history:
     */
    public static String jsonp(String str, String callback) {
        // 防止xss攻击
        String jsonp = "";
        if (callback.indexOf("<") < 0 && callback.indexOf(">") < 0
                && callback.indexOf("\"") < 0 && callback.indexOf("&") < 0) {
            jsonp = "typeof " + callback + " === 'function' && " + callback
                    + "(" + str + ")";
        } else {
            jsonp = "typeof callback === 'function' && " + "callback(" + str
                    + ")";
        }
        return jsonp;
    }

    /**正则验证参数是否是手机号.
     * @param param 验证参数
     * @return boolean
     * @history:
     */
    public static boolean checkMobile(String param) {
        String regex = "^(1[3-9][0-9])\\d{8}$";
        if (StringUtils.isNotEmpty(param) && param.matches(regex)) {
            return true;
        }
        return false;
    }

    /**正则验证邮箱是否正确.
     * @param email 邮箱
     * @return 匹配成功返回true 匹配失败返回false
     * @history:
     */
    public static boolean checkMail(String email) {
        String regex = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        if (StringUtils.isNotEmpty(email) && email.matches(regex)) {
            return true;
        }
        return false;
    }

    /**正则验证name只能匹配中文，数字，字母，下划线.
     * @param name 名称
     * @return 匹配成功返回true 匹配失败返回false
     * @history:
     */
    public static Boolean checkName(String name) {
        String regex = "^[a-zA-Z0-9_\u4e00-\u9fa5]+$";
        if (StringUtils.isNotEmpty(name) && name.matches(regex)) {
            return true;
        }
        return false;
    }

    /**检查用户名是否为8为数字.
     * @param param 验证参数
     * @return boolean
     * @history:
     */
    public static boolean checkUserName(String param) {
        String regex = "^\\d{8}$";
        String regex2 = "^\\d{9}$";
        String regex3 = "^\\d{10}$";
        String regex4 = "^\\d{6}$";
        String regex5 = "^\\d{7}$";
        String regex6 = "^\\d{11}$";
        String regex7 = "^\\d{12}$";
        if (StringUtils.isEmpty(param)) {
            return false;
        }
        if (param.matches(regex) || param.matches(regex2)
                || param.matches(regex3) || param.matches(regex4)
                || param.matches(regex5) || param.matches(regex6)
                || param.matches(regex7)) {
            return true;
        }
        return false;
    }

    /**input流转字符串.
     * @param is 流
     * @param charset 编码格式
     * @return string
     * @history:
     */
    public static String inputStream2String(InputStream is, String charset) {
        ByteArrayOutputStream baos = null;

        try {
            baos = new ByteArrayOutputStream();
            int i = -1;
            while ((i = is.read()) != -1) {
                baos.write(i);
            }
            return baos.toString(charset);
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER
                .error("FileWRUtil.inputStream2String(InputStream is, String charset) occur error:"
                        + e.getMessage());
        } finally {
            if (null != baos) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    LOGGER
                        .error("FileWRUtil.inputStream2String(InputStream is, String charset) occur error:"
                                + e.getMessage());
                }
                baos = null;
            }
        }

        return null;
    }

    /**判断当前环境是否为开发、测试环境.
     * @param request 请求
     * @return 是否
     * @history:
     */
    public static boolean isTest(HttpServletRequest request) {
        StringBuffer url = request.getRequestURL();
        if (StringUtils.contains(url.toString(), "192.168.50.69")
                || StringUtils.contains(url.toString(), "localhost")) {
            return true;
        }
        return false;
    }

    /**判断请求是否是异步.
     * @param request 请求
     * @return 是否
     * @history:
     */
    public static boolean ifAjax(HttpServletRequest request) {
        if (request.getHeader("x-requested-with") == null) {
            return false;
        }
        return true;
    }

    /**
     * 获取用户发送信息中的@所有人;
     * @param content
     * @return 
     * @history:
     */
    public static List<String> getAtUserList(String content) {
        List<String> list = new ArrayList<String>();
        // @
        Pattern AT_PATTERN = Pattern.compile("@[\\u4e00-\\u9fa5\\w\\-]+");
        Matcher m = AT_PATTERN.matcher(content);
        while (m.find()) {
            list.add(m.group().replace("@", ""));
        }
        return list;
    }

    /**
     * 获取用户发送信息中$的所有产品
     * @param content
     * @return 
     * @history:
     */
    public static List<String> getDollarList(String content) {
        List<String> list = new ArrayList<String>();
        Pattern _PATTERN = Pattern.compile("\\$[\\u4e00-\\u9fa5\\w\\-\\(\\)\"\\_\\+\\.[*]\\//]+");
        Matcher dm = _PATTERN.matcher(content);
        while (dm.find()) {
            String dollName = dm.group().trim();
            if (!dollName.equals("$我的基金")) {
                list.add(dollName.replace("$", ""));
            }
        }
        return list;
    }
    
    public static String processContetDollarToPlaceholder(String content,List<Map<String,Object>> dollIdList){
        Pattern pattern = Pattern.compile("\\$[\\u4e00-\\u9fa5\\w\\-\\(\\)\"\\_\\+\\.[*]\\//]+");   
        Matcher matcher = pattern.matcher(content);   
        StringBuffer sb = new StringBuffer();   
        StringBuffer sbb = new StringBuffer();
        for(Map<String,Object> m : dollIdList){
            sbb.append("$"+m.get("name")).append(",");
        }
        String temp = sbb.toString();
        boolean result1 = matcher.find();  
        int i = 0;
        while (result1) {
            if(temp.indexOf(matcher.group().trim().toString()+",") != -1){
                matcher.appendReplacement(sb, "{"+i+"}");  
                i++;
            }
            result1 = matcher.find();   
        }   
        matcher.appendTail(sb);   
        return sb.toString();   
    }
    
    /**
     * 获取用户发送信息中的所有表情
     */
    public static List<String> getFaceList(String content) {
        List<String> list = new ArrayList<String>();
        Pattern _PATTERN = Pattern.compile("\\[[\\u4e00-\\u9fa5\\w\\-]+\\]");
        Matcher dm = _PATTERN.matcher(content);
        while (dm.find()) {
            list.add(dm.group().replaceAll("\\[", "").replaceAll("\\]", ""));
        }
        return list;
    }

    /**
     * 替换内容中的http https ftp /r /n < >等链接
     * @param content
     * @return 
     * @history:
     */
    public static String removeURLFromContent(String content) {
        return HtmlRegexpUtil
            .filterHtml(content).replaceAll(
                "(http://|ftp://|https://|www)[\\w]+[^\u4e00-\u9fa5\\s]*?[^\u4e00-\u9fa5\\s]*",
                "").replaceAll ("\\t|\\r|\\n", "");
    }

    
    public static Object changeDbMaptoBean(Map dbMap, Object dest) {
        Map beanMap = new HashMap();

        Iterator ite = dbMap.keySet().iterator();
        while (ite.hasNext()) {
            String key = ite.next().toString();
            beanMap.put(changeToBeanName(key), dbMap.get(key));
        }
        try {
            BeanUtilEx.copyProperties(dest, beanMap);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return dest;
    }

    public static String changeToBeanName(String ori) {
        String retString = "";

        String[] strs = ori.split("_");
        retString = strs[0];

        for (int i = 1; i < strs.length; i++) {
            byte[] items = strs[i].getBytes();
            items[0] = (byte) ((char) items[0] - 'a' + 'A');
            retString += new String(items);
        }

        return retString;
    }

    public static String subString(String str, int maxLength) {
        String ret = "";

        ret = StringUtils.substring(str, 0, maxLength);
        if (maxLength < str.length()) {
            ret += "...";
        }

        return ret;
    }

    /**手机号替换*.
     * @param mobile 手机号
     * @param first 保留开头数字的位数
     * @param end 保留结尾数字的额位数
     * @return String
     * @history:
     */
    public static String mobileReplace(String mobile, int first, int end) {
        if (checkMobile(mobile)) {
            int len = mobile.length();
            if (first + end < len) {
                mobile = mobile.replaceAll("(?<=\\d{" + first + "})\\d(?=\\d{"
                        + end + "})", "*");
            }
        }
        return mobile;

    }
    /**
     * 替换指定位数星号
     * @param card
     * @param first
     * @param end
     * @return 
     * @history:
     */
    public static String cardReplace(String card, int first, int end) {
           int len = card.length();
            if (first + end < len) {
                card = card.replaceAll("(?<=\\d{" + first + "})\\d(?=\\d{"
                        + end + "})", "*");
            }
        return card;
    }
    
    

    /**正则匹配url地址.
     * @param url url地址
     * @return boolean
     * @history:
     */
    public static boolean checkUrl(String url) {
        String regex = "(http|www|)?(://)?(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*((:\\d+)?)(/(\\w+(-\\w+)*))*(\\.?(\\w)*)(\\?)?(((\\w*%)*(\\w*\\?)*(\\w*:)*(\\w*\\+)*(\\w*\\.)*(\\w*&)*(\\w*-)*(\\w*=)*(\\w*%)*(\\w*\\?)*(\\w*:)*(\\w*\\+)*(\\w*\\.)*(\\w*&)*(\\w*-)*(\\w*=)*)*(\\w*)*)";
        if (StringUtils.isNotEmpty(url) && url.matches(regex)) {
            return true;
        }
        return false;
    }
    
    /**
     * 过滤html实体
     * @param htmlstr
     * @return
     */
    public static String ltgtStr(String htmlstr){
    	if(htmlstr != null){
    		return htmlstr.replace("<script>", "&lt;script&gt;").
    				replace("</script>", "&lt;/script&gt;").
    				replace("alert(\"", "alert(&quot;").replace("\")", "&quot;)");
    	}
    	return null;
    }

    /**计算time前/后year的日期.
     * @param time 初始化的日期
     * @param year推迟或提前的多少年
     * @return Date
     * @history:
     */
    public static Date getYearCustomTime(Date time, int year) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(time);
        cal.add(Calendar.YEAR, year);
        return cal.getTime();
    }
    
    /**
     * 移除输入中Emoji表情
     * @param str
     * @return 
     * @history:
     */
    public static String removeNonBmpUnicode(String str) {    
        if (str == null) {    
            return null;    
        }    
        str = str.replaceAll("[^\\u0000-\\uFFFF]", "");    
       return str;    
     }    
    
}
