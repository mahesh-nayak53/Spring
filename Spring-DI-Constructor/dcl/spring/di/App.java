package org.dcl.spring.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
        
    	BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	Human h1 = bf.getBean(Human.class);
    	Brain b1 = bf.getBean(Brain.class);
    	
    	System.out.println(h1);
    	System.out.println(b1);
    	System.out.println(h1.getBrain());
    }
}
