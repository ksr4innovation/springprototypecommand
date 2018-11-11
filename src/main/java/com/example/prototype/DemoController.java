package com.example.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@Autowired
	ProfileContextFactory profileContextFactory ;
	
	@Autowired
	EmployeeServiceWorker employeeServiceWorker;
	
	@Autowired
	WorkerManagerFactory workerManagerFactory;
	
	@PostMapping(value="/demotest")
	public EmployeeVO demotest(@RequestBody String input) throws Exception {
		ProfileContext context = profileContextFactory.getObject();		
		context.setInput(input);
		
		WorkerManager manager = 	workerManagerFactory.getObject();
		
		manager.workerList.add(employeeServiceWorker);		
		
		manager.executeWorkers(context);
		
		EmployeeVO emp = (EmployeeVO)context.getOutput();
		return emp;
		
	}
}
