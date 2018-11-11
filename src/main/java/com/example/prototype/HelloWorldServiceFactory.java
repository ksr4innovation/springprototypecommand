package com.example.prototype;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class HelloWorldServiceFactory extends AbstractFactoryBean<HelloWorldService> {
	
	HelloWorldServiceFactory(){
		setSingleton(false);
	}

	@Override
	public Class<?> getObjectType() {
	
		return HelloWorldService.class;
	}

	@Override
	protected HelloWorldService createInstance() throws Exception {		
		return new HelloWorldService();
	}

}
