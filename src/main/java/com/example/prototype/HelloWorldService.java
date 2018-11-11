package com.example.prototype;

public class HelloWorldService {
	
	int i = 10;
	
	
	public HelloWorldService(){
	
		System.out.println("   HelloWorldService construcor "+i);
	}
	
	
	public void display() {

		System.out.println("   increment value "+i);
		i=i+10;
		System.out.println("   increment value "+i);
		
		
		
	}

}
