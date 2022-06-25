package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Student;

@SpringBootApplication
public class Springbootstarter11Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(Springbootstarter11Application.class, args);
		/*Student s=c.getBean(Student.class);*/
		Student s=new Student();
		s.display();
	}

}
