package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.annotation.*; 

public class MainApp {
   public static void main(String[] args) {
	  
	  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      /*CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
      cvp.Publish();
      cvp.Publish();
      ((ClassPathXmlApplicationContext)context).close();
      */
      /*
      HelloMessage obj = (HelloMessage) context.getBean("HelloMessage");
      //obj.setMessage("First ");
      //obj.setTestValue("Test Value");
      System.out.println("Inside the Main Method");
      obj.getMessage();  
      ((ClassPathXmlApplicationContext)context).registerShutdownHook(); 
      ((ClassPathXmlApplicationContext)context).close();
      
      //test comment
      
      HelloMessage obj2 = (HelloMessage) context.getBean("HelloMessageChild");
      obj2.getMessage();
      
      ((ClassPathXmlApplicationContext)context).registerShutdownHook();
      ((ClassPathXmlApplicationContext)context).close(); 
      
	   /*
	   ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	   HelloWorld hw = context.getBean(HelloWorld.class);
	   hw.setMessage("Test Message for Hellow World");
	   hw.getMessage();
	   
	  ((AnnotationConfigApplicationContext) context).close();
	  */ 
	  PrintCustomers Pcustomers = (PrintCustomers) context.getBean("PrintCustomers");
	  Pcustomers.Print(); 
	  ((ClassPathXmlApplicationContext)context).registerShutdownHook(); 
      ((ClassPathXmlApplicationContext)context).close();
   }
   
  
}
