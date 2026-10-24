package org.dcl.spring.DI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App2 {
	public static void main(String[] args) {
		
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		Car c1 = bf.getBean(Car.class);
		Engine e1 = bf.getBean(Engine.class);
		
		System.out.println(c1);
		System.out.println(e1);
		System.out.println(c1.engine);
		System.out.println(c1.getEngine());
	}
}
