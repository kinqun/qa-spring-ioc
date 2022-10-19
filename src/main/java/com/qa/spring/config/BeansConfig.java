package com.qa.spring.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.qa.spring.beans.Customer;
import com.qa.spring.beans.Order;

@Configuration

@ComponentScan(basePackages="com.qa.spring")
public class BeansConfig {
	
	
	@Bean(name="customer1", initMethod="init", destroyMethod = "del")
	@Lazy
	public Customer getCustomer() {
		return new Customer().builder().id(111).name("customer1").email("c1@gmail.com").contactNo("11111 111111").ordersList(Arrays.asList(getOrder(),getOrder2())).build();
	}
	
	@Bean(name="order1", initMethod="init")
	@Lazy
	//@Scope("prototype")
	public Order getOrder() {
		return new Order().builder().id(1111).customerId(111).orderValue(1234.45f).orderDate(new SimpleDateFormat("dd-MM-yyyy").format(new Date())).build();
	}
	
	@Bean(name="order2", initMethod = "init")
	@Lazy
	@Scope("prototype")
	public Order getOrder2() {
		return new Order().builder().id(2222).customerId(111).orderValue(456.78f).orderDate(new SimpleDateFormat("dd-MM-yyyy").format(new Date())).build();
	}
}
