package com.example.prototype;

import org.springframework.stereotype.Service;

@Service
public class AppErrorRetryHandler implements AppErrorHandler {

	@Override
	public void handle(Throwable t, ProfileContext context) {
	
		for (int i = 0 ;i<10;i++) {
		
		System.out.println("  AppErrorRetryHandler  ");

		}
	}

}
