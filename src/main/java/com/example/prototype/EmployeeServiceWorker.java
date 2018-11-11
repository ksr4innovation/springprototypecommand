package com.example.prototype;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceWorker extends Worker {
	
	EmployeeServiceWorker(AppErrorLogThrowHandler logthrowHandler) {
		super(logthrowHandler);
	
		
	}

	@Override
	protected void execute(ProfileContext context) {

		System.out.println("  From   EmployeeServiceWorker  ");
		
		context.setOutput(new EmployeeVO("srinu","STE"));
		
		//throw new EmployeeNotFoundException("EOO1","Employee not found");
	}

}
