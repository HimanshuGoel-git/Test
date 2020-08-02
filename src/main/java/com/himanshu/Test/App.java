package com.himanshu.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext contxt =new ClassPathXmlApplicationContext("spring.xml");
    	
    	
    	Vehicle vec =(Vehicle)contxt.getBean("car");
    	vec.drive();
        System.out.println( "Hello World!" );
    }

	
}
