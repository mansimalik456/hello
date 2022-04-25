package com.springcoreconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext con = new ClassPathXmlApplicationContext("com/springcoreconstructor/personconfi.xml");
		 Person p = (Person) con.getBean("person");
	     System.out.println(p);       

	}

}
