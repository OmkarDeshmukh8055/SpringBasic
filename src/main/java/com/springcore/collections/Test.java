package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
	
		Emp Emp1=(Emp)context.getBean("Emp1");
		System.out.println(Emp1.getName());
		System.out.println(Emp1.getPhones());
		System.out.println(Emp1.getAddresses());
		System.out.println(Emp1.getCourses());
		System.out.println(Emp1.getProps());
	}

}
