package org.tnsif.ObjectInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tnsif.literals.SwiftEngine;

public class DIUsingObjects {

	public static void main(String[] args) {
		BeanFactory f=new ClassPathXmlApplicationContext("web.xml");
		Cellphone e=f.getBean("c2",Cellphone.class);
		e.accept();
	}

}
