package com.example.demo.shiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Module;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.PermissionService;

public class AuthRealm extends AuthorizingRealm {
	
	@Autowired
	private PermissionService userService;

	// 认证.登录
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken utoken = (UsernamePasswordToken) token;// 获取用户输入的token
		String username = utoken.getUsername();
		User user = userService.findByUserName(username);
		if(null == user){
			//用户名不存在（账户未找到）
			throw new UnknownAccountException();  
		}
		if(1 == user.getStatus()){
			//账户已被锁定
			throw new LockedAccountException();
		}
		// 放入shiro.调用CredentialsMatcher检验密码
		return new SimpleAuthenticationInfo(user, user.getPassword(), this.getClass().getName());
	}

	// 授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
		User user = (User) principal.fromRealm(this.getClass().getName()).iterator().next();// 获取session中的用户
		List<String> permissions = new ArrayList<>();
		Set<Role> roles = userService.getRolesByUserId(user.getId());
		if (roles.size() > 0) {
			for (Role role : roles) {
				Set<Module> modules = role.getModules();
				if (modules.size() > 0) {
					for (Module module : modules) {
						permissions.add(module.getMname());
					}
				}
			}
		}
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		// 将权限放入shiro中.
		info.addStringPermissions(permissions);
		return info;
	}

}
