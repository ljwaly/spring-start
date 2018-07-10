package com.ljw.spring.start.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCacheManager {

	
	
	
	public static Map<String, Object> cacheMap = new ConcurrentHashMap<String, Object>();
	
	private String cacheName;
	
	
	public void init(){
		System.out.println("ljw_cacheMap_init:start");
		for (int i = 0; i < 100; i++) {
			cacheMap.put("key"+"i", i);
		}
	}


	public String getCacheName() {
		return cacheName;
	}


	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}
	
	
	
	
}
