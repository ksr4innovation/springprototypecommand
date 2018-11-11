package com.example.prototype;

import org.springframework.stereotype.Service;

@Service
public class AppErrorLogHandler implements AppErrorHandler {

	@Override
	public void handle(Throwable t, ProfileContext context) {
		System.out.println("  AppErrorLogHandler  ");

	}

}
