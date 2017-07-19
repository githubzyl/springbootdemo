package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
@PropertySource(value="classpath:/config/session-redis.properties")
public class RedisConfiguation{

	@Bean
	@ConfigurationProperties(prefix="redis.pool")
	public JedisPoolConfig getJedisPoolConfig(){
		return new JedisPoolConfig();
	}
	
	@Bean
	@ConfigurationProperties(prefix="redis")
	public JedisConnectionFactory getJedisConnectionFactory(JedisPoolConfig poolConfig){
		return new JedisConnectionFactory(poolConfig);
	}
	
	@Bean
	public RedisTemplate<?, ?> getRedisTemplate(JedisConnectionFactory connectionFactory){
		RedisTemplate<?, ?> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(connectionFactory);
		return redisTemplate;
	}
	
	
}
