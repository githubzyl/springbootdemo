package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Result;
import com.example.demo.model.User;
import com.example.demo.service.PermissionService;
import com.example.demo.utils.ResultUtil;

@RestController
public class UserController {
		
    private final Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired  
	private PermissionService userService;
	
	/**
	 * 用户登陆
	 * @param parameter
	 * @param bindingResult
	 * @return
	 * @create: 2017年5月24日 下午2:13:03 zhaoyl
	 * @history:
	 */
	@PostMapping("/user/login")
	public Result login(String username,String password,HttpSession session){
		//验证  
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        //获取当前的Subject  
        Subject subject = SecurityUtils.getSubject();
        try {  
            //在调用了login方法后,SecurityManager会收到AuthenticationToken,并将其发送给已配置的Realm执行必须的认证检查  
            //每个Realm都能在必要时对提交的AuthenticationTokens作出反应  
            //所以这一步在调用login(token)方法时,它会走到MyRealm.doGetAuthenticationInfo()方法中,具体验证方式详见此方法  
        	subject.login(token);//完成登陆
        	User user = userService.findByUserName(username);
        	Session shiroSession = subject.getSession();
        	shiroSession.setAttribute("currentUser", user);
        	logger.info(subject.getSession().getAttribute("currentUser"));
        	//session.setAttribute("session_user", user);
        }catch(Exception e){ 
        	e.printStackTrace();
        	return ResultUtil.fail("-1", "验证未通过，登录失败");
        }
        return ResultUtil.success("登陆成功");
	}
	
	//登陆成功
	@GetMapping("/user/success")
	public Result success(){
		return ResultUtil.success("登陆成功"); 
	}
	
	//登陆失败
	@GetMapping("/user/fail")
	public Result fail(){
		return ResultUtil.success("登陆失败");
	}
	
	@GetMapping("/user/logout")
    public Result logOut(HttpSession session) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        logger.info(subject.getSession().getAttribute("currentUser"));
	    //session.removeAttribute("session_user");
        return ResultUtil.success("安全退出成功");
    }
	
}
