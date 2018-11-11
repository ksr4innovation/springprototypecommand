package com.example.prototype;

public class EmployeeVO {
	
	String name;
	String desg;

	EmployeeVO(String name,String desg){
		this.name = name;
		this.desg = desg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}
	
}
