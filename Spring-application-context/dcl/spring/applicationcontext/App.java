package org.dcl.spring.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println("START");
       
       ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
       
       System.out.println("END");
       
       String s = "abcedefghi";
       
    }
}
    