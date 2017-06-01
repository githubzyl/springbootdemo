package com.example.demo.shiro;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public class MyFormAuthenticationFilter extends FormAuthenticationFilter {

	@Override
	protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
			ServletResponse response) throws Exception {
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		httpServletResponse.sendRedirect("/user/success");
		return false;
	}

	@Override
	protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request,
			ServletResponse response) {
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		try {
			httpServletResponse.sendRedirect("/user/fail");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return false;
	}

}
