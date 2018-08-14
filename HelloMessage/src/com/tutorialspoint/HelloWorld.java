package com.tutorialspoint;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Message is :" + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void destroyBean() {
		System.out.println("Bean Destroyed");
	}
}
