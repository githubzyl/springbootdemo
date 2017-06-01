package com.example.demo.model;

/**
 * 返回前端结果
 * @author: zhaoyl
 * @since: 2017年5月24日  下午1:52:11
 * @history:
 */
public class Result {

    private String code;

    private String msg;

    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
