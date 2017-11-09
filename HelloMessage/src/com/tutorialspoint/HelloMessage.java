package com.tutorialspoint;

public class HelloMessage {
	private String message;
	private String testValue;

	public void getMessage() {
		System.out.println("Message :" + message + testValue);
	}

	public void setTestValue(String testValue) {
		this.testValue = testValue;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
