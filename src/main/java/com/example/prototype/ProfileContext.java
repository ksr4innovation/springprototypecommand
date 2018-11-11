package com.example.prototype;

public class ProfileContext<I,O> {
	
	public I input;
	
	public O output;

	public I getInput() {
		return input;
	}

	public void setInput(I input) {
		this.input = input;
	}

	public O getOutput() {
		return output;
	}

	public void setOutput(O output) {
		this.output = output;
	}
	
	
	
	

}
