package com.tns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		/*Airtal a=new Airtal();
		a.calling();
		a.data();
		
		Jio j=new Jio();
		a.calling();
		a.data();*/
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Airtal a=c.getBean(Airtal.class);
		Jio j=c.getBean(Jio.class);
		a.calling();
		a.data();
		j.calling();
		j.data();
		System.out.println("the Program is executed.....!");
	}

}
