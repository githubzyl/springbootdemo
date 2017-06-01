package com.example.demo.config;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

/**
 * 数据库连接池&Mybatis配置类
 * 
 * @author Administrator
 *
 */
@Configuration
@MapperScan(basePackages = DruidConfiguation.MAPPER_PACKAGE, sqlSessionFactoryRef="sqlSessionFactory")
public class DruidConfiguation {
	
	private final Logger logger = Logger.getLogger(ShiroConfiguration.class);
	
	protected final static String MAPPER_PACKAGE = "com.example.demo.mapper";
	private final static String MAPPER_LOCATION = "classpath:mapper/*Mapper.xml";
	
	@Value("${druid.web.urlMappings}")
	private String urlMappings;
	
	@Value("${druid.web.loginUsername}")
	private String loginUsername;
	
	@Value("${druid.web.loginPassword}")
	private String loginPassword;
	
	@Value("${druid.web.allow}")
	private String allow;
	
	@Value("${druid.web.deny}")
	private String deny;
	
	@Value("${druid.web.resetEnable}")
	private String resetEnable;
	
	
	@Bean
	public ServletRegistrationBean statViewServle() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),
				new String[]{urlMappings});
		// 登录查看信息的账号密码.
		servletRegistrationBean.addInitParameter("loginUsername", loginUsername);
		servletRegistrationBean.addInitParameter("loginPassword", loginPassword);
		// 白名单：
		servletRegistrationBean.addInitParameter("allow", allow);
		// IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的即提示:Sorry, you are not
		// permitted to view this page.
		servletRegistrationBean.addInitParameter("deny", deny);
		// 是否能够重置数据.
		servletRegistrationBean.addInitParameter("resetEnable", resetEnable);
		return servletRegistrationBean;
	}

	@Bean
	public FilterRegistrationBean druidStatFilter() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
		// 添加过滤规则.
		filterRegistrationBean.addUrlPatterns("/*");
		// 添加不需要忽略的格式信息.
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		logger.info("druid数据源加载成功");
		return filterRegistrationBean;
	}

	@Bean
	PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	// 配置数据库的基本链接信息
	@Bean(name = "dataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource") // 可以在application.properties中直接导入
	public DataSource dataSource() {
		return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
	}

	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactoryBean sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver()
	                .getResources(DruidConfiguation.MAPPER_LOCATION));
		return bean;
	}

}
