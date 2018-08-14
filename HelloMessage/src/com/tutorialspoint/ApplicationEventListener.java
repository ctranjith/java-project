package com.tutorialspoint;
import org.springframework.context.ApplicationEventPublisher;
//import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
//import org.springframework.context.event.ContextClosedEvent; 
//import org.springframework.context.event.ContextRefreshedEvent; 

public class ApplicationEventListener //implements ApplicationListener<ContextStartedEvent>
{
	public class ApplicationStartEventListener implements ApplicationEventPublisher {
		public void onApplicationEvent(ContextStartedEvent event) {
			System.out.println("Application Started Event Triggered");
		}

		@Override
		public void publishEvent(Object arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	/*
	public void onApplicationEvent(ContextClosedEvent event){
		System.out.println("Application Closed Event Triggered"); 
	}
	public void onApplicationRefreshEvent(ContextRefreshedEvent event){
		System.out.println("Application Refresh Event Triggered");
	}*/

}

