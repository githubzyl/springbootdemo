package com.example.demo.enums;
/**
 * 登录验证错误消息
 * @author: zhaoyl
 * @since: 2017年6月1日  上午9:19:27
 * @history:
 */
public enum LoginError {

	LOGIN_SUCCESS("1000","登陆成功")
	,UNKNOWN_ACCOUNT("1001","用户名不存在")
	,INCORRECT_CREDENTIALS("1002","用户名或密码错误")
	,LOCKED_ACCOUNT("1003","账户已被锁定")
	,EXCESSIVE_ATTEMPTS("1004","登陆验证错误次数已达到上限")
	,DISABLED_ACCOUNT("1005","账户已被禁止登陆")
	,AUTHENTICATION_FAIL("1006","账户验证失败")
	;
	
	private String code;
	private String message;
	
	LoginError(String code, String message) {
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
