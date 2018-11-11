package com.example.prototype;

public class EmployeeNotFoundException extends RuntimeException {
	
	String msg;
	String code;
	EmployeeNotFoundException(String code,String msg){
		this.code = code;
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
