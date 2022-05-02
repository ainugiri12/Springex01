package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	   public static void main(String[] args) {
	      ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
	      
	      HelloWorld obj1 = (HelloWorld) ctx.getBean("h1");
	      obj1.getMessage();
	      obj1.sum();
	      
	      HelloWorld obj2 = (HelloWorld) ctx.getBean("h2");
	      obj2.diff();
	      
	      HelloWorld obj3 = (HelloWorld) ctx.getBean("h3");
	    
	      obj3.mul();
	      
	      HelloWorld obj4 = (HelloWorld) ctx.getBean("h4");
	      obj4.div();
	      
	      HelloWorld obj5 = (HelloWorld) ctx.getBean("h5");
	      obj5.mod();
	      
	      HelloWorld obj6 = (HelloWorld) ctx.getBean("h6");
	      obj6.sum();
	      obj6.diff();
	      obj6.mul();
	      obj6.div();
	      obj6.mod();
	      
	      HelloWorld obj7 = (HelloWorld) ctx.getBean("h7");
	   }
	}
