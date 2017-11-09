package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloMessage obj = (HelloMessage) context.getBean("HelloMessage");
      obj.setMessage("First ");
      obj.setTestValue("Test Value");
      obj.getMessage();   
      //test comment
      HelloMessage obj2 = (HelloMessage) context.getBean("HelloMessage");
      obj2.getMessage();
      ((ClassPathXmlApplicationContext)context).close();
   }
}
