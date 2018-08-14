package com.tutorialspoint;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
	public CustomEvent(Object Source) {
		super(Source);
	}
	
	public String toString()
	{
	return "Inside Custom Event";
	}
}
