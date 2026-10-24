package org.dcl.spring.DI;

public class App1 
{
    public static void main( String[] args )
    {
        Car c1 = new Car();
        
        Engine e1 = new Engine();
        
        c1.engine = e1;
        
        
        System.out.println(c1);
        System.out.println(e1);
        System.out.println(c1.engine);
    }
}
