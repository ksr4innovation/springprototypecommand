package com.example.prototype;

public interface AppErrorHandler {
	
	void handle(Throwable t, ProfileContext context);

}
