package com.tutorialspoint;

//import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloMessage //implements BeanPostProcessor 
{
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

	public void initializeBean1() {
		System.out.println("Hello Bean Initialize Bean");
	}

	public void destroyBean1() {
		System.out.println("Hello Bean Destroyed");
	}

	public void initializeBean() {
		System.out.println("Inside Initialize Bean");
	}

	public void destroyBean() {
		System.out.println("Bean Destroyed");
	}

}