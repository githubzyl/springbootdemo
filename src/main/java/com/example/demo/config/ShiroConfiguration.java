package com.example.demo.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.example.demo.shiro.AuthRealm;
import com.example.demo.shiro.CredentialsMatcher;
import com.example.demo.shiro.MyShiroFilterFactoryBean;

/**
 * Shiro 配置 Apache Shiro 核心通过 Filter 来实现，就好像SpringMvc 通过DispachServlet 来主控制一样。
 * 既然是使用 Filter 一般也就能猜到，是通过URL规则来进行过滤和权限校验，所以我们需要定义一系列关于URL的规则和访问权限。 Created by
 * sun on 2017-4-2.
 */
/*
 * 1.LifecycleBeanPostProcessor，这是个DestructionAwareBeanPostProcessor的子类，
 * 负责org.apache.shiro.util.Initializable类型bean的生命周期的，初始化和销毁。
 * 主要是AuthorizingRealm类的子类，以及EhCacheManager类。
 * 2.HashedCredentialsMatcher，这个类是为了对密码进行编码的，防止密码在数据库里明码保存，当然在登陆认证的生活，
 * 这个类也负责对form里输入的密码进行编码。
 * 3.ShiroRealm，这是个自定义的认证类，继承自AuthorizingRealm，负责用户的认证和权限的处理， 可以参考JdbcRealm的实现。
 * 4.EhCacheManager，缓存管理，用户登陆成功后，把用户信息和权限信息缓存起来，然后每次用户请求时，放入用户的session中，
 * 如果不设置这个bean，每个请求都会查询一次数据库。
 * 5.SecurityManager，权限管理，这个类组合了登陆，登出，权限，session的处理，是个比较重要的类。
 * 6.ShiroFilterFactoryBean，是个factorybean，为了生成ShiroFilter。它主要保持了三项数据，
 * securityManager，filters，filterChainDefinitionManager。
 * 7.DefaultAdvisorAutoProxyCreator，Spring的一个bean，由Advisor决定对哪些类的方法进行AOP代理。
 * 8.AuthorizationAttributeSourceAdvisor，shiro里实现的Advisor类，
 * 内部使用AopAllianceAnnotationsAuthorizingMethodInterceptor来拦截用以下注解的方法。
 */
@Configuration
public class ShiroConfiguration {

	private final Logger logger = Logger.getLogger(ShiroConfiguration.class);

	private final static String LOGIN_URL = "/user/login";
	private final static String SUCCESS_URL = "/user/success";
	private final static String UNAUTHORIZED_URL = "/user/fail";

	private String CONFIG_FILE_DEFAULT = "config/shiro-session-filter.xml";

	private Map<String, String> filterChainMap = new LinkedHashMap<String, String>();

	/**
	 * ShiroFilterFactoryBean 处理拦截资源文件问题。
	 * 注意：单独一个ShiroFilterFactoryBean配置是或报错的，因为在
	 * 初始化ShiroFilterFactoryBean的时候需要注入：SecurityManager
	 * 
	 * Filter Chain定义说明 1、一个URL可以配置多个Filter，使用逗号分隔 2、当设置多个过滤器时，全部验证通过，才视为通过
	 * 3、部分过滤器可指定参数，如perms，roles
	 * 
	 */
	@Bean
	public EhCacheManager getEhCacheManager() {
		EhCacheManager ehcacheManager = new EhCacheManager();
		ehcacheManager.setCacheManagerConfigFile("classpath:config/ehcache-shiro.xml");
		return ehcacheManager;
	}

	// 配置自定义的密码比较器
	@Bean(name = "credentialsMatcher")
	public CredentialsMatcher credentialsMatcher() {
		return new CredentialsMatcher();
	}

	// 配置自定义的权限登录器
	@Bean(name = "authRealm")
	public AuthRealm authRealm() {
		AuthRealm authRealm = new AuthRealm();
		authRealm.setCredentialsMatcher(credentialsMatcher());
		return authRealm;
	}

	@Bean(name = "lifecycleBeanPostProcessor")
	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

	@Bean
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
		creator.setProxyTargetClass(true);
		return creator;
	}

	// 配置核心安全事务管理器
	@Bean(name = "securityManager")
	public DefaultWebSecurityManager defaultWebSecurityManager(AuthRealm realm) {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		// 设置realm
		securityManager.setRealm(realm);
		securityManager.setCacheManager(getEhCacheManager());
		return securityManager;
	}

	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(
			DefaultWebSecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
		advisor.setSecurityManager(securityManager);
		return advisor;
	}

	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean shiroFilterFactoryBean(
			@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
		ShiroFilterFactoryBean factoryBean = new MyShiroFilterFactoryBean();
		// Map<String, Filter> filters = new HashMap<>();
		// filters.put("myFormAuthenticationFilter", new
		// MyFormAuthenticationFilter());
		// factoryBean.setFilters(filters);
		factoryBean.setSecurityManager(securityManager);
		// 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
		factoryBean.setLoginUrl(LOGIN_URL);
		// 登录成功后要跳转的连接
		factoryBean.setSuccessUrl(SUCCESS_URL);
		// 验证失败后的跳转链接
		factoryBean.setUnauthorizedUrl(UNAUTHORIZED_URL);
		// 初始化配置信息,主要加载不需要验证的url
		loadExcludesUrl();
		// 配置访问权限
		loadShiroFilterChain(factoryBean);
		logger.info("shiro拦截器工厂类注入成功");
		return factoryBean;
	}

	/**
	 * 加载ShiroFilter权限控制规则
	 */
	private void loadShiroFilterChain(ShiroFilterFactoryBean factoryBean) {
		/**
		 * anon：它对应的过滤器里面是空的,什么都没做,可以理解为不拦截
		 * authc：该过滤器下的页面必须验证后才能访问，它是Shiro内置的一个拦截器
		 * org.apache.shiro.web.filter.authc.FormAuthenticationFilter
		 */
		factoryBean.setFilterChainDefinitionMap(filterChainMap);
	}

	/**
	 * 初始化配置信息，主要加载排除拦截的pattern
	 */
	private void loadExcludesUrl() {
		try {
			Element element = getElement();
			// 读取不需要验证的url
			addPatternsByType(element, "anon");
			// 读取需要验证的url
			addPatternsByType(element, "authc");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}

	private void addPatternsByType(Element element, String type) {
		NodeList nodeList = element.getElementsByTagName(type + "s");
		if (nodeList == null)
			return;
		NodeList secondlist = nodeList.item(0).getChildNodes();
		if (null == secondlist || secondlist.getLength() <= 0)
			return;
		String logType = "未知配置";
		if ("anon".equals(type)) {
			logType = "不被验证";
		} else if ("authc".equals(type)) {
			logType = "需要验证";
		}
		logger.info("--------开始打印" + logType + "的url：--------");
		for (int i = 0; i < secondlist.getLength(); i++) {
			Node node = secondlist.item(i);
			if ("pattern".equals(node.getNodeName())) {
				logger.info(node.getTextContent());
				filterChainMap.put(node.getTextContent(), type);
			}
		}
		logger.info("--------" + logType + "的url打印完毕！--------");
	}

	private Element getElement() throws IOException, ParserConfigurationException, SAXException {
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = resolver.getResources("classpath:" + CONFIG_FILE_DEFAULT);
		InputStream is = resources[0].getInputStream();
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = builder.parse(is);
		Element element = doc.getDocumentElement();
		return element;
	}

}
