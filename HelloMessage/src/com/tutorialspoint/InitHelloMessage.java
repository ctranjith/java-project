package com.tutorialspoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloMessage implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("Before Initialization : " + beanName);
		return bean; // you can return any other object as well
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("After Bean Initialization : " + beanName);
		return bean; // you can return any other object as well
	}

}
