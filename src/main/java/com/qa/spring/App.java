package com.qa.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.spring.beans.Customer;
import com.qa.spring.beans.Order;
import com.qa.spring.config.BeansConfig;

public class App 
{
    public static void main( String[] args )
    {
    	
    	/*
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Customer customer1 = context.getBean("customer1",Customer.class);
    	System.out.println(customer1);
    	Customer customer2 = context.getBean("customer2",Customer.class);
    	System.out.println(customer2);
    			
    	
    	Order order1 = context.getBean("order1", Order.class);
    	System.out.println(order1);
    	*/
    	
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(new Class[] {BeansConfig.class});
    	
    	Order order1 = context.getBean("order1",Order.class);
    	Order order1Dup = context.getBean("order1", Order.class);
    	System.out.println("is same object ref(singleton): " + (order1 == order1Dup) + "\n");
    	
    	Order order2 = context.getBean("order2", Order.class);
    	Order order2Dup = context.getBean("order2", Order.class);
    	System.out.println("is same object(proto): " + (order2 == order2Dup) + "\n");
    	
    	Customer customer1 = context.getBean("customer1", Customer.class);
    	System.out.println(customer1);
    	
    	
    	 
    }
}
