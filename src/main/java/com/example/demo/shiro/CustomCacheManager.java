package com.example.demo.shiro;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;

public class CustomCacheManager implements CacheManager {
	
	private Cache<String, AtomicInteger> passwordRetryCache;

	@SuppressWarnings("unchecked")
	@Override
	public Cache<String, AtomicInteger> getCache(String name) throws CacheException {
		// TODO Auto-generated method stub
		return passwordRetryCache;
	}

}
