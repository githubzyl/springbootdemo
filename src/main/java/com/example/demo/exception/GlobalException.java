package com.example.demo.exception;

import com.example.demo.enums.LoginError;
import com.example.demo.enums.ResultError;

public class GlobalException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String code;

    public GlobalException(ResultError resultError){
        super(resultError.getMessage());
        this.code = resultError.getCode();
    }
    
    public GlobalException(LoginError loginError){
    	super(loginError.getMessage());
    	this.code = loginError.getCode();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
}
