package com.tutorialspoint;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher Publisher) {
		this.publisher = Publisher;
	}

	public void Publish() {
		CustomEvent CE = new CustomEvent(this);
		publisher.publishEvent(CE);
	}

}
