package com.qa.spring.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

//@Component
//@Lazy
public class Customer {
	private int id;
	private String name;
	private String email;
	private String contactNo;
	
	@Autowired
	//@Qualifier("order1")
	private List<Order> ordersList;
	
	public void init() {
		System.out.println("initialized customer bean...");
	}
	
	public void del() {
		System.out.println("destroy customer bean...");
	}
}
