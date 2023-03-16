package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// program to demonstrate on spring ioc
public class MobileExecutor {

	public static void main(String[] args) {
		/*Airtel a=new Airtel();
		a.call();
		a.message();+
		
		Jio j=new Jio();
		j.call();
		j.message();*/
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		/*
		Airtel a1=(Airtel)c.getBean("airtel");
		a1.call();
		a1.message();
		
		Jio a2=(Jio)c.getBean("jio");
		a2.call();
		a2.message();*/
		
		Sim s=c.getBean("sim",Sim.class);
		s.call();
		s.message();
		
		
	}

}
