package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enums.LoginError;
import com.example.demo.exception.GlobalException;
import com.example.demo.model.Result;
import com.example.demo.model.User;
import com.example.demo.service.PermissionService;
import com.example.demo.utils.DataModel;
import com.example.demo.utils.Pager;
import com.example.demo.utils.ResultUtil;

@RestController
public class UserController {
		
    private final Logger logger = Logger.getLogger(UserController.class);
    
    @Value("${login.error.retryCount}")
	private Integer retryCount;//登陆出错上限次数
	
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
	public Result login(String username,String password,HttpServletRequest request){
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
        	//request.getSession().setAttribute("session_user", user);
        }catch(UnknownAccountException uae){
        	throw new GlobalException(LoginError.UNKNOWN_ACCOUNT);
        }catch(IncorrectCredentialsException ice){  
            throw new GlobalException(LoginError.INCORRECT_CREDENTIALS);
        }catch(LockedAccountException lae){  
            throw new GlobalException(LoginError.LOCKED_ACCOUNT);
        }catch(ExcessiveAttemptsException eae){ 
        	LoginError et = LoginError.EXCESSIVE_ATTEMPTS;
        	et.setMessage(et.getMessage() + retryCount + "次");
            throw new GlobalException(et);
        }catch (DisabledAccountException sae){  
        	throw new GlobalException(LoginError.DISABLED_ACCOUNT); 
        }catch(AuthenticationException ae){  
            //通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景  
            logger.info("堆栈轨迹如下");  
            throw new GlobalException(LoginError.AUTHENTICATION_FAIL); 
             
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
    public Result logOut(HttpServletRequest request) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        logger.info(subject.getSession().getAttribute("currentUser"));
	    //request.getSession().removeAttribute("session_user");
        return ResultUtil.success("安全退出成功");
    }
	
	@GetMapping("/list")
	public DataModel<User> list(User user, int page, int rows){
		DataModel<User> data = new DataModel<>();
		Pager<User> pager = userService.queryUserForPage(user, page, rows);
		logger.info("数据总条数："+pager.getTotalRow());
		logger.info("数据总页数："+pager.getTotalPage());
		logger.info("当前页数："+pager.getCurPage());
		logger.info("每页条数："+pager.getPageSize());
		data.setTotal(pager.getTotalPage());
		data.setResult(pager.getResult());
		return data;
	}
}
