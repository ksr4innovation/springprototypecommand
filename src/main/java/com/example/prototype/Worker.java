package com.example.prototype;

public abstract class Worker {
	
	protected abstract void execute(ProfileContext context);
	
	AppErrorHandler handler;
	
	Worker(AppErrorHandler handler){
		this.handler = handler;
	} 

	public AppErrorHandler getHandler() {
		return handler;
	}

	public void setHandler(AppErrorHandler handler) {
		this.handler = handler;
	}
	
	

}
