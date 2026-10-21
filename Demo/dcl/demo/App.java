package org.dcl.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class App 
{
    public static void main( String[] args )
    {
        BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        
        /*student object*/
        
        /*1st way */
        Student s1 = bf.getBean(Student.class);
        System.out.println(s1);
        s1.learn();
        
        
        /*2nd way */
        Student s2 = (Student) bf.getBean("stu-bean");
        System.out.println(s2);
        s2.learn();
        
        
        System.out.println();
        
        /*Employee object*/ 
        
        /*1st way*/
        
        Employee e1 = bf.getBean(Employee.class);
        System.out.println(e1);
        e1.work();
        
        /*2nd way*/
        Employee e2 = (Employee) bf.getBean("emp-bean");
        System.out.println(e2);
        e2.work();
    }
}
