package edu.jspiders.explicitbeanwiring.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.explicitbeanwiring.bean.CPU;


public class Util {

	public static void main(String[] args) {
		
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		CPU cpu = context.getBean(CPU.class);
		
		System.out.println(cpu);
		
		// close the cotainer
		context.close();
	}
}
