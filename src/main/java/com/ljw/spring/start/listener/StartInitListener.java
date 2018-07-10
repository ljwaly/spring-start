package com.ljw.spring.start.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartInitListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ljw_contextInitialized_init:start");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ljw_contextDestroyed:end");
		
	}

}
