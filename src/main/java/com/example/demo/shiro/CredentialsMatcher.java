package com.example.demo.shiro;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.springframework.beans.factory.annotation.Value;

public class CredentialsMatcher extends SimpleCredentialsMatcher {
	
	@Value("${login.error.retryCount}")
	private Integer retryCount;//登陆出错上限次数

	private Cache<String, AtomicInteger> passwordRetryCache;

	public CredentialsMatcher(CacheManager cacheManager) {  
        passwordRetryCache = cacheManager.getCache("passwordRetryCache");  
    }

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		UsernamePasswordToken utoken = (UsernamePasswordToken) token;
		// 获取用户名
		String username = (String) token.getPrincipal();
		// 获取登录记录次数
		AtomicInteger atomicInteger = passwordRetryCache.get(username);
		if(null == atomicInteger){
			atomicInteger=  new AtomicInteger(0);
			passwordRetryCache.put(username, atomicInteger);
		}
		if(atomicInteger.incrementAndGet() > retryCount){//登陆次数已达到上限
			throw new ExcessiveAttemptsException();
		}
		// 获得用户输入的密码:(可以采用加盐(salt)的方式去检验)
		String inPassword = new String(utoken.getPassword());
		// 获得数据库中的密码
		String dbPassword = (String) info.getCredentials();
		// 进行密码的比对
		boolean matches = this.equals(inPassword, dbPassword);
		if(matches){
			passwordRetryCache.remove(username);
		}
		return matches;
	}

}
