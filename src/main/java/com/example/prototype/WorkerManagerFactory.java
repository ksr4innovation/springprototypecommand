package com.example.prototype;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class WorkerManagerFactory extends AbstractFactoryBean<WorkerManager> {

	
	
	WorkerManagerFactory(){
		setSingleton(false);
	}

	@Override
	public Class<?> getObjectType() {
	
		return HelloWorldService.class;
	}

	@Override
	protected WorkerManager createInstance() throws Exception {		
		return new WorkerManager();
	}

}
