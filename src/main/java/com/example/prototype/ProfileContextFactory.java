package com.example.prototype;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class ProfileContextFactory extends AbstractFactoryBean<ProfileContext> {
	
	public ProfileContextFactory(){
		setSingleton(false);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return ProfileContext.class;
	}

	@Override
	protected ProfileContext createInstance() throws Exception {
		// TODO Auto-generated method stub
		return new ProfileContext();
	}

}
