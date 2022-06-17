package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		Student s=a.getBean("s",Student.class );
		s.Print();

		//Student s1=a.getBean("s1",Student.class );
		//s1.Print();

	}

}
