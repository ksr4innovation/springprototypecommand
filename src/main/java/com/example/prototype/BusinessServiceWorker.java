package com.example.prototype;

import org.springframework.stereotype.Service;

@Service
public class BusinessServiceWorker extends Worker {
	
	

	
	public BusinessServiceWorker(AppErrorRetryHandler retryHandler) {
		super(retryHandler);
	
		
	}
	@Override
	protected void execute(ProfileContext context) {
		

	}

}
