package com.example.demo.controller.fund;

import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;

import com.example.demo.pdf.HtmlReplaceUtil;

public class IsmBaseController {
    public static final String ERROR_MSG = "error";

    /**
     * 正常
     */
    public static final int HTTP_STATE_CODE_OK = 200;

    /**
     * 未发现
     */
    public static final int HTTP_STATE_CODE_NO_FOUND = 404;

    /**
     * 异常
     */
    public static final int HTTP_STATE_CODE_ERROR = 500;

    /**
     * 带参数重定向.并带HTML字符串替换
     * @param uri
     * @param model
     * @param isRedirect
     * @param htmlReplace
     * @return
     */
    protected String go(String uri, Model model, boolean isRedirect,
            boolean htmlReplace) {
        if (htmlReplace) {
            // html替换
            HtmlReplaceUtil util = new HtmlReplaceUtil();
            Map map = model.asMap();
            java.util.Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                try {
                    String key = it.next().toString();
                    Object object = map.get(key);
                    Object value = util.replaceHtml(object);
                    if (object instanceof String && value != null) {
                        model.addAttribute(key, value);
                    }
                } catch (Exception ex) {
                }
            }
        }

        if (isRedirect) {
            // 移除一些不必要的参数
            model.asMap().remove("title");
            model.asMap().remove("ctx");
            model.asMap().remove("urlToken");
            model.asMap().remove("curUri");
            model.asMap().remove("ver");
            return "redirect:" + uri;
        } else {
            return uri;
        }
    }

    protected static String replaceRNStr(String input) {
        if (!StringUtils.isEmpty(input)) {
            return input.replaceAll("\r\n", "");
        }
        return "";
    }

    public String replaceAllSearch(String key) {
        if (StringUtils.isEmpty(key))
            return "";
        return StringEscapeUtils.escapeSql(key).replaceAll("%", "\\\\%")
            .replaceAll("_", "\\\\_").replaceAll("'", "\\\\'");
    }
}
