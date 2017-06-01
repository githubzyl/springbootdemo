package com.example.demo.enums;
/**
 * 登陆认证错误信息
 * @author: zhaoyl
 * @since: 2017年5月24日  下午1:48:22
 * @history:
 */
public enum ResultError {

	SUCCESS("0","成功")
	,REQUEST_ERROR("1","远程请求错误")
	,REMOTE_LOGIN_FAIL("2","远程登陆认证失败")
	;
	
	private String code;
	private String message;
	
	ResultError(String code, String message) {
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	
}
